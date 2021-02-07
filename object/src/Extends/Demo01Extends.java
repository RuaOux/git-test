/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Extends;
/*
在继承的关系中： “子类就是一个父类”。也就是说，子类可以被当做父类看待
例如父类是员工，子类是讲师，那么“讲师就是一个员工”。 这样的关系就是 : is-a。

定义父类的公式： （一个普通的类定义）
public class 父类名称 {
    // ...
    }
定义子类的格式.
public class 子类名称 extends 父类名称 {
    // ...
    }
 */
public class Demo01Extends {
    public static void main(String[] args) {
        // 创建了一个子类对象
        Teacher teacher = new Teacher();
        // Teacher类当中虽然什么都没写， 但是会继承来自父类的method方法。
        teacher.method();

        // 创建另一个子类助教的对象
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
