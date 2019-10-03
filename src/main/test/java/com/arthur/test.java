package com.arthur;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    WebDriver driver= null;



    @Test
    public void Test(){

        ChromeDriverManager.chromedriver().setup();
        driver= new ChromeDriver();


        driver.get("https://www.lyft.com/rider");

        driver.close();
        driver.quit();




    }




}
