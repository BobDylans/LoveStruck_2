package com.app.vo.a;

import com.diboot.core.binding.annotation.*;
import com.app.entity.TbContentTrends;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 与动态交互的信息 ListVO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class TbContentTrendsListVO extends TbContentTrends  {
    private static final long serialVersionUID = -2728372155610189270L;

}