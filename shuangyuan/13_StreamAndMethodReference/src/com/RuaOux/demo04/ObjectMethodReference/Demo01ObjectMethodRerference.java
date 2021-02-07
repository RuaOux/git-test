package com.RuaOux.demo04.ObjectMethodReference;
/*
    通过对象名引用成员方法
    使用前提是对象名已经存在的，成员方法也是已经存在的
    就可以使用对象名来引用成员方法
 */
public class Demo01ObjectMethodRerference {
    // 定义一个方法,方法的参数传递Printable接口
    public static void printString(Printable p){
        p.print("Hello");
    }

    public static void main(String[] args) {
        // 调用printString方法，方法的参数Printable是一个函数式接口，可以传递Lambda
        printString((s)->{
            // 创建MethodRerObject对象
            MethodRerObject obj = new MethodRerObject();
            // 调用MethodRerObject对象中的成员方法
            obj.printUperCaseString(s);
        });

        /*
         方法引用来优化Lambda
         对象是已存在的，MethodRerObject
         成员方法也是已存在的, printUperCaseString
         所以可以使用对象名引用成员方法
         */
        // 创建MethodRerObject对象
        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUperCaseString);
    }
}
