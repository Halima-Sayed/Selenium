package class09;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url ="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        //press the login button
        WebElement loginIn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",loginIn);

        //to take the screenshot
        //declare instance
        TakesScreenshot ts=(TakesScreenshot)driver;

        //take screenshot as output type FILE
        File screenShot=ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenShot,new File("C:\\Users\\Halim\\OneDrive\\Desktop\\SeleniumSdet\\screenshot\\testSyntax1.png"));

    }
}
