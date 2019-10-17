package com.wsh.springboot.springbootdesignpattern.singletonpattern.singletonpattern07;

/**
 * @Description: 单例模式第七种写法：静态内部类
 * @author: weixiaohuai
 * @Date: 2019/10/17 14:49
 * <p>
 * 说明:
 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。两者都是采用了类装载的机制来保证初始化实例时只有一个线程。不同的地方在饿汉式方式是只要Singleton类被装载就会实例化，没有Lazy-Loading的作用，而静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化。
 * <p>
 * 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 * <p>
 * 优点：避免了线程不安全，延迟加载，效率高。
 * <p>
 * 优点:
 * 缺点:
 * 综上所述: 该种方式推荐使用
 */
public class SingletonPattern07 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread01());
        Thread t2 = new Thread(new Thread02());
        t1.start();
        t2.start();
    }

}


class Singleton {
    /**
     * 第二步: 构造方法私有化，其他类就无法构造Singleton实例
     */
    private Singleton() {

    }

    /**
     * 第二步: 使用静态内部类
     */
    private static class InnerSingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 第三步: 对外提供一个获得该实例的方法
     */
    public static Singleton getInstance() {
        return InnerSingletonInstance.INSTANCE;
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