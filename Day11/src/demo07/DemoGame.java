/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("射手"); // 设置英雄的名称

        // 设置英雄的技能
//        hero.setSkill(new SkillImpl());  // 使用单独定义的实现类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("射火箭");
//            }
//        };
//        hero.setSkill(skill);

        // 进一步简化.同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("冰火箭");
            }
        });

        hero.attatck();
    }
}
