package com.app.dto.a;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.app.entity.TbContentTrends;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* 与动态交互的信息 DTO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class TbContentTrendsDTO extends TbContentTrends  {
    private static final long serialVersionUID = 231206500723363553L;

}