package com.wsh.springboot.springbootdesignpattern.observerpattern;

/**
     * @Description: 观察者角色-C用户
 * @Author: weixiaohuai
 * @Date: 2019/11/21
 * @Time: 20:06
 */
public class UserC implements Observer {

    @Override
    public void update(String name, Double weight) {
        System.out.println("UserC订阅的牛奶名称: " + name + "，重量：" + weight);
    }
}
