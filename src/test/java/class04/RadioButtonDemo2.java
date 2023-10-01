package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class RadioButtonDemo2 extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/basic-radiobutton-demo.php","chrome");

        //get ALL the radio buttons associated with age group using
        //driver.fndElements
        List<WebElement>ageGroup=driver.findElements(By.xpath("//input[@name='ageGroup']"));

        //you need to select the option specified by the user
        String option="0 - 5";
        for(WebElement age:ageGroup){
           String value=age.getAttribute("value");
            if(value.equals(option)){
                age.click();
                break; //don't need to iterate further if clicked on the right one
            }
        }
    }
}
