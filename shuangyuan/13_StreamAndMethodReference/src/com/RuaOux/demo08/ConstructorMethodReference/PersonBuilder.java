package com.RuaOux.demo08.ConstructorMethodReference;
/*
    定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
    // 定义一个方法，根据传递的姓名，创建Person对象
    Person builderPerson(String name);
}
