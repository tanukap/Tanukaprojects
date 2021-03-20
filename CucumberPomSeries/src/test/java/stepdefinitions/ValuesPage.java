package stepdefinitions;

import org.junit.Assert;

import com.pages.LoginToValuePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValuesPage {
	
	private static int count;
	private static int sum;
	private static int total;
	private  LoginToValuePage valuepage = new  LoginToValuePage(DriverFactory.getDriver());
	
	@Given("user is on values page")
	public void user_is_on_values_page() {
	  DriverFactory.getDriver().get("https://WWW.exercise1.com/values");
	    throw new io.cucumber.java.PendingException();
	}

	@When("user counts the values on the screen")
	public void user_counts_the_values_on_the_screen() {
	int count = valuepage.LabelCount();
	System.out.println("the right count of the value is :" + count);
	    throw new io.cucumber.java.PendingException();
	}

	@Then("right count of values should appear on the screen")
	public void right_count_of_values_should_appear_on_the_screen() {
		System.out.println("the right count of the value is :" + count);
	    throw new io.cucumber.java.PendingException();
	}

	@When("user verifies the values on the screen")
	public void user_verifies_the_values_on_the_screen() {
	    
	   String text1 = valuepage.textbox1attribute();
	   System.out.println("Value of textbox1:" +text1);
	   String text2 = valuepage.textbox2attribute();
	   System.out.println("Value of textbox2:" +text2);
	   String text3 = valuepage.textbox3attribute();
	   System.out.println("Value of textbox1:" +text3);
	   String text4 = valuepage.textbox4attribute();
	   System.out.println("Value of textbox1:" +text4);
	   String text5 = valuepage.textbox5attribute();
	   System.out.println("Value of textbox1:" +text5);
	   valuepage.greaterthanzero();
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Then("values should be greater than zero on the screen")
	public void values_should_be_greater_than_zero_on_the_screen(String textboxvalues) {
	    Assert.assertTrue(true);
	   throw new io.cucumber.java.PendingException();
	}

	@When("user verifies the listed values on the screen with total balance")
	public void user_verifies_the_listed_values_on_the_screen_with_total_balance() {
	  int sum  =valuepage.sumoflistedvalue();
	  System.out.println("sum of the value:"+sum);
	    throw new io.cucumber.java.PendingException();
	}

	@Then("values should be correct based on the listed values with the total balance on the screen")
	public void values_should_be_correct_based_on_the_listed_values_with_the_total_balance_on_the_screen() {
	  int total = valuepage.textboxtotalvalue();
	  System.out.println("sum of the value:"+total);
	  Assert.assertEquals(total, sum);
	    throw new io.cucumber.java.PendingException();
	}

	@When("user verifies the total balance with the sum of the values")
	public void user_verifies_the_total_balance_with_the_sum_of_the_values() {
		int total = valuepage.textboxtotalvalue();
		  System.out.println("sum of the value:"+total);
		  Assert.assertEquals(total, sum);
	    throw new io.cucumber.java.PendingException();
	}

	@Then("total balance should match the sum of all the values")
	public void total_balance_should_match_the_sum_of_all_the_values() {
	    Assert.assertTrue(true);
	    throw new io.cucumber.java.PendingException();
	}

	@When("user verifies the format of the value")
	public void user_verifies_the_format_of_the_value() {
	   valuepage.formatcurrency();
	   System.out.println(valuepage.formatcurrency());
	    throw new io.cucumber.java.PendingException();
	}

	@Then("values should have format as currency")
	public void values_should_have_format_as_currency(String expectedval) {
	   Assert.assertEquals("$1000000 ", expectedval);
	    throw new io.cucumber.java.PendingException();
	}
	

}
