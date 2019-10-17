package com.wsh.springboot.springbootdesignpattern.singletonpattern.singletonpattern05;

/**
 * @Description: 单例模式第三种写法：懒汉式 - 线程安全 - 同步代码块
 * @author: weixiaohuai
 * @Date: 2019/10/17 14:49
 * <p>
 * 说明:
 * 懒汉式 - 线程安全 - 同步代码块方式:
 * 由于第四种实现方式同步效率太低，所以摒弃同步方法，改为同步产生实例化的的代码块。但是这种同步并不能起到线程同步的作用。跟第3种实现方式遇到的情形一致，假如一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 * 优点:
 * 缺点:
 * 综上所述: 该种方式不推荐使用
 */
public class SingletonPattern05 {

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
            synchronized (Singleton.class) {
                instance = new Singleton();
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