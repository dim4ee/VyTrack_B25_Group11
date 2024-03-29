package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Model;

public class US13_ManageFiltersOn_VehicleCostsPage {


    /*
    USER STORY:
    As a user, I want to manage filters on the Vehicle Costs page. (Web-table and checkbox)


    AC #1: Users should see three columns on the Vehicle Cost page.
               Expected Column names:
               TYPE, TOTAL PRICE, DATE

    AC #2: users check the first checkbox to check all the Vehicle Costs
     */


    //-------------------------AC1: SALES MANAGER able to see 3 COLUMNS--------------------------------------------------
    @Test
    public void US13_AC1_Salesmanager_able_to_see_3columns() {

          /*
         AC #1: Users should see three columns on the Vehicle Cost page.
               Expected Column names:
               TYPE, TOTAL PRICE, DATE
*/

        // STEP 1: User go to homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // User enters username
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        BrowserUtils.sleep(1);
        // User enters password
        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
        BrowserUtils.sleep(1);
        // User clicks SIGN IN button
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        BrowserUtils.sleep(1);


        // System should display 'Fleet' tab / module

        WebElement moduleTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));

        String expectedModuleName = "Fleet";
        String actualModuleName = moduleTab.getText();

        // Assert system displays 'Fleet' tab/module
        Assert.assertEquals(actualModuleName, expectedModuleName);


        // STEP 2: Click Fleet tab/module

        moduleTab.click();
        BrowserUtils.sleep(2);

        // System should show dropdown with Vehicle Costs tab/module

        // Verify system shows Vehicle Costs tab/module
        WebElement vehicleCostsTab = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));

        String expectedVehiclesCostsTab = "Vehicle Costs";
        String actualVehiclesCostsTab = vehicleCostsTab.getText();

        // Assert system displays 'Vehicle Costs' tab/module
        Assert.assertEquals(actualVehiclesCostsTab, expectedVehiclesCostsTab);


        // STEP 3: Click Vehicle Costs tab / module

        vehicleCostsTab.click();
        BrowserUtils.sleep(2);

        // System should see three columns on the Vehicle Cost page.

        // Expected Column name: TYPE, TOTAL PRICE, DATE

        WebElement type = Driver.getDriver().findElement(By.xpath("//span[.='Type']"));
        type.isDisplayed();

        WebElement totalPrice = Driver.getDriver().findElement(By.xpath("//span[.='Total Price']"));
        totalPrice.isDisplayed();

        WebElement date = Driver.getDriver().findElement(By.xpath("//span[.='Date']"));
        date.isDisplayed();
        BrowserUtils.sleep(2);

        // logout from the homepage
        WebElement logoutButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
        logoutButton.click();

        WebElement logout = Driver.getDriver().findElement(By.xpath("//a[.='Logout']"));
        logout.click();



    }

    //-------------------------AC1: STORE MANAGER able to see 3 COLUMNS--------------------------------------------------
    @Test
    public void US13_AC1_Storemanager_able_to_see_3columns() {

          /*
         AC #1: Users should see three columns on the Vehicle Cost page.
               Expected Column names:
               TYPE, TOTAL PRICE, DATE
*/

        // STEP 1: User go to homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // User enters username
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        BrowserUtils.sleep(1);
        // User enters password
        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        BrowserUtils.sleep(1);
        // User clicks SIGN IN button
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        BrowserUtils.sleep(1);


        // System should display 'Fleet' tab / module

        // Locate 'Fleet' tab/module
        WebElement moduleTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));

        String expectedModuleName = "Fleet";
        String actualModuleName = moduleTab.getText();

        // Assert system displays 'Fleet' tab/module
        Assert.assertEquals(actualModuleName, expectedModuleName);


        // STEP 2: Click Fleet tab/module

        moduleTab.click();
        BrowserUtils.sleep(2);

        // System should show dropdown with Vehicle Costs tab/module

        // Verify system shows Vehicle Costs tab/module
        WebElement vehicleCostsTab = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));

        String expectedVehiclesModelTab = "Vehicle Costs";
        String actualVehiclesModelTab = vehicleCostsTab.getText();

        // Assert system displays 'Vehicles Costs' tab/module
        Assert.assertEquals(actualVehiclesModelTab, expectedVehiclesModelTab);


        // STEP 3: Click Vehicle Costs tab / module

        vehicleCostsTab.click();
        BrowserUtils.sleep(2);

        // System should see three columns on the Vehicle Cost page.

        // Expected Column name: TYPE, TOTAL PRICE, DATE

        WebElement type = Driver.getDriver().findElement(By.xpath("//span[.='Type']"));
        type.isDisplayed();

        WebElement totalPrice = Driver.getDriver().findElement(By.xpath("//span[.='Total Price']"));
        totalPrice.isDisplayed();

        WebElement date = Driver.getDriver().findElement(By.xpath("//span[.='Date']"));
        date.isDisplayed();
        BrowserUtils.sleep(2);

        // Logout from the homepage
        WebElement logoutButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
        logoutButton.click();

        WebElement logout = Driver.getDriver().findElement(By.xpath("//a[.='Logout']"));
        logout.click();

    }


    //-------------------------AC1: TRUCK DRIVER able to see 3 columns--------------------------------

    @Test
    public void US13_AC1_TruckDriver_able_to_see_3columns() {

          /*
         AC #1: Users should see three columns on the Vehicle Cost page.
               Expected Column names:
               TYPE, TOTAL PRICE, DATE
*/

        // STEP 1: User go to homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // User enters username
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(ConfigurationReader.getProperty("driver_username"));
        BrowserUtils.sleep(1);
        // User enters password
        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys(ConfigurationReader.getProperty("driver_password"));
        BrowserUtils.sleep(1);
        // User clicks SIGN IN button
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        BrowserUtils.sleep(1);


        // System should display 'Fleet' tab / module

        // Locate 'Fleet' tab/module
        WebElement moduleTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));

        String expectedModuleName = "Fleet";
        String actualModuleName = moduleTab.getText();

        // Assert system displays 'Fleet' tab/module
        Assert.assertEquals(actualModuleName, expectedModuleName);


        // STEP 2: Click Fleet tab/module

        moduleTab.click();
        BrowserUtils.sleep(2);

        // System should show dropdown with Vehicle Costs tab/module

        // Verify system shows Vehicle Costs tab/module
        WebElement vehicleCostsTab = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));

        String expectedVehiclesModelTab = "Vehicle Costs";
        String actualVehiclesModelTab = vehicleCostsTab.getText();

        // Assert system displays 'Vehicles Costs' tab/module
        Assert.assertEquals(actualVehiclesModelTab, expectedVehiclesModelTab);


        // STEP 3: Click Vehicle Costs tab / module

        vehicleCostsTab.click();
        BrowserUtils.sleep(2);

        // System should see three columns on the Vehicle Cost page.

        // Expected Column name: TYPE, TOTAL PRICE, DATE

        WebElement type = Driver.getDriver().findElement(By.xpath("//span[.='Type']"));
        type.isDisplayed();

        WebElement totalPrice = Driver.getDriver().findElement(By.xpath("//span[.='Total Price']"));
        totalPrice.isDisplayed();

        WebElement date = Driver.getDriver().findElement(By.xpath("//span[.='Date']"));
        date.isDisplayed();
        BrowserUtils.sleep(2);

        // Logout from the homepage
        WebElement logoutButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
        logoutButton.click();

        WebElement logout = Driver.getDriver().findElement(By.xpath("//a[.='Logout']"));
        logout.click();

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //--------------------------------AC2: SALES MANAGER ABLE TO CHECK FIRST CHECKBOX--------------------------------------

    @Test
    public void US13_AC2_SalesManager_Able_To_Check_FirstCheckbox() {


        // AC #2: users check the first checkbox to check all the Vehicle Costs


        // STEP 1: User go to homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // User enters username
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        BrowserUtils.sleep(1);
        // User enters password
        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
        BrowserUtils.sleep(1);
        // User clicks SIGN IN button
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        BrowserUtils.sleep(1);


        // System should display 'Fleet' tab / module

        // Locate 'Fleet' tab/module
        WebElement moduleTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));

        String expectedModuleName = "Fleet";
        String actualModuleName = moduleTab.getText();

        // Assert system displays 'Fleet' tab/module
        Assert.assertEquals(actualModuleName, expectedModuleName);


        // STEP 2: Click Fleet tab/module

        moduleTab.click();
        BrowserUtils.sleep(2);

        // System should show dropdown with Vehicle Costs tab/module

        // Verify system shows Vehicle Costs tab/module
        WebElement vehicleCostsTab = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));

        String expectedVehiclesModelTab = "Vehicle Costs";
        String actualVehiclesModelTab = vehicleCostsTab.getText();

        // Assert system displays 'Vehicles Costs' tab/module
        Assert.assertEquals(actualVehiclesModelTab, expectedVehiclesModelTab);


        // STEP 3: Click Vehicle Costs tab / module

        vehicleCostsTab.click();
        BrowserUtils.sleep(2);

        // System should see three columns on the Vehicle Cost page.
        // Expected Column name: TYPE, TOTAL PRICE, DATE

        WebElement type = Driver.getDriver().findElement(By.xpath("//span[.='Type']"));
        type.isDisplayed();

        WebElement totalPrice = Driver.getDriver().findElement(By.xpath("//span[.='Total Price']"));
        totalPrice.isDisplayed();

        WebElement date = Driver.getDriver().findElement(By.xpath("//span[.='Date']"));
        date.isDisplayed();


        // STEP 4: User checks the first checkbox to check all the Vehicle Costs

        WebElement firstCheckbox = Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[4]"));
        BrowserUtils.sleep(2);
        firstCheckbox.click();
        firstCheckbox.isSelected();
        BrowserUtils.sleep(2);

        // Logout from the homepage
        WebElement logoutButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
        logoutButton.click();

        WebElement logout = Driver.getDriver().findElement(By.xpath("//a[.='Logout']"));
        logout.click();

    }

    //--------------------------------AC2: STORE MANAGER ABLE TO CHECK FIRST CHECKBOX--------------------------------------

    @Test
    public void US13_AC2_StoreManager_Able_To_Check_FirstCheckbox() {


        // AC #2: users check the first checkbox to check all the Vehicle Costs


        // STEP 1: User go to homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // User enters username
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        BrowserUtils.sleep(1);
        // User enters password
        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        BrowserUtils.sleep(1);
        // User clicks SIGN IN button
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        BrowserUtils.sleep(1);


        // System should display 'Fleet' tab / module

        // Locate 'Fleet' tab/module
        WebElement moduleTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));

        String expectedModuleName = "Fleet";
        String actualModuleName = moduleTab.getText();

        // Assert system displays 'Fleet' tab/module
        Assert.assertEquals(actualModuleName, expectedModuleName);


        // STEP 2: Click Fleet tab/module

        moduleTab.click();
        BrowserUtils.sleep(2);

        // System should show dropdown with Vehicle Costs tab/module

        // Verify system shows Vehicle Costs tab/module
        WebElement vehicleCostsTab = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));

        String expectedVehiclesModelTab = "Vehicle Costs";
        String actualVehiclesModelTab = vehicleCostsTab.getText();

        // Assert system displays 'Vehicles Costs' tab/module
        Assert.assertEquals(actualVehiclesModelTab, expectedVehiclesModelTab);


        // STEP 3: Click Vehicle Costs tab / module

        vehicleCostsTab.click();
        BrowserUtils.sleep(2);

        // System should see three columns on the Vehicle Cost page.
        // Expected Column name: TYPE, TOTAL PRICE, DATE

        WebElement type = Driver.getDriver().findElement(By.xpath("//span[.='Type']"));
        type.isDisplayed();

        WebElement totalPrice = Driver.getDriver().findElement(By.xpath("//span[.='Total Price']"));
        totalPrice.isDisplayed();

        WebElement date = Driver.getDriver().findElement(By.xpath("//span[.='Date']"));
        date.isDisplayed();


        // STEP 4: User checks the first checkbox to check all the Vehicle Costs

        WebElement firstCheckbox = Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[4]"));
        BrowserUtils.sleep(2);
        firstCheckbox.click();
        firstCheckbox.isSelected();
        BrowserUtils.sleep(2);

        // Logout from the homepage
        WebElement logoutButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
        logoutButton.click();

        WebElement logout = Driver.getDriver().findElement(By.xpath("//a[.='Logout']"));
        logout.click();

    }

    //--------------------------------AC2: TRUCK DRIVER ABLE TO CHECK FIRST CHECKBOX--------------------------------------

    @Test
    public void US13_AC2_Users_Able_To_Check_FirstCheckbox() {


        // AC #2: users check the first checkbox to check all the Vehicle Costs


        // STEP 1: User go to homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // User enters username
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(ConfigurationReader.getProperty("driver_username"));
        BrowserUtils.sleep(1);
        // User enters password
        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys(ConfigurationReader.getProperty("driver_password"));
        BrowserUtils.sleep(1);
        // User clicks SIGN IN button
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        BrowserUtils.sleep(1);


        // System should display 'Fleet' tab / module

        // Locate 'Fleet' tab/module
        WebElement moduleTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));

        String expectedModuleName = "Fleet";
        String actualModuleName = moduleTab.getText();

        // Assert system displays 'Fleet' tab/module
        Assert.assertEquals(actualModuleName, expectedModuleName);


        // STEP 2: Click Fleet tab/module

        moduleTab.click();
        BrowserUtils.sleep(2);

        // System should show dropdown with Vehicle Costs tab/module

        // Verify system shows Vehicle Costs tab/module
        WebElement vehicleCostsTab = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));

        String expectedVehiclesModelTab = "Vehicle Costs";
        String actualVehiclesModelTab = vehicleCostsTab.getText();

        // Assert system displays 'Vehicles Costs' tab/module
        Assert.assertEquals(actualVehiclesModelTab, expectedVehiclesModelTab);


        // STEP 3: Click Vehicle Costs tab / module

        vehicleCostsTab.click();
        BrowserUtils.sleep(2);

        // STEP 4: User checks the first checkbox to check all the Vehicle Costs

        WebElement firstCheckbox = Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[4]"));
        Assert.assertTrue(firstCheckbox.isDisplayed());
        BrowserUtils.sleep(2);

        // Logout from the homepage
        WebElement logoutButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
        logoutButton.click();

        WebElement logout = Driver.getDriver().findElement(By.xpath("//a[.='Logout']"));
        logout.click();



    }
}
