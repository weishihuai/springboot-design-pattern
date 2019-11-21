package com.wsh.springboot.springbootdesignpattern.iteratorpattern;

/**
 * @Description: 班级具体聚合对象
 * @author: weishihuai
 * @Date: 2019/11/20 14:56
 */
public class ClassRoomAggregate implements Aggregate {

    /**
     * 当前索引
     */
    private int currentIndex = 0;

    private Student[] students;

    public ClassRoomAggregate() {
        this.students = new Student[5];
    }

    /**
     * 添加学生
     *
     * @param student 学生
     */
    public void addStudent(Student student) {
        students[currentIndex] = student;
        currentIndex++;
    }

    /**
     * 根据下标获取学生对象
     *
     * @param index 下标
     * @return
     */
    public Student getStudent(int index) {
        return students[index];
    }

    /**
     * 获取容器长度
     *
     * @return 容器长度
     */
    public int length() {
        return students.length;
    }

    @Override
    public Iterator getIterator() {
        return new ClassRoomIterator(this);
    }
}
