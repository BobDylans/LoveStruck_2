package com.app.vo.a;

import com.diboot.core.binding.annotation.*;
import com.app.entity.CategoryCircle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 类别圈子表; DetailVO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class CategoryCircleDetailVO extends CategoryCircle  {
    private static final long serialVersionUID = 1961968493058185363L;

}