package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Page {

    @FindBy(id="ssn")
    private WebElement ssnField;

    @FindBy(id="gender")
    private WebElement genderField;

    @FindBy(id="weight")
    private WebElement weightField;

    @FindBy(id="length")
    private WebElement lengthField;

    @FindBy(id="register")
    private WebElement registerButton;

    public RegisterPage (WebDriver driver) {
        super(driver);
        this.driver.get(getPath()+"?command=SignUp");
    }

    public void setSSN(String ssn) {
        ssnField.clear();
        ssnField.sendKeys(ssn);
    }

    public void setGender(String gender) {
        genderField.clear();
        genderField.sendKeys(gender);
    }

    public void setWeight(String height) {
        weightField.clear();
        weightField.sendKeys(height);
    }

    public void setLength(String length) {
        lengthField.clear();
        lengthField.sendKeys(length);
    }

    public void submitValid() {
        registerButton.click();
    }

}
