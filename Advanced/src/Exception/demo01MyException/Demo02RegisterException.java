/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Exception.demo01MyException;


import java.util.Scanner;

/*
    要求： 我们模拟注册操作，如果用户已存在，则抛出异常并提示：该用户名已存在。

    分析:
        1. 使用数组保存已经注册过的用户名（数据库）
        2. 使用Scanner获取用户输入的用户名（前端,页面）
        3. 定义一个方法对用户输入的用户名进行判断
            遍历存储已经注册过的用户名的数组，获取每一个用户名
            使用获取到的用户名和用户输入的用户名比较
                true:
                    用户名已存在,抛出RegisterException异常，告知用户“该用户名已存在”
                flase:
                    继续遍历比较
            如果遍历结束了，还没有找到重复的用户名，提示用户“该用户名可使用”
 */
public class Demo02RegisterException {
    //         1. 使用数组保存已经注册过的用户名（数据库）
    static String[] usernames = {"张三","李四","王五"};
    public static void main(String[] args) throws RegisterException {
    //         2. 使用Scanner获取用户输入的用户名（前端,页面）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要注册的用户名");
        String username = sc.next();
        checkUsername(username);

    }
    public static void checkUsername(String username) throws RegisterException {
        //        3. 定义一个方法对用户输入的用户名进行判断
        for (String name : usernames) {
            if (name.equals(username)) {
                // true
                throw new RegisterException("该用户名已存在");
            }
        }
        System.out.println("该用户名可使用");
    }
}
