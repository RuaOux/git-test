/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Extends.Demo14;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        // 从多个红包当中随机抽取一个，给我自己
        // 随机获取一个集合当中的索引编号。
        int index = new Random().nextInt(list.size());
        // 根据索引，从集合当中删除。并且得到被删除的红包，给我自己
        int delta = list.remove(index);
        // 当前成员本来有多少钱呢
        int money = super.getMoney();
        // 加法，并且重新设置回去
        super.setMoney(money + delta);
    }
}
