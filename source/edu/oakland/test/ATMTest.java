package edu.oakland.test;

import edu.oakland.production.*;
import edu.oakland.helper.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ATMTest{

  private BankDataBase bankDB;
  private ATM atm;
  private ATM atm1;

  private int desiredAmount = 100;
  private int bankAccount = 2000;
  private boolean withdrawMoney = true;
  private boolean selectAmount = true; 
  
  @Before
  public void initializeSystem(){
    atm = new ATM(selectAmount, withdrawMoney);
    bankDB = new BankDataBase(atm, bankAccount);
    atm1 = new ATM(bankDB);

    atm.setDesiredAmount(desiredAmount);  
  
  }

  @Test
  public void testInitialization(){
    assertEquals(desiredAmount, atm.getDesiredAmount());
    assertEquals(bankAccount, bankDB.getAmount());

  }
 
  @Test
  public void testPass(){
    assertEquals(bankAccount, atm1.getAmount());

  }

  @Test
  public void testVerification(){
    assertTrue(bankDB.verifiesAmount());

    if(atm.getDesiredAmount() < atm1.getAmount()){
     System.out.println("You get the amount of " + "$" + desiredAmount);
    }else{
      System.out.println("You're broke");    
     }
  }

}
