package com.study.juc.map;

// 测试将对象作为key
public class ObjectHashMapDemo {

    public static void main(String[] args) {
        HashMap1_7<User, String> map = new HashMap1_7<>();
        User user = new User();
        map.put(user, "test");
        user = new User();
        System.out.println(map.get(user));
    }
}

class User {
    String name;
}

