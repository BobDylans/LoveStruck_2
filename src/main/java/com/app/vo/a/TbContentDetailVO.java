package com.app.vo.a;

import com.diboot.core.binding.annotation.*;
import com.app.entity.TbContent;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 动态 DetailVO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class TbContentDetailVO extends TbContent  {
    private static final long serialVersionUID = 7977376917157663092L;

}