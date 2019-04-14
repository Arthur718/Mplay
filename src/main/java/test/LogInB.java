package test;

import FtestBase.FtestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInB extends FtestBase {
    protected WebDriver driver= null;
    public  LogInB( WebDriver driver){
        this.driver=driver;
    }

    public void goToLoginPage () {


        //WebElement login = driver.findElement(d);

        //WebElement login = driver.findElement(By.xpath("//li[@id='link-to-login']"));
        //login.click();
    }
    public  void  veryfy (){




        WebElement logut = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]"));


        Assert.assertEquals("Logout",logut.getText());
    }




}

