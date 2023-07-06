package com.app.vo.a;

import com.diboot.core.binding.annotation.*;
import com.app.entity.User;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 用户表; DetailVO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class UserDetailVO extends User  {
    private static final long serialVersionUID = -886054509601242510L;

}