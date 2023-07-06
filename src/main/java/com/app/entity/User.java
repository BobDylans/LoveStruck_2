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
* 用户表; Entity定义
* @author shurun
* @version 1.0
* @date 2023-07-06
* Copyright © MyCompany
*/
@Schema(name = "用户表;", description = "用户表; 实体定义")
@Getter @Setter @Accessors(chain = true)
@TableName("user")
public class User extends BaseCustomEntity {
    private static final long serialVersionUID = 1624524188364193820L;

    /**
    * 用户资料 id 
    */
    @Schema(description="用户资料 id", example = "")
    @TableField()
    private Long profileId;

    /**
    * 用户名 
    */
    @Schema(description="用户名", example = "")
    @Length(max=255, message="用户名长度应小于255")
    @TableField()
    private String username;

    /**
    * 用户头像 
    */
    @Schema(description="用户头像", example = "")
    @Length(max=255, message="用户头像长度应小于255")
    @TableField()
    private String avatar;

    /**
    * 用户角色 
    */
    @Schema(description="用户角色", example = "")
    @TableField()
    private Integer role;

    /**
    * 性别 
    */
    @Schema(description="性别", example = "")
    @TableField()
    private Integer gender;

    /**
    * 个人密码 
    */
    @Schema(description="个人密码", example = "")
    @Length(max=255, message="个人密码长度应小于255")
    @TableField()
    private String password;

    /**
    * 个人邮箱 
    */
    @Schema(description="个人邮箱", example = "")
    @Length(max=255, message="个人邮箱长度应小于255")
    @TableField()
    private String emil;

    /**
    * 年龄 
    */
    @Schema(description="年龄", example = "")
    @TableField()
    private Integer age;

    /**
    * 是否上线 
    */
    @Schema(description="是否上线", example = "")
    @TableField()
    private Integer onlineStatus;

    /**
    * 匹配用户 
    */
    @Schema(description="匹配用户", example = "")
    @TableField()
    private Integer matchStatus;

    /**
    * 是否被举报 
    */
    @Schema(description="是否被举报", example = "")
    @Length(max=100, message="是否被举报长度应小于100")
    @TableField()
    private String status;

    @TableField(exist = false)
    private boolean deleted;

    @TableField(exist = false)
    private Date createTime;


} 
