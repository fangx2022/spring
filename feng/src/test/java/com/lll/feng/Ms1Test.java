package com.lll.feng;

import com.lll.feng.pojo.entity.UserInfoEntity;

public class Ms1Test {
    public static void main(String[] args) {
        // String类型
        String s1 = "a";
        String s2 = "b";
        add(s1,s2);
        System.out.println("方法外："+s1+s2);
        // 对象类型
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        userInfoEntity.setUsername("a");
        userInfoEntity.setPassword("b");
        userUpdate(userInfoEntity);
        System.out.println("user outer:"+ userInfoEntity.getUsername()+ userInfoEntity.getPassword());
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

    public static void userUpdate(UserInfoEntity userInfoEntity){
        userInfoEntity.setUsername("c");
        userInfoEntity.setPassword("d");
        System.out.println("user inner:"+ userInfoEntity.getUsername()+ userInfoEntity.getPassword());
    }

    public static void intAdd(int i,int j){
        i = i+1;
        j = j+1;
        System.out.println("int inner:"+(i+j));
    }
}
