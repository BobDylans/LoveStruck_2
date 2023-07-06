package com.app.dto.a;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.app.entity.Tag;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* 标签; DTO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class TagDTO extends Tag  {
    private static final long serialVersionUID = 386640090552566014L;

}