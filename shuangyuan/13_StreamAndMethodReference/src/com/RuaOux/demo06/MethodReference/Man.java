package com.RuaOux.demo06.MethodReference;

public class Man extends Human{
    @Override
    public void sayHello() {
        System.out.println("Hello, 我是Man");
    }
    // 定义一个方法传递Greetable接口
    public void method(Greetable g){
        g.greet();
    }
    public  void show(){
        // 调用method方法,方法的参数Greetable可以使用Lambda表达式
/*        method(()->{
            // 创建父类Human对象
            Human h = new Human();
            // 调用父类的sayhello方法
            h.sayHello();
        });*/
/*        method(()->{
            super.sayHello();
        });*/
        /*
         使用super引用类的成员方法
         super是已经存在的
         父类的成员方法sayHello也是已经存在的
         所以我们可以直接使用super引用父类的成员方法
         */
        method(super::sayHello);
    }
/*
    因为有子父类关系，所以存在的一个关键字super,代表父类，所以我们可以直接使用super调用父类的成员方法
 */
    public static void main(String[] args) {
        new Man().sayHello();


    }
}
