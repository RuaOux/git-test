/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo06;

public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        // 为一个英雄起一个名字，并且设置名字
        hero.setName("RuaOux");
        hero.setAge(209);

        // 创建一个武器对象
        Werpon werpon = new Werpon("多兰剑");
        // 为英雄配备武器
        hero.setWerpon(werpon);
        // 年龄为209的RuaOux用多兰剑攻击敌方。
        hero.attack();
    }


}
