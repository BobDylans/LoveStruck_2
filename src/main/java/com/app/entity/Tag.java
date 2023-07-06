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
* 标签; Entity定义
* @author shurun
* @version 1.0
* @date 2023-07-06
* Copyright © MyCompany
*/
@Schema(name = "标签;", description = "标签; 实体定义")
@Getter @Setter @Accessors(chain = true)
@TableName("tag")
public class Tag extends BaseCustomEntity {
    private static final long serialVersionUID = -3868761902639696895L;

    /**
    * 标签种类ID 
    */
    @Schema(description="标签种类ID", example = "")
    @TableField()
    private Long categoryId;

    /**
    * 标签名 
    */
    @Schema(description="标签名", example = "")
    @Length(max=100, message="标签名长度应小于100")
    @TableField()
    private String name;

    @TableField(exist = false)
    private boolean deleted;

    @TableField(exist = false)
    private Date createTime;


} 
