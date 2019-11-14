package com.wsh.springboot.springbootdesignpattern.facadepattern;

/**
 * @Description: 碗
 * @Author: weixiaohuai
 * @Date: 2019/11/14
 * @Time: 11:26
 */
public class Bowl {

    private static volatile Bowl bowl;

    private Bowl() {
    }

    public static Bowl getInstance() {
        if (null == bowl) {
            synchronized (Bowl.class) {
                if (null == bowl) {
                    bowl = new Bowl();
                }
            }
        }
        return bowl;
    }

    public void washing() {
        System.out.println("洗碗...");
    }

}
