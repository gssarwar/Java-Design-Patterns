package com.gs.creatinal.singleton;

import com.gs.creatinal.singleton.egersingleton.EgerRegistry;
import com.gs.creatinal.singleton.lazysingleton.LazyRegistryWithDCL;

public class Client {

    public static void main(String[] args) {
        System.out.println("eger initialization-start");
        EgerRegistry singleton1 = EgerRegistry.getInstance();
        EgerRegistry singleton2 = EgerRegistry.getInstance();
        System.out.println(singleton1==singleton2);
        System.out.println("lazy initialization-start");
        LazyRegistryWithDCL registryWithDCL1 = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL registryWithDCL2 = LazyRegistryWithDCL.getInstance();
        System.out.println(registryWithDCL1 ==  registryWithDCL2);

    }
}
