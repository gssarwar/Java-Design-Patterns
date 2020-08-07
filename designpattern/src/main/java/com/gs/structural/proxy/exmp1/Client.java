package com.gs.structural.proxy.exmp1;

public class Client
{
    public static void main(String[] args)
    {
        RealObject proxy = new RealObjectProxy();
        proxy.doSomething();
    }
}