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
* 类别圈子表; Entity定义
* @author shurun
* @version 1.0
* @date 2023-07-06
* Copyright © MyCompany
*/
@Schema(name = "类别圈子表;", description = "类别圈子表; 实体定义")
@Getter @Setter @Accessors(chain = true)
@TableName("category_circle")
public class CategoryCircle extends BaseCustomEntity {
    private static final long serialVersionUID = -2239482584234863822L;

    /**
    * 标签种类ID 
    */
    @Schema(description="标签种类ID", example = "")
    @TableField()
    private Long categoryId;

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
