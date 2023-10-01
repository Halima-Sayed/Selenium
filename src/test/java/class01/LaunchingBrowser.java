package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        /**
         * task:
         * navigate to google.com
         */
        //declare the instance
        WebDriver driver = new ChromeDriver();
        //use .get(url) to navigate to the desired url
        driver.get("https://www.google.com");
        //maximize the window
        driver.manage().window().maximize();
        //get the current url
        String currentURL=driver.getCurrentUrl();
        // print on the console
        System.out.println("The current url of the website is "+currentURL);
        // get the title of the page
        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);
        // add some wait time
        Thread.sleep(5000);
        // close te web browser
        driver.quit();
    }
}

