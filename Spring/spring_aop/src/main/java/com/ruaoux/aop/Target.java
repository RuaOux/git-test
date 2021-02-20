package com.ruaoux.aop;

public class Target implements TargetInterface{
    public void save() {
        System.out.println("running....");
    }
}
