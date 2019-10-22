package com.wsh.springboot.springbootdesignpattern.prototypepattern.shallowclone;

/**
 * @Description:
 * @author: weishihuai
 * @Date: 2019/10/22 20:11
 */
public class Student implements Cloneable {
    private double weight;
    private Integer pkid;
    private String name;
    private Teacher teacher;

    public Student(double weight, Integer pkid, String name, Teacher teacher) {
        this.weight = weight;
        this.pkid = pkid;
        this.name = name;
        this.teacher = teacher;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Integer getPkid() {
        return pkid;
    }

    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    protected Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return object;
    }

    @Override
    public String toString() {
        return "Student{" +
                "weight=" + weight +
                ", pkid=" + pkid +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
