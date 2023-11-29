
	package appiumProjects;
	import java.io.File;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.remote.MobileCapabilityType;
	public class operations {
	DesiredCapabilities caps = new DesiredCapabilities();
	AndroidDriver driver;

	@BeforeTest
	public void setUp() {
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "hadeel1");
	   
	  
	}

	 @Test()
	public void calculaterTest() throws MalformedURLException {
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		File CalculatorApp = new File("src/calculaterAPK/calculator.apk");
		caps.setCapability(MobileCapabilityType.APP, CalculatorApp.getAbsolutePath());
		//driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		List <WebElement> myButton= driver.findElements(By.className("android.widget.ImageButton"));
		 for(int i=0;i< myButton.size();i++) {
			 if(myButton.get(i).getAttribute("resource-id").contains("digit")) {
			 String s = myButton.get(i).getAttribute("resource-id");
			 //System.out.println(s);
			 String c=s.replaceAll("com.google.android.calculator:id/digit_","");
			//System.out.println(c);	
			 int d=Integer.parseInt(c);
			 if(d%2==0) {
			 myButton.get(i).click();
			 
			 }
		 }}		
		
		 
		
	}


	@AfterTest
	public void mybeforeTest() {}

	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


