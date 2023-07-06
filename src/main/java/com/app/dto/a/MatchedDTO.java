package com.app.dto.a;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.app.entity.Matched;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* 已匹配表; DTO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class MatchedDTO extends Matched  {
    private static final long serialVersionUID = -2249460772089961304L;

}