package com.wsh.springboot.springbootdesignpattern.prototypepattern.shallowclone;

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

        System.out.println(student == student1);

        System.out.println(student.getTeacher() == student1.getTeacher());
        System.out.println("复制前teacher的hashCode： " + student.getTeacher().hashCode());
        System.out.println("复制之后teacher新对象的hashCode： " + student1.getTeacher().hashCode());


        System.out.println("克隆之前student学生的老师: " + student.getTeacher().getName());
        //克隆对象student1将老师姓名修改为张老师，导致旧student的老师姓名也被修改。
        Teacher teacher1 = student1.getTeacher();
        teacher1.setName("张老师");
        System.out.println("克隆之后student学生的老师: " + student.getTeacher().getName());

        System.out.println("克隆之后的新学生的老师: " + student.getTeacher().getName());
    }
}
