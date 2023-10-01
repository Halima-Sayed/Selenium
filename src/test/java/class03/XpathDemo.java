package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        //instance of the webDriver
        WebDriver driver=new ChromeDriver();

        //driver.get to navigate to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //maximize screen
        driver.manage().window().maximize();

        //userName text box through xpath
        WebElement userName=driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");

        // password box through xpath
        WebElement password= driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        //login button using contain we can use of the letters there are in the value of id
        WebElement loginButton=driver.findElement(By.xpath("//input[contains(@id,'Login')]"));
        loginButton.click();

        //after logging in, click on the pimTab
        WebElement pimTab=driver.findElement(By.xpath("(//a[@id='menu_pim_viewPimModule'])"));
        pimTab.click();

        //

    }
}
