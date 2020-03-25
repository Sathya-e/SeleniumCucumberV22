package StepDefinition;

import cucumber.api.java.en.*;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.SyncFailedException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class stepDefinition {
    WebDriver driver;

    @Given("^user launch in chrome browser$")
    public void user_launch_in_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    @When("^user enters the URL$")
    public void user_enters_the_URL() {
        driver.get("https://www.irctc.co.in/nget/train-search");
    }

    @Then("^user should able to launch the application$")
    public void user_should_able_to_launch_the_application() {
        System.out.println("Launched application successfully..");
    }

    @And("^verify the title of the page$")
    public void verify_the_title_of_the_page() {
        String Title = driver.getTitle();
        String expected = "IRCTC Next Generation eTicketing System";
        Assert.assertEquals(Title, expected);
    }

    @And("^accept the alert$")
    public void accept_the_alert() {
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        //driver.switchTo().alert().accept();
    }

    @Then("^Leave the From Station empty$")
    public void leave_the_From_Station_empty() {
        driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("");
    }

    @Then("^Enter valid data in To Station field$")
    public void enter_valid_data_in_remaining_fields() {
        // Enter data in "To Station"
        driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys("Chennai Egmore - MS");
    }

    @Then("Enter invalid data {string} in the From Station")
    public void enter_invalid_data_in_the_From_Station(String invalidData) {
        driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys(invalidData);
    }

    @Then("Enter valid city {string} in the To Staion")
    public void enter_valid_city_in_the_To_Staion(String ValidCity) {
        driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys(ValidCity);

    }

    @Then("Enter valid data in From Station {string} and To Station {string}.")
    public void enter_valid_data_in_From_Station_and_To_Station(String From_ValidCity, String To_ValidCity) {
        driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys(From_ValidCity);
        driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys(To_ValidCity);
    }

    @Then("Enter valid data in the From Station {string} and invalid data in To Station {string}")
    public void enter_valid_data_in_the_From_Station_and_invalid_data_in_To_Station(String From_ValidCity, String To_InValidCity) {
        driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys(From_ValidCity);
        driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys(To_InValidCity);
    }

    // To pick the date from Calendar:
    @And("user picks the valid date from the Calendar")
    public void userPicksTheValidDateFromTheCalendar() throws InterruptedException {
        driver.findElement(By.xpath("(//span[contains(@class,'ui-button-icon-left ui-clickable')])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-year ng-tns-c12-5')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[contains(@class,'ui-datepicker-header ui-widget-header')]//a)[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div#divMain>div>app-main-page>div>div>div>div>div>div>div>app-jp-input>div:nth-of-type(3)>form>div:nth-of-type(3)>p-calendar>span>div>table>tbody>tr:nth-of-type(4)>td:nth-of-type(6)>a")).click();
        Thread.sleep(2000);
    }
        /* String month = "2020";
           String Day = "24";
           while (true) {
           String text = driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-year ng-tns-c12-5')]")).getText();
           System.out.println("month and year in Calendar:" +text);
           if (text.matches(month)) {
                break;
            } else {
                Thread.sleep(3000);
                driver.findElement(By.xpath("(//div[contains(@class,'ui-datepicker-header ui-widget-header')]//a)[2]")).click();
            }
        }
        driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[1]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/table/tbody[contains(text(),"+Day+")]")).click();
        } */


    //To select the class from dropdown
    //   WebElement Source = driver.findElement(By.xpath("//label[text()='All Classes']"));
    //   Select dropdown = new Select(Source);
    //   int num = dropdown.getOptions().size();


    // List<WebElement> dropdown = Option.getOptions();
    //Option.selectByValue(num-1);
/*}
{
        for(WebElement eachOption:dropdown)
        {
        if(eachOption=="Sleeper Class")
        }
        } */

    // int num = Option.getOptions().size();
    // Option.selectByIndex(num-1);
    @And("^select the Find trains button to view the Booking train List Page$")
    public void selectTheFindTrainsButtonToViewTheBookingTrainListPage() {
        driver.findElement(By.xpath("//button[text()='Find trains']")).click();
    }

    @Then("^Close the Browser$")
    public void close_Browser() {
        driver.quit();
    }
}
