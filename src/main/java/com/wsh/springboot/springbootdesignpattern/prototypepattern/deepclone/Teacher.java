package com.wsh.springboot.springbootdesignpattern.prototypepattern.deepclone;

/**
 * @Description: 教师类
 * @author: weishihuai
 * @Date: 2019/10/22 20:10
 */
public class Teacher implements Cloneable {
    private Integer pkid;
    private String name;

    public Teacher(Integer pkid, String name) {
        this.pkid = pkid;
        this.name = name;
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

    @Override
    public String toString() {
        return "Teacher{" +
                "pkid='" + pkid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return object;
    }
}
