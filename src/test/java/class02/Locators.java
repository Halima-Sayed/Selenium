package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        //declare instance
        WebDriver driver=new ChromeDriver();
        //navigate to the HRMS
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        //maximize
        driver.manage().window().maximize();
        //find the element
        WebElement userNameTextBox=driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("Admin");
        //line 20 is the same as line 17 and 18
        //   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //after sending the username to the textBox clear the text box
        //slow down
        Thread.sleep(2000);
        userNameTextBox.clear();
        //sending the username again
        userNameTextBox.sendKeys("Admin");
        //find the password
        WebElement pass=driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");
        //find the login button
        WebElement loginBtn=driver.findElement(By.className("button"));
        loginBtn.click();
        //get the welcome message
        WebElement message=driver.findElement(By.linkText("Welcome Admin"));
        String text=message.getText();
        System.out.println(text);
        //find partial link text
       driver.findElement(By.partialLinkText("Recru")).click();

    }
}
