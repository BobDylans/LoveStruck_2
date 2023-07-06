package com.app.vo.a;

import com.diboot.core.binding.annotation.*;
import com.app.entity.Profile;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 个人资料表; ListVO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class ProfileListVO extends Profile  {
    private static final long serialVersionUID = -1594422751725672945L;

}