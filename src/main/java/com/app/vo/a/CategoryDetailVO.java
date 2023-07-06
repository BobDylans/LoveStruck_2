package com.app.vo.a;

import com.diboot.core.binding.annotation.*;
import com.app.entity.Category;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 标签类别; DetailVO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class CategoryDetailVO extends Category  {
    private static final long serialVersionUID = -8883669648796851966L;

}