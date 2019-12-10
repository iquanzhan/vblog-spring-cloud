package com.chengxiaoxiao.user.exception;
import com.chengxiaoxiao.common.entity.CodeMsg;
import com.chengxiaoxiao.common.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: GlobelExceptionHandler
 * @description: 全局异常处理器
 * @author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2019-12-10
 */
@ControllerAdvice
@ResponseBody
public class GlobelExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result<String> exceptionHandler(HttpServletRequest request, Exception e){
        e.printStackTrace();
        if(e instanceof GlobleException){
            GlobleException ex = (GlobleException) e;
            return Result.error(ex.getCm());
        }
        else {
            return Result.error(CodeMsg.ERROR);
        }
    }
}
