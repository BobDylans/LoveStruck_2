package com.app.vo.a;

import com.diboot.core.binding.annotation.*;
import com.app.entity.MatchRule;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 匹配规则表; ListVO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class MatchRuleListVO extends MatchRule  {
    private static final long serialVersionUID = 2439390045998913290L;

}