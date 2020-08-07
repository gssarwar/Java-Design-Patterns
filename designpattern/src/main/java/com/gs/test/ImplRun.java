package com.gs.test;

import java.util.ArrayList;
import java.util.List;

public class ImplRun extends Thread{

    public static void main(String[] args) {

        ImplRun implRun = new ImplRun();
        implRun.start();

        List list = new ArrayList(10);
      //  list.add(10);
        list.add(1,10);
        System.out.println(list);

    }
}
