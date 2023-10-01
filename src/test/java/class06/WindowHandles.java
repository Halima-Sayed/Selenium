package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowHandles extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://accounts.google.com/signup";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);

        //click on the help button and privacy button
        WebElement helpButton= driver.findElement(By.linkText("Help"));
        helpButton.click();

        WebElement privacyButton=driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyButton.click();

        // get the window handle of the main page and print on console
        //also save it for later use
        String mainPageHandle=driver.getWindowHandle();
        System.out.println("Main page handle is :"+mainPageHandle);

        //get all the window handles and print the titles associated with each window handle on the console commented:

        //get all the window handles
        //switch the focus of the driver to google help page
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle:allHandles){
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if(title.equalsIgnoreCase("Google Account Help")){
                break;
            }
           //System.out.println("the title associated with "+handle+" is :"+title);
        }
       // when the focus is shifted to correct page
        System.out.println("the current page under focus is : "+driver.getTitle());

        //after switching to the page google account help, we can deal with any element we want to in a

        //switch my focus back to main page

        driver.switchTo().window(mainPageHandle);
        //check focus
        System.out.println("The focus is on :"+driver.getTitle());
    }
}