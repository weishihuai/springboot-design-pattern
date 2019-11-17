package com.wsh.springboot.springbootdesignpattern.templatepattern;

/**
 * @Description: 抽象模板类
 * @Author: weixiaohuai
 * @Date: 2019/11/17
 * @Time: 20:18
 */
public abstract class AbstractBuildHouse {

    /**
     * 模板方法: 定义为final,子类就不能重写它，也就改变不了整个骨架的实现步骤。
     */
    final void build() {
        layFoundation();
        routing();
        installTiles();
        installWaterPipes();
        //需要建造栅栏时才执行
        if (isNeedFence()) {
            buildFence();
        }
    }

    /**
     * 第一步: 打地基
     */
    protected void layFoundation() {
        System.out.println("第一步: 打地基...");
    }

    /**
     * 第二步: 走线
     */
    protected void routing() {
        System.out.println("第二步: 走线...");
    }

    /**
     * 第三步： 贴瓷砖,可能使用的材料不一致，所以作为抽象方法，让子类去实现
     */
    protected abstract void installTiles();

    /**
     * 第四步: 装水管
     */
    protected void installWaterPipes() {
        System.out.println("第四步: 装水管...");
    }

    /**
     * 第五步：建造栅栏，所以作为抽象方法，让子类去实现
     */
    protected abstract void buildFence();

    /**
     * 钩子函数，控制是否需要建造栅栏
     *
     * @return boolean
     */
    protected boolean isNeedFence() {
        return true;
    }
}
