package com.wsh.springboot.springbootdesignpattern.templatepattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("=======碧桂园=======");
        AbstractBuildHouse biGuiYuanHouse = new BiGuiYuanHouse();
        biGuiYuanHouse.build();
        
        System.out.println("=======恒大御景=======");
        AbstractBuildHouse hengdaSceneryHouse = new HengdaSceneryHouse();
        hengdaSceneryHouse.build();
    }
}
