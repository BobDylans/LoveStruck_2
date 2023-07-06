package com.app.vo.a;

import com.diboot.core.binding.annotation.*;
import com.app.entity.TbContentTrends;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 与动态交互的信息 DetailVO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class TbContentTrendsDetailVO extends TbContentTrends  {
    private static final long serialVersionUID = 3233506715203696962L;

}