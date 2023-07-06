package com.app.mapper.a;

import com.diboot.core.mapper.BaseCrudMapper;
import com.app.entity.MatchRule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.io.Serializable;

/**
* 匹配规则表;Mapper
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Mapper
public interface MatchRuleMapper extends BaseCrudMapper<MatchRule> {

}

