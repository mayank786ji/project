package care.project;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class first {
	
		public static void main(String args[]) throws InterruptedException{
			
			System.setProperty( "webdriver.chrome.driver", ".\\lib\\chromedriver.exe" );

			WebDriver driver = new ChromeDriver();
			
			// it will open goolge on google chrome
			driver.get("https://www.naukri.com/");
			
			// will fetch the title so that we can come to know that page is loaded
			String title = driver.getTitle();
			System.out.println("Title of the page is"+title);
			
			//// will fetch the URL 
			String url = driver.getCurrentUrl();
			System.out.println("URL of the page is"+url);
			
			driver.navigate().to("https://www.google.co.in/");
			
			// java will wait for 5 sec
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			Thread.sleep(2000);
			
			driver.navigate().forward();
			
			// close the current browser and also close any all pop up 
			driver.quit();
			
			
		}
	}

		

	
