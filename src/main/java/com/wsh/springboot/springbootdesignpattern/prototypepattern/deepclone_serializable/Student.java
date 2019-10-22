package com.wsh.springboot.springbootdesignpattern.prototypepattern.deepclone_serializable;

import java.io.*;

/**
 * @Description:
 * @author: weishihuai
 * @Date: 2019/10/22 20:11
 */
public class Student implements Serializable {
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
    public String toString() {
        return "Student{" +
                "weight=" + weight +
                ", pkid=" + pkid +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }


    public Student deepCloneBySerializable() {
        Student student = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            student = (Student) objectInputStream.readObject();
            return student;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != objectInputStream) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != byteArrayInputStream) {
                try {
                    byteArrayInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != objectOutputStream) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != byteArrayOutputStream) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return student;
    }
}
