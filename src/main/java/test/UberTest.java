package test;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UberTest extends Base {

    private By pickup = By.name("pickup");
    private By destination=By.name("destination");



    @Test

    public void Utest (){

        driver.get("https://www.uber.com/us/en/price-estimate/");

       // WebElement pickup = driver.findElement(By.name("pickup"));
        //Actions SendPickup = new Actions(driver);
        //Actions Send = SendPickup.sendKeys(pickup,"19 Cronish street , Staten Island New York 10308");
        //SendPickup.click();
        //Send.perform();
        //driver.switchTo().frame(pickup);
        //WebElement textbox = driver.findElement(pickup);
        //textbox.sendKeys("19 odessa");


        //pickup.sendKeys("19 odessa drve,Ale");
        //System.out.println(pickup.getText());


        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated((pickup)));
        WebElement done = driver.findElement(pickup);
        done.sendKeys("19 cornish st,staten island ");
       delay(2000);





        Actions actions= new Actions(driver);
        Actions actions1=actions.sendKeys(Keys.ENTER);
        //Actions actions2=actions.sendKeys(Keys.ENTER);
        //Actions actions3=actions.sendKeys(Keys.ENTER);



        actions1.perform();
        //actions2.perform();
        //actions3.perform();
       WebDriverWait wait1 =new WebDriverWait(driver,10);
       wait1.until(ExpectedConditions.presenceOfElementLocated(destination));
       WebElement done1 =driver.findElement(destination);
       done1.sendKeys("220 Riverside blvd");
       delay(2000);
       Actions actions2= new Actions(driver);
       Actions actions3= actions2.sendKeys(Keys.ENTER);
       actions3.perform();








        //List<WebElement> list = By.tagName("ul").findElements(driver);
        //System.out.println("Auto Suggest List ::" + list.size());

        /*for (WebElement item:list) {
            String text = item.getText();
            {
                text.equals(pickup.getText());

            }

        } */

        /*for(int i = 0 ;i< list.size();i++)
        {
            //System.out.println(list.get(i).getText());

            if(list.get(i).getText().equals("19 Cornish Street,Staten Island ,New York"))
            {
                list.get(i).click();
                break;
            }
        }
*/
     delay(10000);





        //pickup.sendKeys(Keys.ENTER);
        //delay(2000);
        //WebElement dropOff = driver.findElement(By.xpath("//input[@placeholder='Enter destination']"));

        // dropOff.sendKeys("St. George Ferry Terminal, 1 Bay St, Staten Island, NY");
        //dropOff.sendKeys(Keys.ENTER);
        //delay(3000);
        //WebElement pool = driver.findElement(By.xpath("//li[contains(text(),'Pool')]"));
        //pool.getText();
        //delay(4000);




    }

    @Test

    public void Utest2 (){

        driver.get("https://www.uber.com/us/en/price-estimate/");

        // WebElement pickup = driver.findElement(By.name("pickup"));
        //Actions SendPickup = new Actions(driver);
        //Actions Send = SendPickup.sendKeys(pickup,"19 Cronish street , Staten Island New York 10308");
        //SendPickup.click();
        //Send.perform();
        //driver.switchTo().frame(pickup);
        //WebElement textbox = driver.findElement(pickup);
        //textbox.sendKeys("19 odessa");


        //pickup.sendKeys("19 odessa drve,Ale");
        //System.out.println(pickup.getText());


        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated((pickup)));
        WebElement done = driver.findElement(pickup);
        done.sendKeys("19 cornish st,staten island ");
        delay(2000);





        Actions actions= new Actions(driver);
        Actions actions1=actions.sendKeys(Keys.ENTER);
        //Actions actions2=actions.sendKeys(Keys.ENTER);
        //Actions actions3=actions.sendKeys(Keys.ENTER);



        actions1.perform();
        //actions2.perform();
        //actions3.perform();
        WebDriverWait wait1 =new WebDriverWait(driver,10);
        wait1.until(ExpectedConditions.presenceOfElementLocated(destination));
        WebElement done1 =driver.findElement(destination);
        done1.sendKeys("220 Riverside blvd");
        delay(2000);
        Actions actions2= new Actions(driver);
        Actions actions3= actions2.sendKeys(Keys.ENTER);
        actions3.perform();








        //List<WebElement> list = By.tagName("ul").findElements(driver);
        //System.out.println("Auto Suggest List ::" + list.size());

        /*for (WebElement item:list) {
            String text = item.getText();
            {
                text.equals(pickup.getText());

            }

        } */

        /*for(int i = 0 ;i< list.size();i++)
        {
            //System.out.println(list.get(i).getText());

            if(list.get(i).getText().equals("19 Cornish Street,Staten Island ,New York"))
            {
                list.get(i).click();
                break;
            }
        }
*/
        delay(10000);





        //pickup.sendKeys(Keys.ENTER);
        //delay(2000);
        //WebElement dropOff = driver.findElement(By.xpath("//input[@placeholder='Enter destination']"));

        // dropOff.sendKeys("St. George Ferry Terminal, 1 Bay St, Staten Island, NY");
        //dropOff.sendKeys(Keys.ENTER);
        //delay(3000);
        //WebElement pool = driver.findElement(By.xpath("//li[contains(text(),'Pool')]"));
        //pool.getText();
        //delay(4000);




    }
    @Test

    public void Utest3 (){

        driver.get("https://www.uber.com/us/en/price-estimate/");

        // WebElement pickup = driver.findElement(By.name("pickup"));
        //Actions SendPickup = new Actions(driver);
        //Actions Send = SendPickup.sendKeys(pickup,"19 Cronish street , Staten Island New York 10308");
        //SendPickup.click();
        //Send.perform();
        //driver.switchTo().frame(pickup);
        //WebElement textbox = driver.findElement(pickup);
        //textbox.sendKeys("19 odessa");


        //pickup.sendKeys("19 odessa drve,Ale");
        //System.out.println(pickup.getText());


        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated((pickup)));
        WebElement done = driver.findElement(pickup);
        done.sendKeys("19 cornish st,staten island ");
        delay(2000);





        Actions actions= new Actions(driver);
        Actions actions1=actions.sendKeys(Keys.ENTER);
        //Actions actions2=actions.sendKeys(Keys.ENTER);
        //Actions actions3=actions.sendKeys(Keys.ENTER);



        actions1.perform();
        //actions2.perform();
        //actions3.perform();
        WebDriverWait wait1 =new WebDriverWait(driver,10);
        wait1.until(ExpectedConditions.presenceOfElementLocated(destination));
        WebElement done1 =driver.findElement(destination);
        done1.sendKeys("220 Riverside blvd");
        delay(2000);
        Actions actions2= new Actions(driver);
        Actions actions3= actions2.sendKeys(Keys.ENTER);
        actions3.perform();








        //List<WebElement> list = By.tagName("ul").findElements(driver);
        //System.out.println("Auto Suggest List ::" + list.size());

        /*for (WebElement item:list) {
            String text = item.getText();
            {
                text.equals(pickup.getText());

            }

        } */

        /*for(int i = 0 ;i< list.size();i++)
        {
            //System.out.println(list.get(i).getText());

            if(list.get(i).getText().equals("19 Cornish Street,Staten Island ,New York"))
            {
                list.get(i).click();
                break;
            }
        }
*/
        delay(10000);





        //pickup.sendKeys(Keys.ENTER);
        //delay(2000);
        //WebElement dropOff = driver.findElement(By.xpath("//input[@placeholder='Enter destination']"));

        // dropOff.sendKeys("St. George Ferry Terminal, 1 Bay St, Staten Island, NY");
        //dropOff.sendKeys(Keys.ENTER);
        //delay(3000);
        //WebElement pool = driver.findElement(By.xpath("//li[contains(text(),'Pool')]"));
        //pool.getText();
        //delay(4000);




    }
    @Test

    public void Utest4 (){

        driver.get("https://www.uber.com/us/en/price-estimate/");

        // WebElement pickup = driver.findElement(By.name("pickup"));
        //Actions SendPickup = new Actions(driver);
        //Actions Send = SendPickup.sendKeys(pickup,"19 Cronish street , Staten Island New York 10308");
        //SendPickup.click();
        //Send.perform();
        //driver.switchTo().frame(pickup);
        //WebElement textbox = driver.findElement(pickup);
        //textbox.sendKeys("19 odessa");


        //pickup.sendKeys("19 odessa drve,Ale");
        //System.out.println(pickup.getText());


        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated((pickup)));
        WebElement done = driver.findElement(pickup);
        done.sendKeys("19 cornish st,staten island ");
        delay(2000);





        Actions actions= new Actions(driver);
        Actions actions1=actions.sendKeys(Keys.ENTER);
        //Actions actions2=actions.sendKeys(Keys.ENTER);
        //Actions actions3=actions.sendKeys(Keys.ENTER);



        actions1.perform();
        //actions2.perform();
        //actions3.perform();
        WebDriverWait wait1 =new WebDriverWait(driver,10);
        wait1.until(ExpectedConditions.presenceOfElementLocated(destination));
        WebElement done1 =driver.findElement(destination);
        done1.sendKeys("220 Riverside blvd");
        delay(2000);
        Actions actions2= new Actions(driver);
        Actions actions3= actions2.sendKeys(Keys.ENTER);
        actions3.perform();








        //List<WebElement> list = By.tagName("ul").findElements(driver);
        //System.out.println("Auto Suggest List ::" + list.size());

        /*for (WebElement item:list) {
            String text = item.getText();
            {
                text.equals(pickup.getText());

            }

        } */

        /*for(int i = 0 ;i< list.size();i++)
        {
            //System.out.println(list.get(i).getText());

            if(list.get(i).getText().equals("19 Cornish Street,Staten Island ,New York"))
            {
                list.get(i).click();
                break;
            }
        }
*/
        delay(10000);





        //pickup.sendKeys(Keys.ENTER);
        //delay(2000);
        //WebElement dropOff = driver.findElement(By.xpath("//input[@placeholder='Enter destination']"));

        // dropOff.sendKeys("St. George Ferry Terminal, 1 Bay St, Staten Island, NY");
        //dropOff.sendKeys(Keys.ENTER);
        //delay(3000);
        //WebElement pool = driver.findElement(By.xpath("//li[contains(text(),'Pool')]"));
        //pool.getText();
        //delay(4000);




    }

    @Test

    public void Utest5 (){

        driver.get("https://www.uber.com/us/en/price-estimate/");

        // WebElement pickup = driver.findElement(By.name("pickup"));
        //Actions SendPickup = new Actions(driver);
        //Actions Send = SendPickup.sendKeys(pickup,"19 Cronish street , Staten Island New York 10308");
        //SendPickup.click();
        //Send.perform();
        //driver.switchTo().frame(pickup);
        //WebElement textbox = driver.findElement(pickup);
        //textbox.sendKeys("19 odessa");


        //pickup.sendKeys("19 odessa drve,Ale");
        //System.out.println(pickup.getText());


        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated((pickup)));
        WebElement done = driver.findElement(pickup);
        done.sendKeys("19 cornish st,staten island ");
        delay(2000);





        Actions actions= new Actions(driver);
        Actions actions1=actions.sendKeys(Keys.ENTER);
        //Actions actions2=actions.sendKeys(Keys.ENTER);
        //Actions actions3=actions.sendKeys(Keys.ENTER);



        actions1.perform();
        //actions2.perform();
        //actions3.perform();
        WebDriverWait wait1 =new WebDriverWait(driver,10);
        wait1.until(ExpectedConditions.presenceOfElementLocated(destination));
        WebElement done1 =driver.findElement(destination);
        done1.sendKeys("220 Riverside blvd");
        delay(2000);
        Actions actions2= new Actions(driver);
        Actions actions3= actions2.sendKeys(Keys.ENTER);
        actions3.perform();








        //List<WebElement> list = By.tagName("ul").findElements(driver);
        //System.out.println("Auto Suggest List ::" + list.size());

        /*for (WebElement item:list) {
            String text = item.getText();
            {
                text.equals(pickup.getText());

            }

        } */

        /*for(int i = 0 ;i< list.size();i++)
        {
            //System.out.println(list.get(i).getText());

            if(list.get(i).getText().equals("19 Cornish Street,Staten Island ,New York"))
            {
                list.get(i).click();
                break;
            }
        }
*/
        delay(10000);





        //pickup.sendKeys(Keys.ENTER);
        //delay(2000);
        //WebElement dropOff = driver.findElement(By.xpath("//input[@placeholder='Enter destination']"));

        // dropOff.sendKeys("St. George Ferry Terminal, 1 Bay St, Staten Island, NY");
        //dropOff.sendKeys(Keys.ENTER);
        //delay(3000);
        //WebElement pool = driver.findElement(By.xpath("//li[contains(text(),'Pool')]"));
        //pool.getText();
        //delay(4000);




    }
}

