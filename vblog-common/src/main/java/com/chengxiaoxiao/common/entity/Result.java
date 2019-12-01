package com.chengxiaoxiao.common.entity;

import lombok.Data;

/**
 * @ClassName: Result
 * @description: 统一请求的结果返回类
 * @author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2019-12-01
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;


    public Result() {
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(T data) {
        this.data = data;
    }

    public Result(CodeMsg cm) {
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }


    /**
     * 成功的回调
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(data);
    }

    /**
     * 错误的回调
     *
     * @param cm
     * @param <T>
     * @return
     */
    public static <T> Result<T> error(CodeMsg cm) {
        return new Result<>(cm);
    }

}
