package com.wsh.springboot.springbootdesignpattern.prototypepattern.deepclone;

/**
 * @Description: 客户端
 * @author: weishihuai
 * @Date: 2019/10/22 20:13
 */
public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "黄老师");
        Student student = new Student(50.0D, 1, "张三", teacher);
        Student student1 = (Student) student.clone();

        System.out.println(student);
        System.out.println(student1);

        System.out.println(student == student1);
        System.out.println(student.getTeacher() == student1.getTeacher());
        System.out.println("复制前teacher的hashCode： " + student.getTeacher().hashCode());
        System.out.println("复制之后teacher新对象的hashCode： " + student1.getTeacher().hashCode());
    }
}
