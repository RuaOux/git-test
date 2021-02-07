/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo05;
/*
如果接口的实现类，（或者是父类的子类），只需要使用唯一的一次。
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】。

匿名内部类的定义格式：
    接口名称 对象名 = new 接口名称();
        // 覆盖重写所有抽象方法
        }

  对格式“new 接口名称() {...}”,进行解析:
  1. new代表创建对象的动作
  2. 接口名称就是匿名内部类需要实现哪个接口。
  3. (...)这才是匿名内部类的内容

  另外还要注意几点问题：
  1. 匿名内部类，在创建对象的时候，只能使用唯一一次。
  如果希望多次创建对象，而且类的内容一样的话，那么久必须使用单独定义的实现类了。
  2. 匿名对象，在【调用方法】的时候，只能调用唯一一次。
  如果希望同一个对象。调用多次方法，那么必须给对象起个名字
  3. 匿名内部类是省略了【实现类或者子类】，但是匿名对象是省略了【对象名称】
  强调：匿名内部类和匿名对象不是一回事！！！
 */
public class DemoMain {
    public static void main(String[] args) {
//        MyInterfaceImpl impl = new MyInterfaceImpl();
//        impl.methodAbs();

//        MyInterface some = new MyInterface();  错误写法

        // 使用匿名内部类
        MyInterface objA = new MyInterface() {
            @Override
            public void methodAbs() {
                System.out.println("匿名内部类实现了方法-A");
            }
        };
        objA.methodAbs();

        // 使用了匿名内部类、而且省略了对象名称，也是匿名对象
        new MyInterface() {
            @Override
            public void methodAbs() {
                System.out.println("匿名内部类实现了方法-B");
            }
        }.methodAbs();
        // 因为匿名对象无法调用第二次方法，所以需要再创建一个匿名内部类的匿名对象

    }
}
