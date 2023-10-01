package class05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement alertButton=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alertButton.click();
        Thread.sleep(2000);

        //switch the focus of the driver from the main page to the alert
        //Alert interface
        Alert confirmationAlert1=driver.switchTo().alert();
        confirmationAlert1.accept();

        //find the other alert button
        WebElement alertButton2= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alertButton2.click();
        //to observe
        Thread.sleep(2000);

        Alert confirmationAlert2=driver.switchTo().alert();
        confirmationAlert2.dismiss();
    }
}
