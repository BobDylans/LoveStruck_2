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
* 个人资料表; Entity定义
* @author shurun
* @version 1.0
* @date 2023-07-06
* Copyright © MyCompany
*/
@Schema(name = "个人资料表;", description = "个人资料表; 实体定义")
@Getter @Setter @Accessors(chain = true)
@TableName("profile")
public class Profile extends BaseCustomEntity {
    private static final long serialVersionUID = 7559609837517370764L;

    /**
    * 创建时间 
    */
    @Schema(description="创建时间", required = true, example = "")
    @NotNull(message = "创建时间不能为空")
    @TableField()
    private Date profileCreateTime;

    /**
    * 更新时间 
    */
    @Schema(description="更新时间", example = "")
    @TableField()
    private Date profileUpdateTime;

    /**
    * 学历 
    */
    @Schema(description="学历", example = "专科")
    @Length(max=100, message="学历长度应小于100")
    @TableField()
    private String education;

    /**
    * 职业 
    */
    @Schema(description="职业", example = "鸡哥")
    @Length(max=100, message="职业长度应小于100")
    @TableField()
    private String occupation;

    /**
    * 个人简介 
    */
    @Schema(description="个人简介", example = "")
    @TableField()
    private String desc;

    /**
    * 用户地址 
    */
    @Schema(description="用户地址", example = "")
    @Length(max=255, message="用户地址长度应小于255")
    @TableField()
    private String address;

    @TableField(exist = false)
    private boolean deleted;

    @TableField(exist = false)
    private Date createTime;


} 
