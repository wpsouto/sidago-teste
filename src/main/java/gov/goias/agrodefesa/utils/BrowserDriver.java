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

public class BrowserDriver {
    private static final Logger log = LoggerFactory.getLogger(BrowserDriver.class);
    private static WebDriver mDriver;
    private static Scenario scenario;
    private static final int WAIT_TIME_IN_SECONDS = 20;

    public synchronized static WebDriver getCurrentDriver() {
        if (mDriver == null) {
            try {
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

/*
    public static void reopenAndLoadPage(String url) {
        mDriver = null;
        getCurrentDriver();
        loadPage(url);
    }
*/

    public static WebElement waitForElement(WebElement elementToWaitFor) {
        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), WAIT_TIME_IN_SECONDS);
        return wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));

    }

    public static void waitFor(Integer waitTimeInSeconds) {
        try {
            Thread.sleep(waitTimeInSeconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void executeScript(String script, Object... args) {
        JavascriptExecutor js =(JavascriptExecutor) BrowserDriver.getCurrentDriver();
        js.executeScript(script, args);
    }

    public static void scrollTo(WebElement webElement) {
        executeScript("window.scrollTo(0,"+webElement.getLocation().y + ")");
    }

    public static void scrollTop() {
        executeScript("scroll(250, 0)");
    }

    public static void scrollDown() {
        Actions actions = new Actions(getCurrentDriver());
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
    }

    public static void waitForText(WebElement elementToWaitFor, String value) {
        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), WAIT_TIME_IN_SECONDS);
        wait.until(ExpectedConditions.textToBePresentInElement(elementToWaitFor, value));
    }

    public static WebElement waitForClickable(WebElement elementToWaitFor) {
        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), WAIT_TIME_IN_SECONDS);
        return wait.until(ExpectedConditions.elementToBeClickable(elementToWaitFor));

    }

/*    public static WebElement getParent(WebElement element) {
        return element.findElement(By.xpath(".."));
    }*/

    public static boolean isElementPresent(String ID){
        return (getCurrentDriver().findElements(By.id(ID)).size() > 0);
    }

    public static void waitForElementIsNotPresent(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), WAIT_TIME_IN_SECONDS);
        wait.until((WebDriver webDriver) -> {
            try {
                if(webElement.isDisplayed()) {
                    return false;
                }
            } catch (Exception var5) {
                return true;
            }
            return true;
        });
    }

    public static void selectByVisibleText(WebElement webElement, String value) {
        Select select = new Select(webElement);
        select.selectByVisibleText(value);
    }

    public static void waitForSelectByVisibleText(WebElement webElement, String value) {
        waitForSelectOptions(webElement);
        selectByVisibleText(webElement, value);
    }

    public static void selectByIndex(WebElement webElement, int value) {
        Select select = new Select(webElement);
        select.selectByIndex(value);
    }

    public static void waitForSelectByIndex(WebElement webElement, int index) {
        waitForSelectOptions(webElement);
        selectByIndex(webElement, index);
    }

    private static void waitForSelectOptions(WebElement webElement) {
        Select select = new Select(webElement);

        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), WAIT_TIME_IN_SECONDS);
        wait.until((WebDriver webDriver) -> select.getOptions().size() > 1);
    }

    public static void changeDisplay(WebElement webElement) {
        JavascriptExecutor executor =  ((JavascriptExecutor) BrowserDriver.getCurrentDriver());
        String js = "arguments[0].style.display ='block';";
        executor.executeScript(js, webElement);
    }

    public static void uploadFile(WebElement webElement) {
        changeDisplay(webElement);
        webElement.sendKeys(FileUtils.getFileFromResource("upload.pdf").getPath());
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

