package com.wsh.springboot.springbootdesignpattern.templatepattern;

/**
 * @Description: 恒大御景
 * @Author: weixiaohuai
 * @Date: 2019/11/17
 * @Time: 20:30
 */
public class HengdaSceneryHouse extends AbstractBuildHouse {
    @Override
    protected void installTiles() {
        System.out.println("第三步：贴玛丽欧牌子的瓷砖...");
    }

    @Override
    protected void buildFence() {
        //空实现即可
    }

    @Override
    protected boolean isNeedFence() {
        //使用父类定义的钩子函数，不需要建栅栏
        return false;
    }
}
