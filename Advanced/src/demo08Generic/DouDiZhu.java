/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo08Generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
    斗地主综合案例
        1. 准备牌
        2. 洗牌
        3. 发牌
        4. 看牌

 */
public class DouDiZhu {
    public static void main(String[] args) {
        // 1. 准备牌
            // 定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        // 定义两个数组、一个数组存储牌的花色，一个数组存储牌的序号
        String[] colors = {"♠","♥","♣","方块"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        // 先把大王和小王存储到poker集合中
        poker.add("大王");
        poker.add("小王");
        // 循环嵌套遍历两个数组，组装52张牌
        for(String number : numbers) {
            for (String color : colors) {
                poker.add(color + number);
            }
        }

        // 2. 洗牌 使用集合的工具类Collections中的方法
        // static void shuffle(list<?> list) 使用默认随机源对指定列表进行置换
        Collections.shuffle(poker);
        System.out.println(poker);

        // 3. 发牌
        // 定义四个集合，分别存储玩家的牌以及存储底牌的集合
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        /*
            遍历poker集合，获取每一张牌
            使用poker集合的索引%3给3个玩家轮流发牌
            最后剩余3张给diPai
                注意：
                    先判断底牌(i >= 51), 否则牌就要发没了
         */
        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String p = poker.get(i);
            if(i >= 51) {
                diPai.add(p);
            }   else if (i%3 == 0) {
                player01.add(p);
            }   else if (i%3  == 1) {
                player02.add(p);
            } else if (i%3 == 2) {
                player03.add(p);
            }
         }

        // 4. 看牌
        System.out.println("玩家1的手牌：" + player01);
        System.out.println("玩家2的手牌：" + player02);
        System.out.println("玩家3的手牌：" + player03);
        System.out.println("底牌是：" + diPai);
    }
}
