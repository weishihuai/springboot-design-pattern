package com.wsh.springboot.springbootdesignpattern.mementopattern;

/**
 * @Description: 原始对象
 * @Author: weixiaohuai
 * @Date: 2019/11/23
 * @Time: 21:05
 */
public class Student {
    private String id;
    private String name;
    private Integer age;
    private Integer deleteFlag;

    public Student() {
    }

    public Student(String id, String name, Integer age, Integer deleteFlag) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", deleteFlag=" + deleteFlag +
                '}';
    }

    /**
     * 保存学生原始对象
     *
     * @return 学生原始对象
     */
    public StudentMemento saveStudentMemento() {
        return new StudentMemento(id, name, age, deleteFlag);
    }

    /**
     * 恢复原始对象的方法
     *
     * @param studentMemento 备忘录对象
     */
    public void restoreDeleteStduent(StudentMemento studentMemento) {
        this.age = studentMemento.getAge();
        this.id = studentMemento.getId();
        this.name = studentMemento.getName();
        this.deleteFlag = studentMemento.getDeleteFlag();
    }

}
