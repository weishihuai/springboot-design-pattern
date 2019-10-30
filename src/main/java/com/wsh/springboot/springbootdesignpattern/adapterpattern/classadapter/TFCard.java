package com.wsh.springboot.springbootdesignpattern.adapterpattern.classadapter;

/**
 * @Description: TF内存卡（被适配的类）
 * @author: weishihuai
 * @Date: 2019/10/29 16:11
 */
public class TFCard {

    /**
     * 读取TF内存卡信息
     *
     * @return String
     */
    public String readTFCard() {
        return "read TFCard...";
    }
}
