package com.wsh.springboot.springbootdesignpattern.mementopattern;

import java.util.UUID;

/**
 * @Description: 客户端
 * @Author: weixiaohuai
 * @Date: 2019/11/23
 * @Time: 21:15
 */
public class Client {
    public static void main(String[] args) {
        //创建一个原始学生对象
        Student student = new Student(UUID.randomUUID().toString(), "张三", 20, 0);
        StudentMemento studentMemento = student.saveStudentMemento();
        Caretaker caretaker = new Caretaker();
        //备份原始学生对象
        caretaker.setStudentMemento(studentMemento);
        //将删除标记改为1，表示已删除
        student.setDeleteFlag(1);
        System.out.println("===========撤销前：============");
        System.out.println(student.toString());

        //由于误删操作，想进行撤销
        //首先获取到memento中保存的备忘录对象
        StudentMemento memento = caretaker.getStudentMemento();
        //回滚
        student.restoreDeleteStduent(memento);
        System.out.println("===========撤销后：============");
        System.out.println(student.toString());
    }
}
