/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    public static <T> void sort(list<T> list, Comparator<? super T>)
    将集合中的元素按照指定规则排序

    Comparaotor和Comparable的区别
        Comparable：自己(this)和别人(参数)比较，自己需要实现Comparable接口，
        重写比较的规则compareTo方法。
        Comparator：相当于找一个第三方的裁判，比较两个
    Comparator的排序规则；
        o1-o2; 升序
        o2-o1; 降序
 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01,1,2,3,4,5,6,7,7,7,8,43,9);
        System.out.println(list01);

        Collections.sort(list01, new Comparator<Integer>() {
            // 重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;  // 升序排序
                    return o2 - o1;  // 降序排序
            }
        });
        System.out.println(list01);

        ArrayList<Stundent> list02 = new ArrayList<>();
        list02.add(new Stundent("法外狂徒",24));
        list02.add(new Stundent("张三",16));
        list02.add(new Stundent("RuaOux",19));
        list02.add(new Stundent("Brian",25));

        System.out.println(list02);
/*        Collections.sort(list02, new Comparator<Stundent>() {
            @Override
            public int compare(Stundent o1, Stundent o2) {
                // 按照年龄升序和排序
                return o2.getAge() - o1.getAge();
            }
        });*/


        System.out.println(list02);
    }
}
