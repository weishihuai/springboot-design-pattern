package com.wsh.springboot.springbootdesignpattern.proxypattern.staticpattern;

/**
 * @Description: 客户端类
 * @author: weishihuai
 * @Date: 2019/11/15 17:17
 */
public class Client {
    public static void main(String[] args) {
        //我们只与中介打交道，实际上出租房子的还是房东
        DailyBehavior proxy = new LettingAgentProxy(new Landlord());
        proxy.rentApartment();
    }
}
