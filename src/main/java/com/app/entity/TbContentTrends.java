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
* 与动态交互的信息 Entity定义
* @author shurun
* @version 1.0
* @date 2023-07-06
* Copyright © MyCompany
*/
@Schema(name = "与动态交互的信息", description = "与动态交互的信息 实体定义")
@Getter @Setter @Accessors(chain = true)
@TableName("tb_content_trends")
public class TbContentTrends extends BaseCustomEntity {
    private static final long serialVersionUID = 4161070777209717607L;

    /**
    * 动态id 
    */
    @Schema(description="动态id", example = "")
    @Length(max=100, message="动态id长度应小于100")
    @TableField()
    private String trendId;

    /**
    * 评论者id 
    */
    @Schema(description="评论者id", example = "")
    @Length(max=100, message="评论者id长度应小于100")
    @TableField()
    private String followUserId;

    /**
    * 是否点赞 
    */
    @Schema(description="是否点赞", example = "")
    @TableField()
    private Boolean isliked;


} 
