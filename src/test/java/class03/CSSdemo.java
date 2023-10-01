package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        //click on create new account
        WebElement createNewAccount= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

        //because the DOM doesn't have the first name by default
        //it only shows up after clicking on create new account
        //and the code takes some time to appear in DOM for first name
        //so we must add a sleep here
        Thread.sleep(2000);

        //enter first name
        WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Barney");

        //close the popup
        WebElement closeThePopUp= driver.findElement(By.cssSelector("img[src$='Gm8t.png']"));
        closeThePopUp.click();

    }
}
