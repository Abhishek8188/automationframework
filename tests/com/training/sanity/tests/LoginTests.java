package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.readexcel.ReadExcel;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		//driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		//driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	

	@DataProvider(name="TestData")
	public Object[][] getData()
	{
		
	String[][] result = new ReadExcel().getExcelData("D:\\TestSample2.xls", "Sheet1");

	
	return result;
	}
	
	
	@Test(dataProvider="TestData")
	public void user(String username,String password,String id){
		
		//loginPOM.clickLoginBtn(); 
		//loginPOM.clickLogin(); 
		//loginPOM.sendUserName(username);
		//loginPOM.sendPassword(password);
		System.out.println(username);
		System.out.println(password);
		System.out.println(id);
		
		

	}
	

	
	
	
	
	
	
	
	
	
	
}
