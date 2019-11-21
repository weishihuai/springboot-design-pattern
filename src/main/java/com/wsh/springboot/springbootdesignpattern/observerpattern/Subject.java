package com.wsh.springboot.springbootdesignpattern.observerpattern;

/**
 * @Description: 抽象被观察者角色
 * @Author: weixiaohuai
 * @Date: 2019/11/21
 * @Time: 20:03
 */
public interface Subject {
    /**
     * 新增观察者订阅
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者订阅
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyAllObservers();

}
