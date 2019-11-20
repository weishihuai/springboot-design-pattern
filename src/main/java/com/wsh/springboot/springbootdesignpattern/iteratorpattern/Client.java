package com.wsh.springboot.springbootdesignpattern.iteratorpattern;

import java.util.UUID;

/**
 * @Description:
 * @author: weishihuai
 * @Date: 2019/11/20 15:08
 */
public class Client {
    public static void main(String[] args) {
        ClassRoomAggregate classRoomAggregate = new ClassRoomAggregate();
        classRoomAggregate.addStudent(new Student(UUID.randomUUID().toString(), "张三"));
        classRoomAggregate.addStudent(new Student(UUID.randomUUID().toString(), "李四"));
        classRoomAggregate.addStudent(new Student(UUID.randomUUID().toString(), "王五"));
        classRoomAggregate.addStudent(new Student(UUID.randomUUID().toString(), "赵六"));
        classRoomAggregate.addStudent(new Student(UUID.randomUUID().toString(), "田七"));
        Iterator iterator = classRoomAggregate.getIterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student);
        }
    }
}
