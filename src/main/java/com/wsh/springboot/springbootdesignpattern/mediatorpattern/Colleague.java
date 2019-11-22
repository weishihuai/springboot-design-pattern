package com.wsh.springboot.springbootdesignpattern.mediatorpattern;

/**
 * @Description: 抽象同事类
 * @Author: weixiaohuai
 * @Date: 2019/11/22
 * @Time: 21:47
 */
public abstract class Colleague {

    /**
     * 发送消息
     */
    public abstract void sendMessage();

    /**
     * 接收消息
     */
    public abstract void receiveMessage();

}
