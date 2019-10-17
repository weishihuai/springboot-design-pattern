package com.wsh.springboot.springbootdesignpattern.singletonpattern.singletonpattern02;

/**
 * @Description: 单例模式第二种写法：饿汉式 - 静态代码块初始化方式
 * @author: weixiaohuai
 * @Date: 2019/10/17 14:49
 * <p>
 * 说明:
 * 饿汉式 - 静态代码块初始化方式:
 * 优点: 写法简单,在类装载的时候就完成实例化,避免了线程同步问题。
 * 缺点: 在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 * 综上所述: 饿汉式 - 静态代码块初始化方式跟前面的静态常量方式差不多，优缺点都一样，只不过在静态代码块中进行初始化而已，所以也只能说是可用，毕竟还不是最佳写法。
 */
public class SingletonPattern02 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        //com.wsh.springboot.springbootdesignpattern.singletonpattern.singletonpattern02.Singleton@4f023edb
        System.out.println(singleton);
        Singleton singleton1 = Singleton.getInstance();
        //com.wsh.springboot.springbootdesignpattern.singletonpattern.singletonpattern02.Singleton@4f023edb
        System.out.println(singleton1);
        //可见，获取的两个实例地址是一样。
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
     * 第三步: 静态代码块中初始化Singleton实例
     */
    static {
        instance = new Singleton();
    }

    /**
     * 第四步: 对外提供一个获得该实例的方法
     */
    public static Singleton getInstance() {
        return instance;
    }
}
