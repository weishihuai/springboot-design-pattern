package com.wsh.springboot.springbootdesignpattern.mediatorpattern;

/**
 * @Description: 具体同事类B
 * @Author: weixiaohuai
 * @Date: 2019/11/22
 * @Time: 22:05
 */
public class QQUserB extends Colleague {
    /**
     * 持有一个抽象中介者对象引用
     */
    private Mediator mediator;
    private static final String USER_A_REGISTER_KEY = "userA";
    private static final String USER_B_REGISTER_KEY = "userB";

    public QQUserB(Mediator mediator) {
        this.mediator = mediator;
        mediator.register(USER_B_REGISTER_KEY, this);
    }

    @Override
    public void sendMessage() {
        System.out.println("用户B发出消息...");
        mediator.sendMessage(USER_A_REGISTER_KEY);
    }

    @Override
    public void receiveMessage() {
        System.out.println("用户B接收到消息...");
    }
}
