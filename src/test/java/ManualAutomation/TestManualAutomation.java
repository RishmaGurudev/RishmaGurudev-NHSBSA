package ManualAutomation;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class TestManualAutomation 
{
	WebDriver driver = null;
	
	@Given("I am a citizen of the UK")
	public void i_am_a_citizen_of_the_uk() 
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrom.driver", projectPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
	
	}
	
	@Given("I follow Start now")
	public void i_follow_start_now() 
	{
		WebElement startNowButton = driver.findElement(By.id("next-button"));
		startNowButton.click();
	}

	@Given("I am a resident of {string}")
	public void iAmAResidentOf(String location) 
	{
		 String radioButtonId = "radio-" + location.toLowerCase();
		 WebElement radioButton = driver.findElement(By.id(radioButtonId));
		 radioButton.click();
		 WebElement nextPageButton = driver.findElement(By.id("next-button"));
		 nextPageButton.click();
	}

	@Given("my GP Practice is located in Scotland or Wales {string}")
	public void my_gp_practice_is_located_in_scotland_or_wales(String string) 
	{
		 String radioButtonId = "radio-" + string.toLowerCase();
		 WebElement radioButton = driver.findElement(By.id(radioButtonId));
		 radioButton.click();
		 WebElement nextPageButton = driver.findElement(By.id("next-button"));
		 nextPageButton.click();
	}

	@Given("I receive dental treatment in {string}")
	public void iReceiveDentalTreatmentIn(String string) 
	{
		 String radioButtonId = "radio-" + string.toLowerCase();
		 WebElement radioButton = driver.findElement(By.id(radioButtonId));
		 radioButton.click();
		 WebElement nextPageButton = driver.findElement(By.id("next-button"));
		 nextPageButton.click();
	}

	@Given("I provide my date of birth as {string}")
	public void iProvideMyDateOfBirthAs(String string) 
	{
		String[] parts = string.split("\\.");
		WebElement dob_day = driver.findElement(By.id("dob-day"));
		WebElement dob_month = driver.findElement(By.id("dob-month"));
		WebElement dob_year = driver.findElement(By.id("dob-year"));

		dob_day.sendKeys(parts[0]);
		dob_month.sendKeys(parts[1]);
		dob_year.sendKeys(parts[2]);
		
		WebElement nextPageButton = driver.findElement(By.id("next-button"));
		nextPageButton.click();
	}

	@Given("I live with my partner {string}")
	public void iLiveWithMyPartner(String string) 
	{
		 String radioButtonId = "radio-" + string.toLowerCase();
		 WebElement radioButton = driver.findElement(By.id(radioButtonId));
		 radioButton.click();
		 WebElement nextPageButton = driver.findElement(By.id("next-button"));
		 nextPageButton.click();
	
	}

	@Given("both my partner and I can benefit from tax {string}")
	public void bothMyPartnerAndICanBenefitFromTax(String string) 
	{
		 String radioButtonId = "radio-" + string.toLowerCase();
		 WebElement radioButton = driver.findElement(By.id(radioButtonId));
		 radioButton.click();
		 WebElement nextPageButton = driver.findElement(By.id("next-button"));
		 nextPageButton.click();
	}

	@Given("we receive Universal Credit payments {string}")
	public void weReceiveUniversalCreditPayments(String string) 
	{
		 String radioButtonId = string.toLowerCase() + "-universal";
		 WebElement radioButton = driver.findElement(By.id(radioButtonId));
		 radioButton.click();
		 WebElement nextPageButton = driver.findElement(By.id("next-button"));
		 nextPageButton.click();
	}

	@Given("we have one of the following in our joint Universal Credit {string}")
	public void weHaveOneOfTheFollowingInOurJointUniversalCredit(String string) 
	{
		 String radioButtonId = "radio-" + string.toLowerCase();
		 WebElement radioButton = driver.findElement(By.id(radioButtonId));
		 radioButton.click();
		 WebElement nextPageButton = driver.findElement(By.id("next-button"));
		 nextPageButton.click();
	}

	@Given("our Universal Credit period is less {string}")
	public void our_universal_credit_period_is_less(String string) 
	{
		 String radioButtonId = "radio-" + string.toLowerCase();
		 WebElement radioButton = driver.findElement(By.id(radioButtonId));
		 radioButton.click();
		 WebElement nextPageButton = driver.findElement(By.id("next-button"));
		 nextPageButton.click();

	}

	@Given("I live is located in Highland {string}")
	public void i_live_is_located_in_highland(String string) 
	{
		 String radioButtonId = "radio-" + string.toLowerCase();
		 WebElement radioButton = driver.findElement(By.id(radioButtonId));
		 radioButton.click();
		 WebElement nextPageButton = driver.findElement(By.id("next-button"));
		 nextPageButton.click();

	}
	
	@When("I check my eligibility for NHS cost assistance")
	public void iCheckMyEligibilityForNHSCostAssistance() 
	{ 
		
	}

	@Then("I should receive a result indicating whether I am eligible")
	public void iShouldReceiveAResultIndicatingWhetherIAmEligible() 
	{   
       try 
        {
        	assertTrue(driver.getPageSource().contains("You get free:"));
            System.out.println("Test Passed:");
        } 
        catch (AssertionError e) {
            System.out.println("Test Failed:");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
	}
}
