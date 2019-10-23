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

        //String是一个例外。
        //   但对于我们编程来说可以和操作基本数据类型一样做，基本没影响。大大方便了我们的编程。
        //
        //   String类型的变量clone后的表现好象也实现了深度clone，但其实只是一个假象。
        //   因为执行 p1.name = "new";语句时，它作用相当于生成了一个新的string类型，然后又赋回给p1.name。
        //   这是因为string被sun公司的工程师写成了一个不可更改的类（immutable class），在所有string类中的函数都不能更改自身的值。
        System.out.println(student == student1);
        System.out.println(student.getName() == student1.getName());
        System.out.println(student.getTeacher() == student1.getTeacher());
        System.out.println("复制前teacher的hashCode： " + student.getTeacher().hashCode());
        System.out.println("复制之后teacher新对象的hashCode： " + student1.getTeacher().hashCode());
    }
}
