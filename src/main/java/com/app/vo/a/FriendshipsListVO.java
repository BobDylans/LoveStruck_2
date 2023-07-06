package com.app.vo.a;

import com.diboot.core.binding.annotation.*;
import com.app.entity.Friendships;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 好友关系表; ListVO定义
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Getter @Setter @Accessors(chain = true)
public class FriendshipsListVO extends Friendships  {
    private static final long serialVersionUID = -8606886369784623079L;

}