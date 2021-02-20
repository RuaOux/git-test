package com.ruaoux.proxy.jdk.impl;

import com.ruaoux.proxy.jdk.TargetInterface;

public class TargetInterfaceImpl implements TargetInterface {
    public void save() {
        System.out.println("save running....");
    }
}
