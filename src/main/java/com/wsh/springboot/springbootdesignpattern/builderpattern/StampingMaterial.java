package com.wsh.springboot.springbootdesignpattern.builderpattern;

/**
 * @Description: 冲压材料
 * @author: weishihuai
 * @Date: 2019/10/24 15:39
 */
public class StampingMaterial {
    private String name;

    public StampingMaterial(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StampingMaterial{" +
                "name='" + name + '\'' +
                '}';
    }
}
