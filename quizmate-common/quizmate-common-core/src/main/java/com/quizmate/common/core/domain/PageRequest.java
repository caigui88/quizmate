package com.quizmate.common.core.domain;

import com.quizmate.common.core.constant.CommonConstant;
import lombok.Data;

/**
 * <h3>quizmate</h3>
 * <p>分页请求</p>
 *
 * @author moru
 * @since 2025-08-29 00:27
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认升序）
     */
    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}