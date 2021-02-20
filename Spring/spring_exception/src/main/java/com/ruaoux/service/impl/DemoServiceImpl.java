package com.ruaoux.service.impl;

import com.ruaoux.dao.DemoDao;
import com.ruaoux.exception.MyException;
import com.ruaoux.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public void show1() {
        System.out.println("抛出类型转换异常....");
        Object str = "zhangsan";
        Integer num = (Integer)str;
    }

    public void show2(){
        System.out.println("抛出除零异常....");
        int i = 1/0;
    }

    public void show3() throws FileNotFoundException {
        System.out.println("文件找不到异常...");
        InputStream in = new FileInputStream("C:/xxx/xxx/xxx/xxx.txt");
    }

    public void show4(){
        System.out.println("空指针异常.....");
        String str = null;
        str.length();
    }

    public void show5() throws MyException {
        System.out.println("自定义异常");
        throw new MyException();
    }

}
