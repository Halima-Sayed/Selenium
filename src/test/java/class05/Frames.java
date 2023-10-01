package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Frames extends CommonMethods {
    public static void main(String[] args) {

        String url = "https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);

        //task1: print baby cat on screen and select babycat from drop down


        // step1: as the webElement is inside an iframe
        //first we need to switch it
        driver.switchTo().frame(1);

        //find the WebElement animal
        WebElement animal=driver.findElement(By.xpath("//b[text()='Animals :']"));
        //animal.getTest() -> the text passed which is Animals :
        System.out.println(animal.getText());
        // select baby cat
        WebElement dd= driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(dd);
        sel.selectByVisibleText("Baby Cat");

        // switch the focus to the main page
        driver.switchTo().defaultContent();

        //switch to frane containing text box
        driver.switchTo().frame("frame1");
        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("abcdef");

        //click on the check box
        // switch to iframe using webelement method
       WebElement frame3= driver.findElement(By.xpath("//iframe[@id='frame3']"));
       driver.switchTo().frame(frame3);

       driver.findElement(By.id("a")).click();
    }
}
