package com.wsh.springboot.springbootdesignpattern.proxypattern.staticpattern.jdkdynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description: 代理工厂
 * @Author: weixiaohuai
 * @Date: 2019/11/15
 * @Time: 20:40
 */
public class ProxyFactory {

    /**
     * 维护一个被代理对象
     */
    private Object targetObject;

    public ProxyFactory(Object targetObject) {
        this.targetObject = targetObject;
    }

    /**
     * 为被代理对象生成一个代理对象
     * 1. 根据传入的被代理对象
     * 2. 利用反射机制，返回一个代理对象
     * 3. 使用method.invoke调用被代理类的方法
     *
     * @return 代理对象
     */
    public Object getProxyInstance() {
        /**
         * public static Object newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h)
         * loader: 指定当前被代理对象使用的类加载器
         * interfaces: 被代理对象实现的接口类型
         * handler: 执行被代理对象方法时，触发的事件处理器方法,将当前执行的被代理对象的方法作为参数传入
         */
        Class<?> aClass = targetObject.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        Class<?>[] interfaces = aClass.getInterfaces();
        InvocationHandler handler = (proxy, method, args) -> {
            prev();
            //这里使用到了反射机制
            return method.invoke(targetObject, args);
        };
        return Proxy.newProxyInstance(classLoader, interfaces, handler);
    }

    private void prev() {
        System.out.println("中介帮忙找房东...");
    }

}
