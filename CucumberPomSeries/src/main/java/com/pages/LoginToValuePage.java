package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginToValuePage {

	private WebDriver driver;

	// 1. By Locators
	private By Value1 = By.id("lbl_val_1");
	private By Value2 = By.id("lbl_val_2");
	private By Value3 = By.id("lbl_val_3");
	private By Value4 = By.id("lbl_val_4");
	private By Value5 = By.id("lbl_val_5");
	private By textboxval1 = By.id("txt_val_1");
	private By textboxval2 = By.id("txt_val_2");
	private By textboxval3 = By.id("txt_val_3");
	private By textboxval4 = By.id("txt_val_4");
	private By textboxval5 = By.id("txt_val_5");
	private By TotalBal = By.id("lbl_ttl_val");
	private By textboxtotalval = By.id("txt_ttl_val");
	private By labels = By.xpath("//label[starts-with(@id,'lbl_val')]");
	private By textboxlistelements = By.xpath("//label[starts-with(@id,'txt_val')]");  
	
	
	// 2. Constructor of the page class:
	public LoginToValuePage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String ValuePageTitle() {
		return driver.getTitle();
	}

	public Boolean isvalue1Exist() {
		return driver.findElement(Value1).isDisplayed();
	}
	
	public Boolean isvalue2Exist() {
		return driver.findElement(Value2).isDisplayed();
		
	}	

	public Boolean isvalue3Exist() {
		return driver.findElement(Value3).isDisplayed();
	}	
	
	public Boolean isvalue4Exist() {
		return driver.findElement(Value4).isDisplayed();
	}	
	
	public Boolean isvalue5Exist() {
		return driver.findElement(Value5).isDisplayed();
	}	
	
	public Boolean istextbox1exist() {
		return driver.findElement(textboxval1).isDisplayed();
	}	
	
	public Boolean istextbox2exist() {
		return driver.findElement(textboxval2).isDisplayed();
	}	
	
	public Boolean istextbox3exist() {
		return driver.findElement(textboxval3).isDisplayed();
	}	
	
	public Boolean istextbox4exist() {
		return driver.findElement(textboxval4).isDisplayed();
	}	
	
	public Boolean istextbox5exist() {
		return driver.findElement(textboxval5).isDisplayed();
	}	
	
	
	public Boolean istotalbalexist() {
		return driver.findElement(TotalBal).isDisplayed();
	}	
	
	public Boolean istextboxtotalvalexist() {
		return driver.findElement(textboxtotalval).isDisplayed();
	}	
	
	public int LabelCount() {
		return driver.findElements(labels).size();
	}
	
	public String textbox1attribute() {
		return driver.findElement(textboxval1).getText();
	}

	public String textbox2attribute() {
		return driver.findElement(textboxval2).getText();
	}
	
	public String textbox3attribute() {
		return driver.findElement(textboxval3).getText();
	}
	
	public String textbox4attribute() {
		return driver.findElement(textboxval4).getText();
	}
	
	public String textbox5attribute() {
		return driver.findElement(textboxval5).getText();
		
	
			
	}
	
	public int textboxtotalvalue() {
	String ttlbal = driver.findElement(textboxtotalval).getText();
	int ttlbalint = Integer.parseInt(ttlbal);
	return ttlbalint;
	
	
	
		
	}	
	
	
	
	public  boolean greaterthanzero() {
		String textboxval = "textboxvalues";
		double textboxvaldouble = Double.parseDouble(textboxval);
		try {
			if(!textboxval.equals("") && textboxvaldouble > 0) {
			}
		}
		
		catch(NullPointerException e) {
			
		}
		
		catch (NumberFormatException exception) {
			
		}
		return true;	
			}
	
	public int sumoflistedvalue() {
		List<WebElement> element= driver.findElements(By.xpath("//label[starts-with(@id,'lbl_val')]"));
	     System.out.println(element.size());
	      int integerValue;
	      int sumValue=0;
	      for(int i=1;i<=element.size()-1;i++)
	      {
	         
	          WebElement textvalues= driver.findElement(By.xpath("textboxlistelements"));
	          String tableValue=textvalues.getText();
	          integerValue=Integer.parseInt(tableValue);
	          sumValue=sumValue+integerValue;         
	      }
	      System.out.println("Total Sum : "+sumValue);
	       
		return sumValue;  
		
		
			
	}
	
		
	public String formatcurrency(){
		
		     
	String val = driver.findElement(textboxval2).getAttribute("Value");
	return val;
		
		 
		
		
		
	}
		
	
		
		
	}
	
	

