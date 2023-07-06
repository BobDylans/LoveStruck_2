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
* 标签类别; Entity定义
* @author shurun
* @version 1.0
* @date 2023-07-06
* Copyright © MyCompany
*/
@Schema(name = "标签类别;", description = "标签类别; 实体定义")
@Getter @Setter @Accessors(chain = true)
@TableName("category")
public class Category extends BaseCustomEntity {
    private static final long serialVersionUID = 1945441066696760689L;

    /**
    * 标签类别名 
    */
    @Schema(description="标签类别名", required = true, example = "标签类别名样例内容")
    @NotNull(message = "标签类别名不能为空")
    @Length(max=100, message="标签类别名长度应小于100")
    @TableField()
    private String name;

    /**
    * 审核 
    */
    @Schema(description="审核", required = true, example = "0")
    @NotNull(message = "审核不能为空")
    @TableField()
    private Integer check;

    @TableField(exist = false)
    private boolean deleted;

    @TableField(exist = false)
    private Date createTime;


} 
