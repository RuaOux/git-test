/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.Lambda03;

import java.util.Arrays;
import java.util.Comparator;

// Lambda表达式有参数有返回值的练习
    // 需求：
    //   使用数组存储多个person对象，对数组中的Person对象使用Arrays的sort方法进行年龄升序排序
public class Demo01Arrays {
        public static void main(String[] args) {
            // 使用数组存储多个person对象
            Person[] arr = {new Person("Brian",38),
                            new Person("RuaOux",23),
                            new Person("XXX",18)};

/*            // 对数组中的Person对象使用Arrays的sort方法进行年龄升序排序
            Arrays.sort(arr, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o1.getAge() - o2.getAge();
                }
            });*/

            // 使用Lambda表达式简化匿名内部类
            Arrays.sort(arr,(Person o1, Person o2) -> {
                    return o1.getAge() - o2.getAge();
            });


            for (Person p : arr) {
                System.out.println(p);
            }
        }
    }
