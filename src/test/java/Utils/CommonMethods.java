package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CommonMethods {

    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url, String browser){
        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;

            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
        //maximize the screen
        driver.manage().window().maximize();
        //navigate to the url
        driver.get(url);
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }




    public static void closeBrowser(){
        if(driver!=null) {
            driver.quit();
        }
    }

    public static void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);
    }
    public  static void takeScreenShot(String fileName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File ss = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss,new File(System.getProperty("user.dir")+"/screenshot/"+fileName+".png"));


    }
}
