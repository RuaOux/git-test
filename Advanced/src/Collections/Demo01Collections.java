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

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

/*        list.add("AAA");
        list.add("BBB");
        list.add("CCC");*/
        // public static void addAll (list,"A","B");    往集合中添加多个元素
        Collections.addAll(list,"a","b","c");
        // public static void shuffle (list);  将集合中元素顺序打乱
        Collections.shuffle(list);
        System.out.println(list);
    }
}
