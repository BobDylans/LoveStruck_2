package com.app.dto.a;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.app.entity.Friendships;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* 好友关系表; DTO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class FriendshipsDTO extends Friendships  {
    private static final long serialVersionUID = 386287359237311767L;

}