package com.app.dto;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.app.entity.Test;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* 代码测试 DTO定义
* @author shurun
* @version 1.0
* @date 2023-07-03
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class TestDTO extends Test  {
    private static final long serialVersionUID = 4920782191428504955L;

}