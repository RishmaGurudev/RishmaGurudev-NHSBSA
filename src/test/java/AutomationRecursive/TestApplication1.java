package AutomationRecursive;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestApplication1 
{
	WebDriver driver = null;

	@Given("I am a citizen of the UK")
	public void i_am_a_citizen_of_the_uk() 
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrom.driver", projectPath);
		driver = new ChromeDriver();
	}

	@When("I put my circumstances into the Checker tool")
	public void i_put_my_circumstances_into_the_checker_tool() 
	{
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		WebElement checkButton = driver.findElement(By.id("next-button"));
		checkButton.click();
		testAllCombinations(driver,"");
	}


	public static void testAllCombinations(WebDriver driver, String selectionPath) 
	{
		if (selectionPath.isEmpty()) 
		{
			selectionPath = "Start -> ";
		}

		List<Map<String, String>> optionsAndPages = createOptionsAndPages();
		if (selectionPath.split(" -> ").length == optionsAndPages.size()) 
		{
			System.out.println("Combination: " + selectionPath);
			return;
		}
		Map<String, String> optionMap = optionsAndPages.get(selectionPath.split(" -> ").length-1);

		for (Map.Entry<String, String> entry : optionMap.entrySet()) 
		{	

			WebElement radioButton = driver.findElement(By.id(entry.getKey()));
			radioButton.click();
			String currentSelectionPath = selectionPath + entry.getKey() + " -> ";
			WebElement nextPageButton = driver.findElement(By.id("next-button"));
			if (nextPageButton.isDisplayed()) 
			{   
				nextPageButton.click();
			}
			testAllCombinations(driver, currentSelectionPath);
			driver.navigate().back();
		}
	}
	private static List<Map<String, String>> createOptionsAndPages()
	{
		List<Map<String, String>> optionsAndPages = new ArrayList<>();

		Map<String, String> page1Options = new HashMap<>();
		page1Options.put("radio-england", "Page2");
		page1Options.put("radio-scotland", "Page3");
		page1Options.put("radio-wales", "Page4");
		optionsAndPages.add(page1Options);

		Map<String, String> page2Options = new HashMap<>();
		page2Options.put("radio-yes", "Page6");
		page2Options.put("radio-no", "Page7");
		optionsAndPages.add(page2Options);

		Map<String, String> page4Options = new HashMap<>();
		page4Options.put("radio-england", "Page12");
		page4Options.put("radio-scotland", "Page13");
		page4Options.put("radio-wales", "Page14");
		page4Options.put("radio-ni", "Page15");
		page4Options.put("radio-not-registered", "Page16");
		optionsAndPages.add(page4Options);

		Map<String, String> page3Options = new HashMap<>();
		page3Options.put("radio-yes", "Page6");
		page3Options.put("radio-no", "Page7");
		optionsAndPages.add(page3Options);
		return optionsAndPages;
	}


	@Then("I should get a result of whether I will get help or not")
	public void i_should_get_a_result_of_whether_i_will_get_help_or_not() 
	{

	}

}
