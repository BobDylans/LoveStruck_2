package com.app.vo.a;

import com.diboot.core.binding.annotation.*;
import com.app.entity.TbTrends;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 评论区 ListVO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class TbTrendsListVO extends TbTrends  {
    private static final long serialVersionUID = 2920357138980600096L;

}