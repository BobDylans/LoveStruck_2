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
* 已匹配表; Entity定义
* @author shurun
* @version 1.0
* @date 2023-07-06
* Copyright © MyCompany
*/
@Schema(name = "已匹配表;", description = "已匹配表; 实体定义")
@Getter @Setter @Accessors(chain = true)
@TableName("matched")
public class Matched extends BaseCustomEntity {
    private static final long serialVersionUID = -2062553797735495506L;

    /**
    * 用户iD 
    */
    @Schema(description="用户iD", example = "")
    @TableField()
    private Long userId;

    /**
    * 已经匹配的用户 
    */
    @Schema(description="已经匹配的用户", example = "")
    @TableField()
    private Long matchUserId;

    /**
    * 圈子ID 
    */
    @Schema(description="圈子ID", example = "")
    @TableField()
    private Long circleId;

    @TableField(exist = false)
    private boolean deleted;

    @TableField(exist = false)
    private Date createTime;


} 
