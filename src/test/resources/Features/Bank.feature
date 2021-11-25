Feature: Customer administration

  @customerLogin
  Scenario: Customer logs in to XYZ Bank Page
    Given XYZ Bank Page was loaded for the customer
    When Customer logs in with Harry Potter
    Then customer will be in his account

  @customerDeposit
  Scenario: customer makes a Deposit
    Given customer was logged in XYZ bank page
    When customer enters the amount to be deposit
    Then A confirmation message will be displayed to the customer

  @customerWithdraw
  Scenario: customer makes a Withdrawn
    Given customer was logged in XYZ bank page
    When customer enters the amount to be withdraw
    Then A confirmation message of withdrawn will be displayed to the customer

  @customerTransactions
  Scenario: Customer reviews his transactions
    Given customer was logged in XYZ bank page
    When customer clicks on Transactions button
    Then recent transactions will be displayed to the customer

  @customerLogout
  Scenario: Customer logs out from his account
    Given customer was reviewing his transactions
    When customer clicks on Logout Button
    Then customer will be out off his account
    And the browser will close

