package com.gs.creatinal.factory.abstructfactory.impl1.bank;

public class ICICI implements Bank {
    private final String BNAME;
    public ICICI() {
        BNAME = "ICICI BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}