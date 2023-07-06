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
* 匹配规则表; Entity定义
* @author shurun
* @version 1.0
* @date 2023-07-06
* Copyright © MyCompany
*/
@Schema(name = "匹配规则表;", description = "匹配规则表; 实体定义")
@Getter @Setter @Accessors(chain = true)
@TableName("match_rule")
public class MatchRule extends BaseCustomEntity {
    private static final long serialVersionUID = -4104057090831665244L;

    /**
    * 用户id 
    */
    @Schema(description="用户id", example = "")
    @TableField()
    private Long userId;

    /**
    * 用户性别 
    */
    @Schema(description="用户性别", example = "")
    @TableField()
    private Integer sex;

    /**
    * 标签id 
    */
    @Schema(description="标签id", example = "")
    @Length(max=100, message="标签id长度应小于100")
    @TableField()
    private String tagId;

    /**
    * 圈子id 
    */
    @Schema(description="圈子id", example = "")
    @TableField()
    private Long circleId;

    @TableField(exist = false)
    private boolean deleted;

    @TableField(exist = false)
    private Date createTime;


} 
