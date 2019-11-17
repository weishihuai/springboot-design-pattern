package com.wsh.springboot.springbootdesignpattern.templatepattern;

/**
 * @Description: 碧桂园小区
 * @Author: weixiaohuai
 * @Date: 2019/11/17
 * @Time: 20:30
 */
public class BiGuiYuanHouse extends AbstractBuildHouse {
    @Override
    protected void installTiles() {
        System.out.println("第三步：贴马可波罗牌子的瓷砖...");
    }

    @Override
    protected void buildFence() {
        System.out.println("第五步：使用铝合金建造栅栏...");
    }
}
