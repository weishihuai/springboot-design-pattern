package com.wsh.springboot.springbootdesignpattern.observerpattern;

/**
 * @Description: 抽象观察者角色
 * @Author: weixiaohuai
 * @Date: 2019/11/21
 * @Time: 20:05
 */
public interface Observer {
    /**
     * 观察者更新方法
     */
    void update(String name, Double weight);

}
