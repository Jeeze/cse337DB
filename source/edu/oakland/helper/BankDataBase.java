package edu.oakland.helper;

import edu.oakland.production.*;

public class BankDataBase{

  private ATM atm;
  private int bankAmount;
  private int providedAmount;

  public BankDataBase(){

  }

  public BankDataBase(ATM atm, int bankAmount){
    this.atm = atm;
    this.bankAmount = bankAmount;
    providedAmount = atm.getDesiredAmount();
    
  }

  public boolean verifiesAmount(){
    if(bankAmount > providedAmount){
     return true;

    }else{
      return false;
    
     }
    
  }

  public int  getAmount(){
    return bankAmount;
  }

}
