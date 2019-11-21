package com.wsh.springboot.springbootdesignpattern.iteratorpattern;

/**
 * @Description: 学生类
 * @author: weishihuai
 * @Date: 2019/11/20 14:54
 */
public class Student {
    private String stuId;
    private String stuName;

    public Student(String stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                '}';
    }
}
