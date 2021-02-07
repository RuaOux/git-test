package com.RuaOux.annottation;

import java.util.Date;

/**
 *
         * JDK中定义的一些注解
         * @Overide：检测被该注解标注的方法是否继承自父类（接口）的
         * @Deorecated：将该注解标注的内容，表示已过时
         * @SuppressWarnings：压制警告
 */
@SuppressWarnings("all")
public class AnnoDemo02 {
    @Override
    public String toString() {
        return super.toString();
    }

    // * @Deorecated：将该注解标注的内容，表示已过时
    @Deprecated
    public void show1(){
        // 有缺陷
    }

    public void show2(){
        // 替代show1方法
    }

    public void demo(){
        show1();
        Date date = new Date();
    }
}
