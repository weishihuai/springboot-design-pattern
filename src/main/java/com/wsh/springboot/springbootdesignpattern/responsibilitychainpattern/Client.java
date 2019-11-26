package com.wsh.springboot.springbootdesignpattern.responsibilitychainpattern;

/**
 * @Description:
 * @author: weishihuai
 * @Date: 2019/11/26 15:39
 */
public class Client {
    public static void main(String[] args) {
        IRequestHandler salesManager = new SalesManager();
        IRequestHandler salesDirector = new SalesDirector();
        IRequestHandler generalManager = new GeneralManager();
        //直线链式调用
        salesManager.setNextHandler(salesDirector);
        salesDirector.setNextHandler(generalManager);

        PhotoRequest request = new PhotoRequest("REFINEMENT", 52);
        salesManager.handle(request);

        request = new PhotoRequest("normal", 45);
        salesManager.handle(request);

        request = new PhotoRequest("normal", 60);
        salesManager.handle(request);
    }
}
