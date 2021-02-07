package com.RuaOux.Demo02.Stream;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
    现在有俩个Arraylist集合存储队伍当中的多个成员姓名，需要使用传统的for循环（或增强for循环）
    依次进行以下若干操作步骤：

    1. 第一个队伍只要名字为前3个字的成员姓名；存储到一个新集合。
    2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中
    3. 第二个队伍只要姓张的成员姓名;存储到一个新集合中
    4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中
    5. 将两个队伍合并为一个队伍；存储到一个新集合中
    6. 根据姓名创建Person对象；存储到一个新集合中
    7. 打印整个队伍的Person对象信息
 */
public class Demo09Test {
    public static void main(String[] args) {
        // 第一支队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中王");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        ArrayList<String> one1 = new ArrayList<>();
    //    1. 第一个队伍只要名字为前3个字的成员姓名；存储到一个新集合。
        for (String s : one) {
            if (s.length() == 3) {
                one1.add(s);
            }
        }
    //    2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中
        ArrayList<String> one2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            one2.add(one1.get(i));  // i = 0,1,2
        }

        // 第二支队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵思");
        two.add("张天爱");
        two.add("张二狗");
        ArrayList<String> two1 = new ArrayList<>();
        //    3. 第二个队伍只要姓张的成员姓名;存储到一个新集合中
        for (String s : two) {
            if (s.startsWith("张")){
                two1.add(s);
            }
        }
        //    4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中
        ArrayList<String> two2 = new ArrayList<>();
        for (int i = 2; i < two1.size(); i++) {
            two2.add(two1.get(i));  // i 不包含0 和 1
        }

        //    5. 将两个队伍合并为一个队伍；存储到一个新集合中
        ArrayList<String> all = new ArrayList<>();
        all.addAll(one2);
        all.addAll(two2);
        //    6. 根据姓名创建Person对象；存储到一个新集合中
        ArrayList<Person> list = new ArrayList<>();
        for (String name : all) {
            list.add(new Person(name));
        }
        //    7. 打印整个队伍的Person对象信息
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
