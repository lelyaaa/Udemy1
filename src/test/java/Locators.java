import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/leilakim/SoftwareInstalled/chromedriver");
        WebDriver driver = new ChromeDriver();
        //IMPLICIT WAIT - 5 sec wait (timeout)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
        //if in the value assigned to the particular attribute has "-" between the words, it means this is the same class
        //if in the value assigned to the particular attribute has "(space) " between the words, it means this is different classes

        //CSS Selector                                      ....... in the CONSOLE to search need to use $('p.error')
        // Class Name > tagname.classname > Button.signInBtn
        //Id > tagname#id > input#inputUsername     Syntax: //Tagname[@attribute='value']

        //Xpath Syntax: Input[placeholder='Username']        ...... in the CONSOLE to search need to use $x('//input[@placeholder="Name"]')
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Kim");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("kim@test.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("888-888-8888");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Kim");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxTwo")).click();
        // In CSS "*" after attribute means this letters contains (in the example "pass") in this particular attribute value
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    }
}
