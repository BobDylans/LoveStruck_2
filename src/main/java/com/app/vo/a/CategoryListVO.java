package com.app.vo.a;

import com.diboot.core.binding.annotation.*;
import com.app.entity.Category;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 标签类别; ListVO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class CategoryListVO extends Category  {
    private static final long serialVersionUID = 5886353484625557072L;

}