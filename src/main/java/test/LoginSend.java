package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSend {
     protected WebDriver driver=null;
     public LoginSend(WebDriver driver){

         this.driver=driver;
     }



    public  void loginS (String email , String password){

        WebElement emailTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/p[1]/input[1]"));

        emailTextBox.sendKeys(email);
        WebElement passwordTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/input[1]"));
        passwordTextBox.sendKeys(password);



        WebElement loginButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/p[2]/input[1]"));
        loginButton.click();




    }




}
