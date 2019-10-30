package com.wsh.springboot.springbootdesignpattern.adapterpattern.classadapter;

/**
 * @Description: 适配器类(SD卡 - - > 适配 - - > TF卡)
 * @author: weishihuai
 * @Date: 2019/10/29 16:16
 * <p>
 * 类适配器： 继承源头类（extends），并且实现目标接口（implements），完成适配
 */
public class SDCardAdapter extends TFCard implements SDCard {

    @Override
    public String readSDCard() {
        return super.readTFCard();
    }
}
