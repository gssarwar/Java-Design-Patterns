package com.gs.creatinal.factory.abstructfactory.impl1.abstractfactory;

import com.gs.creatinal.factory.abstructfactory.impl1.bank.Bank;
import com.gs.creatinal.factory.abstructfactory.impl1.bank.HDFC;
import com.gs.creatinal.factory.abstructfactory.impl1.bank.ICICI;
import com.gs.creatinal.factory.abstructfactory.impl1.bank.SBI;
import com.gs.creatinal.factory.abstructfactory.impl1.loan.Loan;

class BankFactory extends AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("ICICI")){
            return new ICICI();
        } 
        else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}//End of the BankFactory class.