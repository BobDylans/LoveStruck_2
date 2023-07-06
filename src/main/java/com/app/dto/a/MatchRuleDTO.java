package com.app.dto.a;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.app.entity.MatchRule;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* 匹配规则表; DTO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class MatchRuleDTO extends MatchRule  {
    private static final long serialVersionUID = 8794139602863251368L;

}