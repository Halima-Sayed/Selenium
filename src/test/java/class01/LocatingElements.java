package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        // instance
        WebDriver driver=new ChromeDriver();
        // facebook.com
        driver.get("https://www.facebook.com/");
        // maximize
        driver.manage().window().maximize(); //<- make this a habit
        // send some text in the email
        //find the element                 . send some text
        driver.findElement(By.id("email")).sendKeys("sleepy@gmail.com");
        // send some text to the password fields
        driver.findElement(By.name("pass")).sendKeys("secretePassword1");
        // print the url on console
        String url=driver.getCurrentUrl();
        System.out.println(url);
        // print the title on the console
        String title=driver.getTitle();
        System.out.println(title);
        // confirm that the title is "Facebook - log in or sign up"
        if (title.equals( "Facebook - log in or sign up")){
            System.out.println("The title is correct");
        }else {
            System.out.println("The title is incorrect");
        }
        // quit
        driver.quit();

    }
}
