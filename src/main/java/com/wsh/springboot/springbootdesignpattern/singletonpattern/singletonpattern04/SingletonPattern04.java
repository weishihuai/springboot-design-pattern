package com.wsh.springboot.springbootdesignpattern.singletonpattern.singletonpattern04;

/**
 * @Description: 单例模式第三种写法：懒汉式 - 线程安全 - 同步方法方式
 * @author: weixiaohuai
 * @Date: 2019/10/17 14:49
 * <p>
 * 说明:
 * 懒汉式 - 线程安全 - 同步方法方式方式:
 * 优点: 解决了上面一种写法在多线程环境下会new多实例的情况
 * 缺点: 效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
 * 综上所述: 该种方式不推荐使用
 */
public class SingletonPattern04 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        //com.wsh.springboot.springbootdesignpattern.singletonpattern.singletonpattern03.Singleton@4f023edb
        System.out.println(singleton);
        Singleton singleton1 = Singleton.getInstance();
        //com.wsh.springboot.springbootdesignpattern.singletonpattern.singletonpattern03.Singleton@4f023edb
        System.out.println(singleton1);
        //可见，获取的两个实例地址是一样。

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
     * 第三步: 对外提供一个获得该实例的方法
     * 注意：每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步
     */
    public synchronized static Singleton getInstance() {
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