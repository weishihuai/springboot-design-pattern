package com.wsh.springboot.springbootdesignpattern.strategypattern;

import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Description: 策略模式源码应用分析
 * @author: weishihuai
 * @Date: 2019/11/26 13:54
 */
public class SourceCode {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(UUID.randomUUID().toString(), "张三", 22));
        studentList.add(new Student(UUID.randomUUID().toString(), "李四", 25));
        studentList.add(new Student(UUID.randomUUID().toString(), "王五", 18));

        //抽象策略类 public interface Comparator<T> { }
        //具体策略角色
        Comparator<Student> comparator = (student1, student2) -> student1.getAge() - student2.getAge();

        //Context上下文角色，传入具体的策略排序算法
        //升序
        Collections.sort(studentList, comparator);
        System.out.println(studentList);

        comparator = (student1, student2) -> student2.getAge() - student1.getAge();
        //降序
        Collections.sort(studentList, comparator);
        System.out.println(studentList);
    }
}

class Student {
    private String id;
    private String name;
    private Integer age;

    public Student(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
