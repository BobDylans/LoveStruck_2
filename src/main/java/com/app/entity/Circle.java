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
* 星球圈; Entity定义
* @author shurun
* @version 1.0
* @date 2023-07-06
* Copyright © MyCompany
*/
@Schema(name = "星球圈;", description = "星球圈; 实体定义")
@Getter @Setter @Accessors(chain = true)
@TableName("circle")
public class Circle extends BaseCustomEntity {
    private static final long serialVersionUID = -3316041961365716993L;

    /**
    * 圈子名 
    */
    @Schema(description="圈子名", example = "")
    @Length(max=255, message="圈子名长度应小于255")
    @TableField()
    private String name;

    /**
    * 圈子所属的标签属性 
    */
    @Schema(description="圈子所属的标签属性", required = true, example = "圈子所属的标签属性样例内容")
    @NotNull(message = "圈子所属的标签属性不能为空")
    @Length(max=255, message="圈子所属的标签属性长度应小于255")
    @TableField()
    private String categoryTags;

    @TableField(exist = false)
    private boolean deleted;

    @TableField(exist = false)
    private Date createTime;


} 
