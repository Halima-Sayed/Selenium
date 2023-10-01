package class09;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClickActions extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url ="http://demo.guru99.com/test/simple_context_menu.html";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //find the element to be right click
        WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));

        //Actions class
        Actions action=new Actions(driver);
        //perform the right click
        //right click is also called contextClick
        action.contextClick(rightClick).perform();

        //find the element which is edit
        WebElement editClick= driver.findElement(By.xpath("//span[text()='Edit']"));
        action.click(editClick).perform();

        //on clicking edit alert appears
        //in order to handle the alert
        Alert alert=driver.switchTo().alert();
        alert.accept();


        //find the webElement to double click on
        WebElement doubleClick=driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
        action.doubleClick(doubleClick).perform();
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
    }
}
