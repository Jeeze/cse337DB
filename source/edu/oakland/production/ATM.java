package edu.oakland.production;

import edu.oakland.helper.*;

public class ATM{

  private int desiredAmount;
  private BankDataBase bankDB;
  private boolean withdrawMoney;  
  private int accountAmount;
  private boolean selectAmount;
  private boolean verifyAmount;
  private boolean issueAmount;

  public ATM(){

  }

  public ATM(boolean selectAmount, boolean withdrawMoney){
    this.withdrawMoney = withdrawMoney;
    this.selectAmount = selectAmount;

  }

  public ATM(BankDataBase bankDB){
    this.bankDB = bankDB;
    
  }
  
  public void setDesiredAmount(int desiredAmount){
    this.desiredAmount = desiredAmount;
    
  }

  public int getDesiredAmount(){
    if (withdrawMoney == true){
     return desiredAmount;

    }else{
      withdrawMoney = false;
      return 0;

     }
  }

  public int getAmount(){
    accountAmount = bankDB.getAmount();
    return accountAmount;

  }
  
  public boolean verifyWithdrawAmountDisplayed(){
    return selectAmount;
    
  }
  
  public boolean verifyAmount(){
   verifyAmount = bankDB.verifiesAmount();
   return verifyAmount;
    
  }
  
  public boolean issueFunds(){
    if(verifyAmount == true){
      return issueAmount = true;
    }else{
      return issueAmount = false;
    }
    
  }

  public boolean selectWithdrawMoney(){
    return withdrawMoney;

  }

}
