package review03;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://jqueryui.com/droppable/", "chrome");


        //as the element is inside an iframe so first we need to switch focus
        driver.switchTo().frame(0);
        //find the draggable WebElement
        WebElement draggable=driver.findElement(By.id("draggable"));
        //find the element where you want to drop
        WebElement droppable=driver.findElement(By.id("droppable"));

        Actions action=new Actions(driver);
        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
    }
}
