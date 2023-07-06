package com.app.vo.a;

import com.diboot.core.binding.annotation.*;
import com.app.entity.Matched;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 已匹配表; ListVO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class MatchedListVO extends Matched  {
    private static final long serialVersionUID = -975010390085817538L;

}