package StepDefinition;

import Pages.Global;
import io.cucumber.java.en.*;

public class StepDefinition {

    Global globalPage = new Global();

    @Given("XYZ Bank Page was loaded for the customer")
    public void xyz_bank_page_was_loaded_for_the_customer() {
        globalPage.loadPage();
    }
    @When("^Customer logs in with Harry Potter$")
    public void customer_logs_in_with_harry_potter() throws InterruptedException {
        globalPage.loginAsCustomer();
    }
    @Then("customer will be in his account")
    public void customer_will_be_in_his_account() throws InterruptedException {
        globalPage.displayAccount();
    }

    @Given("customer was logged in XYZ bank page")
    public void customer_was_logged_in_xyz_bank_page() throws InterruptedException {
        globalPage.displayAccount();
    }
    @When("customer enters the amount to be deposit")
    public void customer_enters_the_amount_to_be_deposit() {
        globalPage.deposit();

    }
    @Then("A confirmation message will be displayed to the customer")
    public void a_confirmation_message_will_be_displayed_to_the_customer() {
        globalPage.confirmDeposit();
    }

    @When("^customer enters the amount to be withdraw$")
    public void customer_enters_the_amount_to_be_withdraw() throws InterruptedException {
        globalPage.withdrawn();
    }

    @Then("A confirmation message of withdrawn will be displayed to the customer")
    public void a_confirmation_message_of_withdrawn_will_be_displayed_to_the_customer() {
        globalPage.confirmWithdrawn();
    }

    @When("customer clicks on Transactions button")
    public void customer_clicks_on_transactions_button() {
        globalPage.clickTransactions();
    }

    @Then("recent transactions will be displayed to the customer")
    public void recent_transactions_will_be_displayed_to_the_customer() {
        globalPage.checkTransactions();
    }

    @Given("customer was reviewing his transactions")
    public void customer_was_reviewing_his_transactions() throws InterruptedException {
        globalPage.checkTransactions();
    }

    @When("^customer clicks on Logout Button$")
    public void customer_clicks_on_logout_button() {
        globalPage.logoutCustomer();
    }

    @Then("customer will be out off his account")
    public void customer_will_be_out_off_his_account() {
        globalPage.displayHome();
    }

    @Given("XYZ Bank Page was loaded for the Manager")
    public void xyz_bank_page_was_loaded_for_the_manager() {
        globalPage.displayHome();
    }
    @When("Manager clicks on Bank Manager Login button")
    public void manager_clicks_on_bank_manager_login_button() {
        globalPage.loginManager();
    }
    @Then("Manager will be in his account")
    public void manager_will_be_in_his_account() throws InterruptedException {
        globalPage.displayManagerAccount();
    }
    @Given("Manager was logged in his account")
    public void manager_was_logged_in_his_account() throws InterruptedException {
        globalPage.displayManagerAccount();
    }
    @When("Manager enters data to add a customer")
    public void manager_enters_data_to_add_a_customer() throws InterruptedException {
        globalPage.addCustomer();
    }
    @Then("Manager will see a confirmation message")
    public void manager_will_see_a_confirmation_message() {
        globalPage.confirmMessageAdd();
    }
    @Then("the browser will close")
    public void the_browser_will_close() {
        globalPage.quit();
    }

}
