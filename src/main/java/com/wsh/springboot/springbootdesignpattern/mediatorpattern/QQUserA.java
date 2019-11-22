package com.wsh.springboot.springbootdesignpattern.mediatorpattern;

/**
 * @Description: 具体同事类A
 * @Author: weixiaohuai
 * @Date: 2019/11/22
 * @Time: 22:05
 */
public class QQUserA extends Colleague {
    private static final String USER_A_REGISTER_KEY = "userA";
    private static final String USER_B_REGISTER_KEY = "userA";
    /**
     * 持有一个抽象中介者对象引用
     */
    private Mediator mediator;

    public QQUserA(Mediator mediator) {
        this.mediator = mediator;
        mediator.register(USER_A_REGISTER_KEY, this);
    }

    @Override
    public void sendMessage() {
        System.out.println("用户A发出消息...");
        mediator.sendMessage(USER_B_REGISTER_KEY);
    }

    @Override
    public void receiveMessage() {
        System.out.println("用户A接收到消息...");
    }
}
