/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Extends.Demo14;

import java.util.ArrayList;
// 群主的类
public class Manager extends User{
    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        // 首先一个集合、用来存储若干红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        // 首先看一下群主自己有多少钱
        int leftMoney = super.getMoney();  // 群主当前余额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;
        }
        // 扣钱 其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);
        // 发红包需要平均拆分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;  // 余数 也就是甩下的零头
        // 除不开的零头，包在最后一个红包当中
        // 下面把红包一个一个放到集合当中。
        for (int i = 0; i < count -1 ; i++) {
            redList.add(avg);
        }

        // 最后一个红包
        int last = avg = mod;
        redList.add(last);

        return redList;
    }
}
