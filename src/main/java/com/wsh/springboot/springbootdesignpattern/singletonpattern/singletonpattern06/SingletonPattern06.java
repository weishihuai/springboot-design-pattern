package com.wsh.springboot.springbootdesignpattern.singletonpattern.singletonpattern06;

/**
 * @Description: 单例模式第六种写法：双重检查
 * @author: weixiaohuai
 * @Date: 2019/10/17 14:49
 * <p>
 * 说明:
 * 双重检查方式:
 * Double-Check概念对于多线程开发者来说不会陌生，如代码中所示，我们进行了两次if (singleton == null)检查，这样就可以保证线程安全了。这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象。
 * <p>
 * 优点: 线程安全；延迟加载；效率较高。
 * 缺点:
 * 综上所述: 该种方式推荐使用
 */
public class SingletonPattern06 {

    public static void main(String[] args) {
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
     */
    public static Singleton getInstance() {
        if (null == instance) {
            // 假设这里已经有多个线程A、B同时进来,假设A先进去判断实例为空，那么A先创建Singleton实例，
            // 当B进去同步块的时候，由于使用了第二重检查，判断实例已经创建了，所以直接返回A创建好的实例，不会重复创建多个实例。
            // 线程安全
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
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