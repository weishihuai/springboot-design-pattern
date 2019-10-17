package com.wsh.springboot.springbootdesignpattern.singletonpattern.singletonpattern08;

/**
 * @Description: 单例模式第八种写法：枚举单例
 * @author: weixiaohuai
 * @Date: 2019/10/17 14:49
 * <p>
 * 说明:
 * <p>
 * 优点: 不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * 缺点:
 * 综上所述: 该种方式推荐使用
 */
public class SingletonPattern08 {
    public static void main(String[] args) {
        SingletonInstance instance1 = Singleton.INSTANCE.getInstance();
        SingletonInstance instance2 = Singleton.INSTANCE.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}

/**
 * 首先，在枚举中我们明确了构造方法限制为私有，在我们访问枚举实例时会执行构造方法，同时每个枚举实例都是static final类型的，也就表明只能被实例化一次。在调用构造方法时，我们的单例被实例化。
 * 也就是说，因为enum中的实例被保证只会被实例化一次，所以我们的INSTANCE也被保证实例化一次。
 */
enum Singleton {
    /**
     * 实例
     */
    INSTANCE;

    private SingletonInstance singletonInstance;

    /**
     * 一个enum的构造方法限制是private的，也就是不允许我们调用
     */
    Singleton() {
        singletonInstance = new SingletonInstance();
        System.out.println("执行Singleton()构造方法.....");
    }

    public SingletonInstance getInstance() {
        return singletonInstance;
    }

}

class SingletonInstance {
    int i = 0;

    public SingletonInstance() {
        System.out.println("SingletonInstance()构造器执行了 " + (++i) + " 次");
    }
}