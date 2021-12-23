package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class StepDefinition {
    WebDriver driver;

    @Given("^User open browser And Enter Url$")
    public void user_open_browser_And_Enter_Url() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }


    @Then("^User click on Register button\\(link\\)$")
    public void user_click_on_Register_button_link() {
        driver.findElement(By.className("ico-register")).click();
    }

    @Then("^User is on registration page and Verify the Register page Title$")
    public void user_is_on_registration_page_and_Verify_the_Register_page_Title() {
        String hptitle = driver.getTitle();
        System.out.println(hptitle);
        Assert.assertEquals("nopCommerce demo store. Register", hptitle);
    }

    @Then("^User select Male/Female accordingly for gender$")
    public void user_select_Male_Female_accordingly_for_gender() {
        driver.findElement(By.id("gender-female")).click();
    }

    @Then("^User Enter \"([^\"]*)\" and \"([^\"]*)\" as FirstName and Last Name accordingly$")
    public void user_Enter_and_as_FirstName_and_Last_Name_accordingly(String firstname, String lastname) {

        driver.findElement(By.id("FirstName")).sendKeys(firstname);
        driver.findElement(By.id("LastName")).sendKeys(lastname);
    }

    @Then("^User Enter \"([^\"]*)\" for Day$")
    public void user_Enter_for_Day(String Day)  {
        driver.findElement(By.name("DateOfBirthDay")).sendKeys(Day);
    }

    @Then("^User Enter \"([^\"]*)\" for Month$")
    public void user_Enter_for_Month(String Month)  {
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys(Month);
    }

    @Then("^User Enter \"([^\"]*)\" for Year$")
    public void user_Enter_for_Year(String Year)  {
        driver.findElement(By.name("DateOfBirthYear")).sendKeys(Year);
    }

    @Then("^User Enter \"([^\"]*)\" as Email$")
    public void user_Enter_as_Email(String email)  {
        driver.findElement(By.id("Email")).sendKeys(email);
    }

    @Then("^User Enter \"([^\"]*)\" for Company Name$")
    public void user_Enter_for_Company_Name(String cname)  {
        driver.findElement(By.id("Company")).sendKeys(cname);
    }

    @Then("^User Enter \"([^\"]*)\" for Password$")
    public void user_Enter_for_Password(String pwd)  {
        driver.findElement(By.id("Password")).sendKeys(pwd);
    }

    @When("^User Enter \"([^\"]*)\" for confirm password field And Click on Register$")
    public void user_Enter_for_confirm_password_field_And_Click_on_Register(String cpwd)  {
           driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
           driver.findElement(By.id("register-button")).click();
    }

    @Then("^User should receive \"([^\"]*)\" message$")
    public void user_should_receive_message(String arg1)  {

    }




}
