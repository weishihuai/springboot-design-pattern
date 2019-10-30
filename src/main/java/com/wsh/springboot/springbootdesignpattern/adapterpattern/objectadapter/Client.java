package com.wsh.springboot.springbootdesignpattern.adapterpattern.objectadapter;

/**
 * @Description: 客户端类
 * @author: weishihuai
 * @Date: 2019/10/29 16:15
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCardAdapter sdCard = new SDCardAdapter();
        sdCard.setTfCard(new TFCard());
        //电脑通过适配器完成读取TFCard卡功能
        String message = computer.readSDCard(sdCard);
        System.out.println(message);
    }
}
