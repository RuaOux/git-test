/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo06Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    java,util.Collection
        所有单列集合的最顶层接口，里边定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection接口中的方法

    共性的方法：
        public boolean add(E e):  把指定的对象添加到当前集合中。
        public void clear(): 清空集合中所有的元素。
        public boolean remove(E e): 把指定的对象在当前集合中删除。
        public boolean contains(E e): 判断当前集合中是否包含指定的对象
        public boolean isEpty(): 判断当前集合是否为空。
        public int size(): 返回集合中元素的个数。
        public Object[] toArray():  把集合中的元素，存储到数组中。
 */
public class Demo01Colletion {
    public static void main(String[] args) {
        // 创建集合对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);  // 重写了toString方法 []
        // 添加元素到集合中
        coll.add("张三");
        coll.add("张三1");
        coll.add("张三2");
        coll.add("法外狂徒张三");
        System.out.println(coll);
        System.out.println("=================");
        coll.remove("张三2");
        System.out.println(coll);

        // 判断当前集合中是否包含指定的对象
        boolean b4 = coll.contains("法外狂徒张三");
        System.out.println(b4);

        // 判断当前集合是否为空
        boolean b6 = coll.isEmpty();
        System.out.println(b6);  // 集合不为空返回false  如果空则返回true

        // 返回集合的个数
        System.out.println(coll.size());

        // 把集合中的元素，存储到数组中
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 清空集合中的所有元素, 但是不删除集合
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());  // 集合为空
    }
}
