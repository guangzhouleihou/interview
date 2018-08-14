package com.leihou.interview.vo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("hello", "world");
        List<String> list2 = Arrays.asList("hello", "welcome");

        List<String> list = list1.stream().filter(item -> list2.contains(item)).collect(Collectors.toList());
        System.out.println(list);
    }


    public static List<Integer> findCommon(List<Integer> a, List<Integer> b) {
        return a.stream().filter(item -> b.contains(item)).collect(Collectors.toList());
    }





}
