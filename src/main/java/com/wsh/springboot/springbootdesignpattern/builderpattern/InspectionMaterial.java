package com.wsh.springboot.springbootdesignpattern.builderpattern;

/**
 * @Description: 检验材料
 * @author: weishihuai
 * @Date: 2019/10/24 15:39
 */
public class InspectionMaterial {
    private String name;

    public InspectionMaterial(String name) {
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
        return "InspectionMaterial{" +
                "name='" + name + '\'' +
                '}';
    }
}
