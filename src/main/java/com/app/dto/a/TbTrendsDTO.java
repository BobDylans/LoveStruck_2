package com.app.dto.a;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.app.entity.TbTrends;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* 评论区 DTO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class TbTrendsDTO extends TbTrends  {
    private static final long serialVersionUID = 6932440006632762478L;

}