package com.wsh.springboot.springbootdesignpattern.builderpattern;

/**
 * @Description: 涂装材料
 * @author: weishihuai
 * @Date: 2019/10/24 15:39
 */
public class PaintingMaterial {
    private String name;

    public PaintingMaterial(String name) {
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
        return "PaintingMaterial{" +
                "name='" + name + '\'' +
                '}';
    }
}
