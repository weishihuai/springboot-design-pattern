package com.wsh.springboot.springbootdesignpattern.proxypattern.staticpattern.jdkdynamic;

/**
 * @Description: 客户端类
 * @author: weishihuai
 * @Date: 2019/11/15 17:17
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Landlord());
        DailyBehavior proxyInstance = (DailyBehavior) proxyFactory.getProxyInstance();
        //class com.sun.proxy.$Proxy0
        System.out.println(proxyInstance.getClass());
        proxyInstance.rentApartment();
    }
}
