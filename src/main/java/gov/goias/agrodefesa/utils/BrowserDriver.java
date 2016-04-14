package gov.goias.agrodefesa.utils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class BrowserDriver {
    private static final Logger log = LoggerFactory.getLogger(BrowserDriver.class);
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
            log.debug("Fechando o Browser");
        } catch (UnreachableBrowserException e) {
            log.debug("Browser não fechado: unreachable browser");
        }
    }

    private static class BrowserCleanup implements Runnable {
        public void run() {
            close();
        }
    }

    public static void loadPage(String url) {
        getCurrentDriver();
        log.debug("Direcionando o Browser para {}", url);
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

    public static void waitFor(Integer waitTimeInSeconds) {
        try {
            Thread.sleep(waitTimeInSeconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollUp() {
        JavascriptExecutor executor =  ((JavascriptExecutor) getCurrentDriver());
        executor.executeScript("scroll(250, 0)");
    }

    public static void scrollDown() {
        Actions actions = new Actions(getCurrentDriver());
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
    }

    public static void scroll(WebElement element){
        JavascriptExecutor js =(JavascriptExecutor)getCurrentDriver();
        js.executeScript("window.scrollTo(0,"+(element.getLocation().y-200)+")");

    }
    public static void waitForValue(WebElement elementToWaitFor, String value) {
        waitForValue(elementToWaitFor, value, 10);
    }

    public static void waitForValue(WebElement elementToWaitFor, String value, Integer waitTimeInSeconds) {
        if (waitTimeInSeconds == null) {
            waitTimeInSeconds = 10;
        }

        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), waitTimeInSeconds);
        wait.until(ExpectedConditions.textToBePresentInElementValue(elementToWaitFor, value));
    }

    public static WebElement waitForClickable(WebElement elementToWaitFor) {
        return waitForClickable(elementToWaitFor, 10);
    }

    public static WebElement waitForClickable(WebElement elementToWaitFor, Integer waitTimeInSeconds) {
        if (waitTimeInSeconds == null) {
            waitTimeInSeconds = 10;
        }

        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), waitTimeInSeconds);
        return wait.until(ExpectedConditions.elementToBeClickable(elementToWaitFor));
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

    public static boolean isElementPresent(String ID){
        return (getCurrentDriver().findElements(By.id(ID)).size() > 0);
    }

    public static void waitForElementIsNotPresent(By locator){
        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static List<WebElement> getDropDownOptions(WebElement webElement) {
        Select select = new Select(webElement);
        return select.getOptions();
    }

    public static void selectByVisibleText(WebElement webElement, String value) {
        Select select = new Select(webElement);
        select.selectByVisibleText(value);
    }

    public static void selectByIndex(WebElement webElement, int value) {
        Select select = new Select(webElement);
        select.selectByIndex(value);
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
}

