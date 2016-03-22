package gov.goias.agrodefesa.utils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.logging.Logger;

public class BrowserDriver {
    private static final Logger LOGGER = Logger.getLogger(BrowserDriver.class.getName());
    private static WebDriver mDriver;
    private static Scenario scenario;

    public synchronized static WebDriver getCurrentDriver() {
        if (mDriver == null) {
            try {
                mDriver = BrowserFactory.getBrowser();
            } catch (UnreachableBrowserException e) {
                mDriver = BrowserFactory.getBrowser();
            } catch (WebDriverException e) {
                mDriver = BrowserFactory.getBrowser();
            } finally {
                Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            }
        }
        return mDriver;
    }

    public static void close() {
        try {
            getCurrentDriver().quit();
            mDriver = null;
            LOGGER.info("closing the browser");
        } catch (UnreachableBrowserException e) {
            LOGGER.info("cannot close browser: unreachable browser");
        }
    }

    private static class BrowserCleanup implements Runnable {
        public void run() {
            close();
        }
    }

    public static void loadPage(String url) {
        getCurrentDriver();
        LOGGER.info("Directing browser to:" + url);
        LOGGER.info("try to loadPage [" + url + "]");
        getCurrentDriver().get(url);
    }

    public static void reopenAndLoadPage(String url) {
        mDriver = null;
        getCurrentDriver();
        loadPage(url);
    }

    public static WebElement waitForElement(WebElement elementToWaitFor) {
        return waitForElement(elementToWaitFor, null);
    }

    public static WebElement waitForElement(WebElement elementToWaitFor, Integer waitTimeInSeconds) {
        if (waitTimeInSeconds == null) {
            waitTimeInSeconds = 10;
        }

        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), waitTimeInSeconds);
        return wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
    }

    public static WebElement getParent(WebElement element) {
        return element.findElement(By.xpath(".."));
    }

    public static boolean isElementPresent(By locator){
        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), 10);
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return webElement != null;
    }

    public static void waitForElementIsNotPresent(By locator){
        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static boolean isElementPresent(String ID){
        return (getCurrentDriver().findElements(By.id(ID)).size() > 0);
    }

    public static List<WebElement> getDropDownOptions(WebElement webElement) {
        Select select = new Select(webElement);
        return select.getOptions();
    }

    public static void selectByVisibleText(WebElement webElement, String value) {
        Select select = new Select(webElement);
        select.selectByVisibleText(value);
    }

    @Deprecated
    public static WebElement getDropDownOption(WebElement webElement, String value) {
        WebElement option = null;
        List<WebElement> options = getDropDownOptions(webElement);
        for (WebElement element : options) {
            if (element.getText().equalsIgnoreCase(value)) {
                option = element;
                break;
            }
/*
            if (element.getAttribute("value").equalsIgnoreCase(value)) {
                option = element;
                break;
            }
*/
        }
        return option;
    }

    public static void closeAlert() {
        getCurrentDriver().switchTo().alert().accept();
    }

    @After()
    public void after(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) getCurrentDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
    }

    @Before
    public void before(Scenario scenario) {
        BrowserDriver.scenario = scenario;
    }

    public static void screenshot() {
        final byte[] screenshot = ((TakesScreenshot) getCurrentDriver())
                .getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }

    //Selenium Webdriver - Selecting an item in a tree node
    //driver.findElements(By.xpath("//span[text()='Child Item One']"))
}

