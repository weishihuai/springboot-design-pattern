package com.wsh.springboot.springbootdesignpattern.mementopattern;

/**
 * @Description: 学生备忘录对象
 * @Author: weixiaohuai
 * @Date: 2019/11/23
 * @Time: 21:08
 */
public class StudentMemento {
    private String id;
    private String name;
    private Integer age;
    private Integer deleteFlag;

    public StudentMemento(String id, String name, Integer age, Integer deleteFlag) {
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
}
