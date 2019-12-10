package com.chengxiaoxiao.user.exception;

import com.chengxiaoxiao.common.entity.CodeMsg;

/**
 * @ClassName: GlobleException
 * @description: 定义全局异常，与CodeMsg适配，  异常时可使用throw new GlobleException(CodeMsg.MOBILE_NOT_EXIST);  进行抛出。
 * @author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2019-12-10
 */
public class GlobleException extends RuntimeException {

    private CodeMsg cm;

    public GlobleException(CodeMsg cm) {
        super(cm.toString());
        this.cm = cm;
    }

    public CodeMsg getCm() {
        return cm;
    }
}
