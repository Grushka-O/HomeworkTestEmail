package HomeworkEmailTest;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class EmailTest {
    static WebDriver driver;

    @BeforeClass
    public static void beforeMethod(){
    driver = new ChromeDriver();
    }


    @Test
    public void testMethod() throws InterruptedException {

              //зайти
        driver.get("http://gmail.com/");
        driver.findElement(By.cssSelector("input.whsOnd")).clear();
        driver.findElement(By.cssSelector("input.whsOnd")).sendKeys("YOUR EMAIL");
        driver.findElement(By.cssSelector("span.RveJvd")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input.whsOnd")).clear();
        driver.findElement(By.cssSelector("input.whsOnd")).sendKeys("YOUR PASSWORD");
        driver.findElement(By.cssSelector("span.RveJvd")).click();
        Thread.sleep(3000);

             //отправить
        driver.findElement(By.cssSelector("div.z0>div.T-I")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//textarea[@class=\"vO\"][1]")).clear();
        driver.findElement(By.xpath("//textarea[@class=\"vO\"][1]")).sendKeys("ANY EMAIL");
        driver.findElement(By.xpath("//input[@class=\"aoT\"]")).clear();
        driver.findElement(By.xpath("//input[@class=\"aoT\"]")).sendKeys("SomeText");
        driver.findElement(By.cssSelector("div.Am")).clear();
        driver.findElement(By.cssSelector("div.Am")).sendKeys("SomeText");
        driver.findElement(By.cssSelector("div.aoO")).click();
        Thread.sleep(5000);

            //проверить
        driver.findElement(By.cssSelector("div.aHS-bnu>div>span")).click();
        Thread.sleep(1000);

        List<WebElement> elements = driver.findElements(By.cssSelector("div.y6>span"));
         for (WebElement el : elements) {
             String span = el.findElement(By.cssSelector("span")).getText();
             System.out.println(span);

             //сначала хотела так искать, но оно не работает
//        if (span == "SomeText") {
//            System.out.println("Email was sent!");}
//        else {
//            System.out.println("No email");
//        }
        }
    }

    @AfterClass
    public static void AfterMethod(){
        driver.quit();
    }


}







