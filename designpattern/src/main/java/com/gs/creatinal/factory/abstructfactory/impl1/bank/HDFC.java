package com.gs.creatinal.factory.abstructfactory.impl1.bank;

public class HDFC implements Bank {
    private final String BNAME;

    public HDFC() {
        BNAME = "HDFC BANK";
    }

    public String getBankName() {
        return BNAME;
    }
}