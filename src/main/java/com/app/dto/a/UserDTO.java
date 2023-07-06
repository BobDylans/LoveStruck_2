package com.app.dto.a;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.app.entity.User;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* 用户表; DTO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class UserDTO extends User  {
    private static final long serialVersionUID = -4381686705018283849L;

}