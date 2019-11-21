package com.wsh.springboot.springbootdesignpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 具体被观察者角色
 * @Author: weixiaohuai
 * @Date: 2019/11/21
 * @Time: 20:07
 */
public class MilkSubject implements Subject {
    /**
     * 名称
     */
    private String name;
    /**
     * 重量
     */
    private Double weight;
    /**
     * 持有很多观察者角色对象引用
     */
    private List<Observer> observerList = new ArrayList<>(100);

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        //找到所有订阅的观察者，通知他们进行状态更新
        for (Observer o : observerList) {
            o.update(getName(), getWeight());
        }
    }

    /**
     * 设置牛奶名称和重量消息，并且通知所有观察者更新状态
     *
     * @param name   名称
     * @param weight 重量
     */
    public void sendMilk(String name, Double weight) {
        this.name = name;
        this.weight = weight;
        //通知所有观察者更新状态
        this.notifyAllObservers();
    }

}
