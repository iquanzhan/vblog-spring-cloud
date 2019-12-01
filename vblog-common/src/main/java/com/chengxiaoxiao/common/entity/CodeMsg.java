package com.chengxiaoxiao.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: CodeMsg
 * @description: 封装常用错误
 * @author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2019-12-01
 */
@Data
public class CodeMsg implements Serializable {

    public static CodeMsg ERROR = new CodeMsg(0, ErrorMessageConstant.SUCCESS);


    private Integer code;
    private String msg;

    public CodeMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 添加带参数的错误异常
     *
     * @param obj
     * @return
     */
    public CodeMsg fillArgs(Object... obj) {
        int code = this.code;
        String message = String.format(msg, obj);
        return new CodeMsg(code, message);
    }
}
