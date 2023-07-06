package com.app.dto.a;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.app.entity.Profile;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* 个人资料表; DTO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class ProfileDTO extends Profile  {
    private static final long serialVersionUID = 6868889751716119094L;

}