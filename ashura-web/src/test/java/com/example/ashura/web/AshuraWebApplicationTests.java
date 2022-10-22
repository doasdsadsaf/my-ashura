package com.example.ashura.web;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class AshuraWebApplicationTests {

    @Test
    void contextLoads() {
    }

//    /**
//     * jdk11 新特性示例
//     */
//    @Test
//    public void jdk11Test(){
//        // 1.用来判断字符串是不是空字符"“或者trim()之后(” ")为空字符:
//        String blankStr = "    ";
//        // true
//        boolean trueVal = blankStr.isBlank();
//
//        //2 . 将一个字符串按照行终止符（换行符\n或者回车符\r）进行分割，并将分割为Stream流:
//        String newStr = "Hello Java 11 \n felord.cn \r 2021-09-28";
//
//        Stream<String> lines = newStr.lines();
//        lines.forEach(System.out::println);
//
//
//        // 3.按照给定的次数重复串联字符串的内容：
//        String str = "HELLO";
//        // 空字符
//        String empty = str.repeat(0);
//        // HELLO
//        String repeatOne = str.repeat(1);
//        // HELLOHELLO
//        String repeatTwo = str.repeat(2);
//
//       //4. 集合转对应类型的数组
//        List<String> sampleList = Arrays.asList("张三", "java 11");
//        // array = {"张三", "java 11"};
//        String[] array = sampleList.toArray(String[]::new);
//
//
//        List<String> sList = Arrays.asList("张三", "java 11","jack");
//        // 断言取反
//        List<String> result = sList.stream()
//                // 过滤以j开头的字符串
//                .filter(s -> s.startsWith("j"))
//                // 同时不包含11的字符串
//                .filter(Predicate.not(s -> s.contains("11")))
//                .collect(Collectors.toList());
//        // var可以用于修饰Lambda局部变量
//        List<String> abList = Arrays.asList("张三", "java 11","jack");
//        List<String> result2 = abList.stream()
//                // 过滤以j开头的字符串
//                .filter((@NotNull var s) -> s.startsWith("j"))
//                // 同时不包含11的字符串
//                .filter(Predicate.not((@NotNull var s) -> s.contains("11")))
//                .collect(Collectors.toList());
//
//    }

}
