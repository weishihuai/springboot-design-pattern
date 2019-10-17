package com.wsh.springboot.springbootdesignpattern.singletonpattern.singletonpattern03;

/**
 * @Description: 单例模式第三种写法：懒汉式 - 线程不安全方式
 * @author: weixiaohuai
 * @Date: 2019/10/17 14:49
 * <p>
 * 说明:
 * 懒汉式 - 线程不安全方式:
 * 优点: 支持Lazy Loading懒加载，但是只能在单线程下使用
 * 缺点: 在多线程下，一个线程进入了判断实例是否为空，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式。
 * 综上所述: 该种方式不推荐使用
 */
public class SingletonPattern03 {

    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
//        //com.wsh.springboot.springbootdesignpattern.singletonpattern.singletonpattern03.Singleton@4f023edb
//        System.out.println(singleton);
//        Singleton singleton1 = Singleton.getInstance();
//        //com.wsh.springboot.springbootdesignpattern.singletonpattern.singletonpattern03.Singleton@4f023edb
//        System.out.println(singleton1);
//        //可见，获取的两个实例地址是一样。

        Thread t1 = new Thread(new Thread01());
        Thread t2 = new Thread(new Thread02());
        t1.start();
        t2.start();
    }

}


class Singleton {
    /**
     * 第一步: 定义一个Singleton对象
     */
    private static Singleton instance;

    /**
     * 第二步: 构造方法私有化，其他类就无法构造Singleton实例
     */
    private Singleton() {

    }

    /**
     * 第三步: 对外提供一个获得该实例的方法,首先判断是否存在单例实例，不存在的时候才去new对象.
     * 注意：多个线程同时进来的话，都进行判断，如果同时判断为空，那么会造成new了多个实例，所以只能单线程使用。
     */
    public static Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }
}

class Thread01 implements Runnable {

    private Singleton singleton;

    @Override
    public void run() {
        singleton = Singleton.getInstance();
        System.out.println("Thread01-->" + singleton);
    }
}


class Thread02 implements Runnable {

    private Singleton singleton;

    @Override
    public void run() {
        singleton = Singleton.getInstance();
        System.out.println("Thread02-->" + singleton);
    }
}