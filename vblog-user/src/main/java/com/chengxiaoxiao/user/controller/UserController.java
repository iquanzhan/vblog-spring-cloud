package com.chengxiaoxiao.user.controller;

import com.chengxiaoxiao.api.controller.UserControllerApi;
import com.chengxiaoxiao.common.entity.CodeMsg;
import com.chengxiaoxiao.common.entity.Result;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController
 *
 * @Description:
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2019-12-11 21:46
 */
@RestController
@RequestMapping(value = "/user")
public class UserController implements UserControllerApi {

    @Override
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Result findAll() {
        return Result.error(CodeMsg.ERROR);
    }
}
