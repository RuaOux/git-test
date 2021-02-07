package com.RuaOux.demo07.ThisMethodReference;
/*
    通过this引用本类的成员方法

 */
public class Husband {
    // 定义一个买XX的方法
    public void buyHouse(){
        System.out.println("炸鸡腿");
    }

    // 定义一个方法，参数传递Richable接口
    public void marry(Richable r){
        r.buy();
    }

    // 定义一个非常高兴的方法
    public void soHppy(){
        // 调用方法，方法的参数是函数式接口，
        marry(this::buyHouse);
    }
    /*
        方法引用优化Lambda
        this是已经存在的
        本类的成员方法buyHouse也是已经存在的
        所以我们可以直接使用this来引用本类的成员方法buyHouse
     */
    public static void main(String[] args) {
        new Husband().soHppy();
    }
}
