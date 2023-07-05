package com.app.dto.a;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.app.entity.TextT;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* text DTO定义
* @author shurun
* @version 1.0
* @date 2023-07-05
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class TextTDTO extends TextT  {
    private static final long serialVersionUID = -6803522419021714664L;

}