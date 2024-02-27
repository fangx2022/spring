package com.lll.feng;

import com.lll.feng.pojo.entity.User;

public class Ms1Test {
    public static void main(String[] args) {
        // String类型
        String s1 = "a";
        String s2 = "b";
        add(s1,s2);
        System.out.println("方法外："+s1+s2);
        // 对象类型
        User user = new User();
        user.setUsername("a");
        user.setPwd("b");
        userUpdate(user);
        System.out.println("user outer:"+user.getUsername()+user.getPwd());
        // 基本类型
        int i = 1;
        int j = 2;
        intAdd(i,j);
        System.out.println("int outer:"+(i+j));
    }

    public static void add(String s1, String s2){
        s1 = s1 + 'q';
        s2 = s2 + 'q';
        System.out.println("方法内："+s1+s2);
    }

    public static void userUpdate(User user){
        user.setUsername("c");
        user.setPwd("d");
        System.out.println("user inner:"+user.getUsername()+user.getPwd());
    }

    public static void intAdd(int i,int j){
        i = i+1;
        j = j+1;
        System.out.println("int inner:"+(i+j));
    }
}
