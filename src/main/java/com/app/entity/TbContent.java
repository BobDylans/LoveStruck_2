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
* 动态 Entity定义
* @author shurun
* @version 1.0
* @date 2023-07-06
* Copyright © MyCompany
*/
@Schema(name = "动态", description = "动态 实体定义")
@Getter @Setter @Accessors(chain = true)
@TableName("tb_content")
public class TbContent extends BaseCustomEntity {
    private static final long serialVersionUID = 8119114233656182129L;

    /**
    * 审核状态 
    */
    @Schema(description="审核状态", example = "")
    @TableField()
    private Boolean examin;

    /**
    * 动态id 
    */
    @Schema(description="动态id", example = "")
    @TableField()
    private Long trendsId;

    /**
    * 评论者id 
    */
    @Schema(description="评论者id", example = "")
    @TableField()
    private Long followUserId;

    /**
    * 评论内容 
    */
    @Schema(description="评论内容", example = "")
    @TableField()
    private String content;

    /**
    * 图片路径 
    */
    @Schema(description="图片路径", example = "")
    @Length(max=100, message="图片路径长度应小于100")
    @TableField()
    private String img;

    /**
    * 点赞数 
    */
    @Schema(description="点赞数", example = "")
    @TableField()
    private Integer liked;

   @TableField(exist = false)
   private List<String> fileUuidList;
   

} 
