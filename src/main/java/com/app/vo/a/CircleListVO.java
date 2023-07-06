package com.app.vo.a;

import com.diboot.core.binding.annotation.*;
import com.app.entity.Circle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 星球圈; ListVO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class CircleListVO extends Circle  {
    private static final long serialVersionUID = -6531144463532683200L;

}