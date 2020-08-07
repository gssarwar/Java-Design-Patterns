package com.gs.creatinal.singleton.lazysingleton;

public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL(){}

    private static  volatile LazyRegistryWithDCL INSTANCE =null;

    public static LazyRegistryWithDCL getInstance(){

        if (INSTANCE == null){
            synchronized (LazyRegistryWithDCL.class){
                if (INSTANCE == null)
                INSTANCE = new LazyRegistryWithDCL();
            }
        }
        return INSTANCE;
    }
}
