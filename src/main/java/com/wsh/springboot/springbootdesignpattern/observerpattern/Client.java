package com.wsh.springboot.springbootdesignpattern.observerpattern;

public class Client {
    public static void main(String[] args) {
        MilkSubject subject = new MilkSubject();
        //牛奶站点有两个用户订阅
        subject.registerObserver(new UserA());
        subject.registerObserver(new UserB());
        subject.registerObserver(new UserC());

        //派送牛奶，并且通知所有用户拿牛奶
        subject.sendMilk("谷粒多牛奶", 1.0D);

        System.out.println("==============");
        //假如隔天派送的牛奶换了。
        subject.sendMilk("蒙牛牛奶", 2.0D);
    }
}
