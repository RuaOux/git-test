/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo07;

import java.util.ArrayList;
import java.util.List;
/*
java.util.List正是ArrayList所实现的接口。
 */
public class DemoInterface {
    public static void main(String[] args) {
        // 左边是接口名称： 右边是实现类名称，这就是多态写法
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
    public static List<String> addNames (List<String> list) {
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        return list;
    }



}
