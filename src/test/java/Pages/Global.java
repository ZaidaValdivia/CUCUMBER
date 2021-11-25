package Pages;

import Util.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Global extends BasePage{

    public void loadPage(){
        System.setProperty("webdriver.chrome.driver", "/Users/HP/Desktop/Chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    public void loginAsCustomer() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text() = 'Customer Login']")).click();
        driver.findElement(By.id("userSelect")).click();
        driver.findElement(By.xpath("//option[text() = 'Harry Potter']")).click();
        driver.findElement(By.xpath("//button[text() = 'Login']")).click();
    }

    public void displayAccount() throws InterruptedException {
        Thread.sleep(3000);
        String id= driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[1]")).getAttribute("class");
        Assert.assertEquals(id, "btn btn-lg tab");
    }

    public void deposit(){
        driver. findElement(By.xpath("//button[contains(text(),'Deposit')]")).click();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("750");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void confirmDeposit(){
        String id= driver.findElement(By.xpath("//span[text()='Deposit Successful']")).getAttribute("class");
        Assert.assertEquals(id, "error ng-binding");
    }

    public void withdrawn() throws InterruptedException {
        Thread.sleep(1000);
        driver. findElement(By.xpath("//button[contains(text(),'Withdrawl')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("400");
        driver.findElement(By.xpath("//button[text()='Withdraw']")).click();
    }
    public void confirmWithdrawn(){
        String id= driver.findElement(By.xpath("//span[text()='Transaction successful']")).getAttribute("class");
        Assert.assertEquals(id, "error ng-binding");
    }

    public void clickTransactions(){
        driver.findElement(By.xpath("//button[contains(text(),'Transactions')]")).click();
    }

    public void checkTransactions(){
        String text= driver.findElement(By.xpath("//*[@class='ng-binding' and text()='750']")).getAttribute("class");
        Assert.assertEquals(text, "ng-binding");
    }

    public void logoutCustomer(){
        driver.findElement(By.xpath("//button[text()='Logout']")).click();
        driver.findElement(By.xpath("//button[text()='Home']")).click();
    }

    public void displayHome(){
        String text= driver.findElement(By.xpath("//*//button[text() = 'Customer Login']")).getAttribute("class");
        Assert.assertEquals(text, "btn btn-primary btn-lg");
    }

    public void loginManager(){
        driver.findElement(By.xpath("//button[text() = 'Bank Manager Login']")).click();
    }

    public void displayManagerAccount() throws InterruptedException {
        Thread.sleep(3000);
        String text= driver.findElement(By.xpath("//button[text() = 'Add Customer']")).getAttribute("class");
        Assert.assertEquals(text, "btn btn-lg tab btn-primary");
    }

    public void addCustomer() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text() = 'Add Customer']")).click();
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Juana");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Perez");
        driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("48000");
        driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
    }

    public void confirmMessageAdd(){

    }

    public void quit(){
        //driver.quit();
        driver.close();
    }

}
