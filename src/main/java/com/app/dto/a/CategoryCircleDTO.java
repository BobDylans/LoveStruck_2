package com.app.dto.a;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.app.entity.CategoryCircle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* 类别圈子表; DTO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class CategoryCircleDTO extends CategoryCircle  {
    private static final long serialVersionUID = 5806955730098513259L;

}