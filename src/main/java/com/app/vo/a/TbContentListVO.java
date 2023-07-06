package com.app.vo.a;

import com.diboot.core.binding.annotation.*;
import com.app.entity.TbContent;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 动态 ListVO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class TbContentListVO extends TbContent  {
    private static final long serialVersionUID = -1194830126773435232L;

}