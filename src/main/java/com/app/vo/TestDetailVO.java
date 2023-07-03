package com.app.vo;

import com.diboot.core.binding.annotation.*;
import com.app.entity.Test;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 代码测试 DetailVO定义
* @author shurun
* @version 1.0
* @date 2023-07-03
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class TestDetailVO extends Test  {
    private static final long serialVersionUID = -6200022801364475632L;

}