package com.wsh.springboot.springbootdesignpattern.adapterpattern.objectadapter;

/**
 * @Description: 适配器类(SD卡 - - > 适配 - - > TF卡)
 * @author: weishihuai
 * @Date: 2019/10/29 16:16
 * <p>
 * 对象适配器：对象适配器不通过继承的方式，而是通过组合或者聚合被适配的类，完成适配
 * 避免了单继承的局限性
 */
public class SDCardAdapter implements SDCard {

    private TFCard tfCard;

    public void setTfCard(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSDCard() {
        return tfCard.readTFCard();
    }
}
