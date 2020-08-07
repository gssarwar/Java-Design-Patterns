package com.gs.creatinal.factory.abstructfactory.impl1.abstractfactory;

import com.gs.creatinal.factory.abstructfactory.impl1.bank.Bank;
import com.gs.creatinal.factory.abstructfactory.impl1.loan.BussinessLoan;
import com.gs.creatinal.factory.abstructfactory.impl1.loan.EducationLoan;
import com.gs.creatinal.factory.abstructfactory.impl1.loan.HomeLoan;
import com.gs.creatinal.factory.abstructfactory.impl1.loan.Loan;

class LoanFactory extends AbstractFactory {
	public Bank getBank(String bank) {
		return null;
	}

	public Loan getLoan(String loan) {
		if (loan == null) {
			return null;
		}
		if (loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		} else if (loan.equalsIgnoreCase("Business")) {
			return new BussinessLoan();
		} else if (loan.equalsIgnoreCase("Education")) {
			return new EducationLoan();
		}
		return null;
	}

}