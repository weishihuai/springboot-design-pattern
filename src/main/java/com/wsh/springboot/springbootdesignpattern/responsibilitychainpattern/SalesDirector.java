package com.wsh.springboot.springbootdesignpattern.responsibilitychainpattern;

/**
 * @Description: 销售总监
 * @author: weishihuai
 * @Date: 2019/11/26 15:34
 */
public class SalesDirector extends IRequestHandler {
    @Override
    protected void handle(PhotoRequest request) {
        Integer photoNum = request.getPhotoNum();
        if (photoNum > 45 && photoNum <= 50) {
            System.out.println("以我的权限【销售总监】最多可以给你争取到50张精修照片...");
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
