package com.app.entity;

import java.util.Date;
import java.lang.Double;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;
import java.util.List;
import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import io.swagger.v3.oas.annotations.media.Schema;
import com.app.entity.BaseCustomEntity;
import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.diboot.core.util.D;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* 好友关系表; Entity定义
* @author shurun
* @version 1.0
* @date 2023-07-06
* Copyright © MyCompany
*/
@Schema(name = "好友关系表;", description = "好友关系表; 实体定义")
@Getter @Setter @Accessors(chain = true)
@TableName("friendships")
public class Friendships extends  BaseCustomEntity {
    private static final long serialVersionUID = -1031625276344778135L;

    /**
    * 创建时间 
    */
    @Schema(description="创建时间", example = "")
    @TableField()
    private Date friendshipsCreateTime;

    /**
    * 用户id 
    */
    @Schema(description="用户id", example = "")
    @TableField()
    private Long userId;

    /**
    * 朋友Id 
    */
    @Schema(description="朋友Id", example = "")
    @TableField()
    private Long friendId;

    /**
    * 关注程度 
    */
    @Schema(description="关注程度", example = "0")
    @TableField()
    private Integer concern;

    @TableField(exist = false)
    private boolean deleted;

    @TableField(exist = false)
    private Date createTime;


} 
