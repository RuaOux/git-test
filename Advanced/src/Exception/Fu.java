/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Exception;
/*
    子父类的异常：
        - 如果父类抛出了多个异常，子类重写父类方法时，抛出和父类相同的异常或是父类异常的子类或者不抛出异常。
        - 父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不能声明抛出。
    重点：
        父类异常是什么样，子类异常就什么样
 */
public class Fu {
    public void show01() throws NullPointerException, ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04() {}
}
class Zi extends Fu {
    // 子类重写父类方法时，抛出和父类相同的异常
    public void show01() throws NullPointerException,ClassCastException {}
    // 子类重写父类方法时，抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{}
    // 子类重写父类方法时
    public void show03() {}
    // 父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常
    // 此时子类产生该异常，只能捕获处理，不能声明抛出
    public void show04() {
        try {
            throw new Exception("编译器异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

