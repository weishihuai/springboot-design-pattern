package com.wsh.springboot.springbootdesignpattern.proxypattern.staticpattern.cglibdynamic;

/**
 * @Description: 客户端类
 * @author: weishihuai
 * @Date: 2019/11/15 17:17
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象，并传入需要被代理的对象
        ProxyFactory proxyFactory = new ProxyFactory(new Landlord());
        //获取到被代理对象的子类，即代理对象
        Landlord proxyInstance = (Landlord) proxyFactory.getProxyInstance();
        //class com.wsh.springboot.springbootdesignpattern.proxypattern.staticpattern.cglibdynamic.Landlord$$EnhancerByCGLIB$$5d45b22c
        System.out.println(proxyInstance.getClass());
        proxyInstance.rentApartment();
    }
}
