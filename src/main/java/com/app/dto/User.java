package com.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 用户表;
* @TableName user
*/
@Data
@ApiModel("用户表")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {

    /**
    * 用户id
    */
    @NotNull(message="[用户id]不能为空")
    @ApiModelProperty("用户id")
    private Long id;
    /**
    * 用户资料 id
    */
    @ApiModelProperty("用户资料 id")
    private Long profileId;
    /**
    * 用户名
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("用户名")
    @Length(max= 255,message="编码长度不能超过255")
    private String username;
    /**
    * 地址id
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("地址id")
    @Length(max= 255,message="编码长度不能超过255")
    private String addressId;
    /**
    * 用户头像
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("用户头像")
    @Length(max= 255,message="编码长度不能超过255")
    private String avatar;
    /**
    * 用户角色
    */
    @ApiModelProperty("用户角色")
    private Integer role;
    /**
    * 性别
    */
    @ApiModelProperty("性别")
    private Integer gender;
    /**
    * 个人密码
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("个人密码")
    @Length(max= 255,message="编码长度不能超过255")
    private String password;
    /**
    * 个人邮箱
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("个人邮箱")
    @Length(max= 255,message="编码长度不能超过255")
    private String emil;
    /**
    * 年龄
    */
    @ApiModelProperty("年龄")
    private Integer age;
    /**
    * 是否上线
    */
    @ApiModelProperty("是否上线")
    private Integer status;
}
