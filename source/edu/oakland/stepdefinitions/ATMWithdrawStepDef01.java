package edu.oakland.stepdefinitions;

import static org.junit.Assert.*;
import org.junit.*;
import edu.oakland.helper.*;
import edu.oakland.production.*;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import static org.hamcrest.CoreMatchers.*;

public class ATMWithdrawStepDef01{
  private BankDataBase bankDB;
  private ATM atm;
  private ATM atm1;

  private int desiredAmount = 100;
  private int bankAccount = 2000;
  private boolean withdrawMoney = true; 
  private boolean selectAmount = true;
    
@Given("^the customer has been successfully authenticated$")
public void the_customer_has_been_successfully_authenticated() throws Throwable{
    boolean authenticated = true;
    atm = new ATM(selectAmount, withdrawMoney);
    bankDB = new BankDataBase(atm, bankAccount);
    atm1 = new ATM(bankDB);
}

@Given("^the customer has selected the withdraw money from the list of options displayed by the ATM$")
public void the_customer_has_selected_the_withdraw_money_from_the_list_of_options_displayed_by_the_ATM() throws Throwable{
    assertThat(atm.selectWithdrawMoney(), is(true));
}

@Given("^the ATM displays a withdrawal amount data input screen$")
public void the_ATM_displays_a_withdrawal_amount_data_input_screen() throws Throwable{
    assertThat(atm.verifyWithdrawAmountDisplayed(), is(true));
}

@When("^the Customer has entered the withdrawal amount$")
public void the_Customer_has_entered_the_withdrawal_amount() throws Throwable{
    atm.setDesiredAmount(desiredAmount);
    assertThat(desiredAmount, is(atm.getDesiredAmount()));
}

@Then("^the ATM requests the BankDB to verify sufficient funds$")
public void the_ATM_requests_the_BankDB_to_verify_sufficient_funds() throws Throwable{
    assertThat(atm1.verifyAmount(), is(true));
}

@Then("^the ATM issues funds$")
public void the_ATM_issues_funds() throws Throwable{
    assertThat(atm1.issueFunds(), is(true));
}

@Then("^the Customer receives the funds$")
public void the_Customer_receives_the_funds() throws Throwable{
    assertThat(desiredAmount, is(atm.getDesiredAmount()));
}


}
