package com.wsh.springboot.springbootdesignpattern.responsibilitychainpattern;

/**
 * @Description: 销售经理
 * @author: weishihuai
 * @Date: 2019/11/26 15:34
 */
public class SalesManager extends IRequestHandler {
    @Override
    protected void handle(PhotoRequest request) {
        Integer photoNum = request.getPhotoNum();
        if (photoNum > 0 && photoNum <= 45) {
            System.out.println("以我的权限【销售经理】最多可以给你争取到45张精修照片...");
        } else {
            IRequestHandler nextHandler = getNextHandler();
            if (null != nextHandler) {
                nextHandler.handle(request);
            } else {
                System.out.println("抱歉，无法满足你们的要求...");
            }
        }
    }
}
