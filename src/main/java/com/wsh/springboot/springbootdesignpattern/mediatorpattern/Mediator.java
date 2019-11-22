package com.wsh.springboot.springbootdesignpattern.mediatorpattern;

/**
 * @Description: 抽象中介者：定义了同事对象到中介者对象的接口
 * @Author: weixiaohuai
 * @Date: 2019/11/22
 * @Time: 21:45
 */
public abstract class Mediator {

    /**
     * 注册同事方法
     */
    public abstract void register(String key, Colleague colleague);

    /**
     * 发送消息
     */
    public abstract void sendMessage(String key);

}
