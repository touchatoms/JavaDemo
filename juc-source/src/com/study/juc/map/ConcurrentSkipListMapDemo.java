package com.study.juc.map;

import java.util.concurrent.ConcurrentSkipListMap;


public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        // 可以自己定义比较方式
        ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>();
        map.put("a", "1");
        map.put("c", "3");
        map.put("b", "2");
        System.out.println(map.keySet().toString());
    }
}
