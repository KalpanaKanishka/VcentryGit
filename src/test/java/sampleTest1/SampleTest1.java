package sampleTest1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest1 {
	@Test
	public void loginTest() throws IOException, InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver(); 
		wd.manage().window().maximize();
		TimeUnit seconds;
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.google.com/");
		//WebElement logo=wd.findElement(By.xpath("/html/body/div[1]/div[2]/div/a/img"));
		
		Thread.sleep(2000);
//webdriver, webelement,takescreenshot,outputtype
		
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
FileHandler.copy(src, new File("C:\\vcentryWorkspace\\batch167\\jenkissampleproject\\screenshot\\jenkin.jpg"));
	}
	}


