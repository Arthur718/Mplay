package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Test1 extends Base {


    @Test

    public void Login(){

        LogInB logInB =new LogInB(driver);
        logInB.goToLoginPage();

        delay(1000);

        LoginSend loginSend= new LoginSend(driver);
        loginSend.loginS("arthur777@gmail.com","arthur777");

        logInB.veryfy();
        delay(2000);

        List<WebElement> productname = driver.findElements(By.xpath("//div[@id='products']"));
        for (WebElement element : productname) {

            System.out.println(element.getText());
            
        }




    }

}
