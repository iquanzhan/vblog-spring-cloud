package com.chengxiaoxiao.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: PageResult
 * @description: 分页Model封装
 * @author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2019-12-03
 */
@Data
public class PageResult<T> implements Serializable {
    private Integer total;
    private Integer pageSize;
    private Integer pageNumber;
    private List<T> rows;
}
