package com.gs.creatinal.singleton.egersingleton;

public class EgerRegistry {

    private  EgerRegistry(){};

    public final static EgerRegistry INSTANCE = new EgerRegistry();

    public static EgerRegistry getInstance(){
        return INSTANCE;
    }
}
