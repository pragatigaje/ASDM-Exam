package com.pragati;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	ChromeDriver driver;
	
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\SDM Exam\\lib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
	}
	
	public void signUp() throws InterruptedException
	{
		driver.findElement(By.id("signupbtn_topnav")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign Up For Free")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("EmailInput_input_field__6t4Ux")).sendKeys("pragatigaje@gmail.com");
		driver.findElement(By.name("new-password")).sendKeys("LabExam#0202");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div[1]/div/div[5]/div[1]/button")).click();
		driver.findElement(By.cssSelector("#modal_first_name")).sendKeys("Pragati");
		driver.findElement(By.cssSelector("#modal_last_name")).sendKeys("Gaje");
		driver.findElement(By.tagName("button")).click();
	}
	
	public void login()
	{
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.className("EmailInput_input_field__6t4Ux")).sendKeys("pragatigaje@gmail.com");
		driver.findElement(By.className("PasswordInput_input_field__EWMIU")).sendKeys("LabExam#0202");
		driver.findElement(By.partialLinkText("Log")).click();
	}
	public void search() throws InterruptedException
	{
		driver.findElement(By.id("search2")).sendKeys("Javascript");
		driver.findElement(By.id("learntocode_searchbtn")).click();
		//Thread.sleep(5000);
	}
	public void getTitle()
	{
		System.out.println("Webpage Title : "+driver.getTitle());
	}
	public void close()
	{
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		Q1 q = new Q1();
		q.open();
		q.signUp();
		q.search();
		q.getTitle();
		q.close();
	}

}
