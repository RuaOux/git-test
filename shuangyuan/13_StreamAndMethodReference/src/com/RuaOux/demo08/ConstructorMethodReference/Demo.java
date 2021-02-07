package com.RuaOux.demo08.ConstructorMethodReference;
/*
    类的构造器（构造方法）引用
 */
public class Demo {
    // 定义一个方法,参数传递姓名和PersonBuilder接口
    public static void printName(String name, PersonBuilder pb){
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        // 调用printName方法，方法的参数PersonBuilder接口是函数式接口
        printName("RuaOux",(name)->{
            return new Person(name);
        });

        /*
            使用方法引用优化Lambda
            构造方法new Person(String name) 已知
            创建对象已知 new
            就可以使用Person引用new创建对象
         */
        printName("Brian",Person::new);
    }

}
