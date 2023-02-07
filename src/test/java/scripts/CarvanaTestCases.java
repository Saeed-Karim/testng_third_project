package scripts;


import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class CarvanaTestCases extends CarvanaBaseTest {

    @Test(priority = 1, description = "Validate Carvana home page title and url")
    public void carvanaTitleAndUrl() {
        Assert.assertEquals(driver.getTitle(), "Carvana | Buy & Finance Used Cars Online | At Home Delivery");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.carvana.com/");
    }

    @Test(priority = 2, description = "Validate Logo")
    public void validateLogo() {
        Assert.assertTrue(carvanaBasePage.logo.isDisplayed());
    }

    @Test(priority = 3, description = "Validate the main navigation section items")
    public void validateNavigationItems() {
        Assert.assertTrue(carvanaBasePage.NavItems.isDisplayed());
        System.out.println(carvanaBasePage.NavItems.getText());
    }

    @Test(priority = 4, description = "Validate the sign in error message")
    public void validateSignInErrorMessage() {
        carvanaBasePage.signInButton.click();
        Waiter.pause(3);
        carvanaBasePage.emailInputBox.sendKeys("johndoe@gmail.com");
        carvanaBasePage.continueButton.click();
        carvanaBasePage.passwordInputBox.sendKeys("abcd1234");
        carvanaBasePage.submitButton.click();
        Assert.assertEquals(carvanaBasePage.errorMessage.getText(), "Email address and/or password combination is incorrect.");
    }

    @Test(priority = 5, description = "Validate the search filter options and search button")
    public void validateSearchOptions() {
        carvanaBasePage.searchCarButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.carvana.com/cars");
        Assert.assertEquals(carvanaBasePage.filterOptions.getText(), "PAYMENT & PRICE\n" +
                "MAKE & MODEL\n" +
                "BODY TYPE\n" +
                "YEAR & MILEAGE\n" +
                "FEATURES\n" +
                "MORE FILTERS");

    }

    @Test(priority = 6, description = "Validate the search result tiles")
    public void validateSearchResults() {
        carvanaBasePage.searchCarButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.carvana.com/cars");

        Waiter.pause(2);

        carvanaBasePage.carSearchBar.sendKeys("mercedes benz");
        Waiter.pause(2);

        carvanaBasePage.goButton.click();
        Waiter.pause(2);

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.carvana.com/cars/mercedes-benz?email-capture=");
        Waiter.pause(2);

        for (int i = 0; i < carvanaBasePage.tileBody.size(); i++) {
            Assert.assertTrue(carvanaBasePage.carImage.get(i).isDisplayed());

            Assert.assertTrue(carvanaBasePage.favoriteButton.get(i).isDisplayed());

            Assert.assertTrue(carvanaBasePage.tileBody.get(i).isDisplayed());

            Assert.assertTrue(carvanaBasePage.tileText.get(i).isDisplayed());

            Assert.assertTrue(carvanaBasePage.inventoryType.get(i).isDisplayed());

            Assert.assertTrue(carvanaBasePage.makeAndModel.get(i).isDisplayed());

            Assert.assertTrue(carvanaBasePage.trimAndMileage.get(i).isDisplayed());

            Assert.assertTrue(Integer.parseInt(carvanaBasePage.price.get(i).getText().replace
                    ("$", "").replace(",", "")) > 0);

            Assert.assertTrue(carvanaBasePage.monthlyPayment.get(i).isDisplayed());

            Assert.assertTrue(carvanaBasePage.downPayment.get(i).isDisplayed());

            Assert.assertTrue(carvanaBasePage.ship.get(i).isDisplayed());


        }


    }


}
