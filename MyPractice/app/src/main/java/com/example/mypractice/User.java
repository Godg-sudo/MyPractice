package com.example.mypractice;

/**
 * Created by 11861 on 2020/2/24.
 */

public class User {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }

    @Override
    public String toString(){
        return "User{" + "name=" + name + '\'' + ",age=" + age + '}';
    }
}
