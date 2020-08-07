package com.gs.creatinal.factory.abstructfactory.impl1.abstractfactory;

import com.gs.creatinal.factory.abstructfactory.impl1.bank.Bank;
import com.gs.creatinal.factory.abstructfactory.impl1.loan.Loan;

abstract class AbstractFactory{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}