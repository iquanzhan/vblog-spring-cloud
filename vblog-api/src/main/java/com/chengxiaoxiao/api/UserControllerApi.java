package com.chengxiaoxiao.api;


import com.chengxiaoxiao.common.entity.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: UserControllerApi
 * @description:
 * @author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2019-12-03
 */
@Api(value = "用户管理接口", description = "提供对用户的增删改差等操作")
public interface UserControllerApi {

    @ApiOperation(value = "获取所有用户列表", notes = "获取所有用户列表")
    Result findAll();


}
