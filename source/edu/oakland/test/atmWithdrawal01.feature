Feature: The ATM shall provide a means for the Customer to withdraw money from his or her account.

Scenario: The customer wishes to withdraw money from the ATM

Given the customer has been successfully authenticated

And the customer has selected the withdraw money from the list of options displayed by the ATM

And the ATM displays a withdrawal amount data input screen

When the Customer has entered the withdrawal amount

Then the ATM requests the BankDB to verify sufficient funds

Then the ATM issues funds

Then the Customer receives the funds
