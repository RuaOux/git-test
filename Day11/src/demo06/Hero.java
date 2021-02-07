/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo06;
// 游戏当中的英雄角色类
public class Hero {

    private String name; // 英雄名字

    private int age;  // 英雄的年龄

    private Werpon werpon; // 武器

    public Hero() {
    }

    public Hero(String name, int age, Werpon werpon) {
        this.name = name;
        this.age = age;
        this.werpon = werpon;
    }

    public void attack() {
        System.out.println("年龄为" + age + "的" + name + "用" + werpon.getCode() + "攻击敌方。");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Werpon getWerpon() {
        return werpon;
    }

    public void setWerpon(Werpon werpon) {
        this.werpon = werpon;
    }
}
