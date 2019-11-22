package com.wsh.springboot.springbootdesignpattern.mediatorpattern;

public class Client {
    public static void main(String[] args) {
        Mediator qqServer = new QQServer();
        Colleague userA = new QQUserA(qqServer);
        Colleague userB = new QQUserB(qqServer);
        //用户A发出消息
        userA.sendMessage();

        System.out.println("==============");

        //用户B发出消息
        userB.sendMessage();
    }
}
