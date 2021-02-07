/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Extends.Override;
/*
方法覆盖重写的注意事项：
1. 必须保证父子类之间方法的名称相同，参数列表也相同。
@Override: 写在方法前面，用来检测是不是有效的正确覆盖重写。
这个注释就算不写，只要满足要求，也是正确的方法的覆盖重写。

2. 子类方法的方回值必须【小于等于】父类方法的返回值范围。
小扩展提示：java.lang.Object类是所有的公共最高父类 （祖宗类），java.lang.String就是Object的子类。

3.  子类方法的权限必须大于等于父类方法的权限修饰符。
小扩展提示：public > protected > (default) > private
备注： (default) 不是关键字default,而是什么都不写留空。

设计原则：
对于已经投入使用的类，尽量不要进行修改。
推荐定义一个新的类，来重复利用其中共性内容，并且添加修改新内容。
 */
public class Demo01Override {
}
