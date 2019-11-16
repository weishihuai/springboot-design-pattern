package com.wsh.springboot.springbootdesignpattern.proxypattern.staticpattern.cglibdynamic;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description: 代理工厂
 * @Author: weixiaohuai
 * @Date: 2019/11/15
 * @Time: 20:40
 */
public class ProxyFactory implements MethodInterceptor {

    /**
     * 维护一个被代理对象
     */
    private Object targetObject;

    public ProxyFactory(Object targetObject) {
        this.targetObject = targetObject;
    }

    /**
     * 为被代理对象生成一个代理对象
     * 1. 实现MethodInterceptor接口
     * 2. 重写intercept()拦截器方法，实现被代理对象业务方法的调用
     *
     * @return 代理对象
     */
    public Object getProxyInstance() {
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置父类的Class
        enhancer.setSuperclass(targetObject.getClass());
        //回调方法
        enhancer.setCallback(this);
        //返回代理对象
        return enhancer.create();
    }

    private void prev() {
        System.out.println("中介帮忙找房东...");
    }

    /**
     * 实现对被代理对象方法的调用
     *
     * @param o
     * @param method      反射方法对象
     * @param args        被代理对象方法的参数
     * @param methodProxy
     * @return Object
     * @throws Throwable 异常
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        this.prev();
        return method.invoke(targetObject, args);
    }
}
