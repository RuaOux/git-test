package com.RuaOux.annottation;
@MyAnno(age = 12,name = "RuaOux",per = Person.P1,anno2 = @MyAnno2,show3 = {"abc","bbb"})
@MyAnno3
public class Worker {
    @MyAnno3
    public String name;

    @MyAnno3
    public void show(){

    }
}
