package com.ruaoux.maven;

import cn.ruaoux.maven.Hello;
import org.junit.Test;

public class HelloTest {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String ruaoux = hello.sayHello("ruaoux");
        System.out.printf(ruaoux);
    }
}
