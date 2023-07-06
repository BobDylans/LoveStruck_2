package com.app.dto.a;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.app.entity.Circle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* 星球圈; DTO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class CircleDTO extends Circle  {
    private static final long serialVersionUID = -8897928679496634716L;

}