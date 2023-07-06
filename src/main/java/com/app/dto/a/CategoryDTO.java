package com.app.dto.a;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.app.entity.Category;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* 标签类别; DTO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class CategoryDTO extends Category  {
    private static final long serialVersionUID = -1664883835746103761L;

}