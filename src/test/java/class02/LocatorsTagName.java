package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsTagName {
    public static void main(String[] args) {
        // navigate to amazon.com
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //maximize
        driver.manage().window().maximize();
        // get all the links from amazon.com and print them on the console
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        //traverse
        for(WebElement link:allLinks){
            String linkOfWebsite=link.getAttribute("href");
            System.out.println(linkOfWebsite);
        }
    }
}
