package rashi.tatocjs;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FrameDungeon {
	static WebDriver driver=BrowserDetail.driver;
	public static JavascriptExecutor js = BrowserDetail.js;
	 	
		/*public static String  click_without_repaint(){
			return driver.findElement(By.cssSelector("body > div > div.page > span")).getText();
		    
		}*/
		
public static String proceed_after_repaint(){
	 
	String color1= (String) js.executeScript(" return document.getElementById('main').contentWindow.document.querySelector('#answer').getAttribute('class');");
		System.out.println(color1);
		 String color2= (String) js.executeScript(" return document.getElementById('main').contentWindow.document.getElementById('child').contentWindow.document.querySelector('#answer').getAttribute('class');");
		 System.out.println(color1+"  "+color2);
		 
		 while(true){
			WebElement element = (WebElement) js.executeScript("return document.getElementById('main').contentWindow.document.getElementsByTagName('a')[0].click()");
			 color2= (String) js.executeScript(" return document.getElementById('main').contentWindow.document.getElementById('child').contentWindow.document.querySelector('#answer').getAttribute('class');");

			 if(color1.equals(color2)){
				System.out.println("Color 1===="+color1);
				//System.out.println("Color 2===="+color2);
				System.out.println("Color 2===="+color2);
			  js.executeScript("document.getElementById('main').contentWindow.document.getElementsByTagName('a')[1].click();");

				 break;
			
}}
		 return driver.getTitle();
}
		 }



	