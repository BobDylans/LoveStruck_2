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
* 评论区 Entity定义
* @author shurun
* @version 1.0
* @date 2023-07-06
* Copyright © MyCompany
*/
@Schema(name = "评论区", description = "评论区 实体定义")
@Getter @Setter @Accessors(chain = true)
@TableName("tb_trends")
public class TbTrends extends BaseCustomEntity {
    private static final long serialVersionUID = -8425177035458245638L;

    /**
    * 发布者用户名 
    */
    @Schema(description="发布者用户名", example = "")
    @Length(max=50, message="发布者用户名长度应小于50")
    @TableField()
    private String userid;

    /**
    * 标题 
    */
    @Schema(description="标题", example = "")
    @Length(max=100, message="标题长度应小于100")
    @TableField()
    private String title;

    /**
    * 内容 
    */
    @Schema(description="内容", example = "")
    @TableField()
    private String contest;

    /**
    * 图片路径 
    */
    @Schema(description="图片路径", example = "")
    @Length(max=100, message="图片路径长度应小于100")
    @TableField()
    private String img;

    /**
    * 状态(已发布,草稿,发布中) 
    */
    @Schema(description="状态(已发布,草稿,发布中)", example = "")
    @Length(max=100, message="状态(已发布,草稿,发布中)长度应小于100")
    @TableField()
    private String status;

    /**
    * 审核 
    */
    @Schema(description="审核", example = "")
    @Length(max=100, message="审核长度应小于100")
    @TableField()
    private String examin;

    /**
    * 点赞数 
    */
    @Schema(description="点赞数", example = "")
    @Length(max=100, message="点赞数长度应小于100")
    @TableField()
    private String liked;

    /**
    * 发布地点(朋友圈或广场) 
    */
    @Schema(description="发布地点(朋友圈或广场)", example = "")
    @Length(max=100, message="发布地点(朋友圈或广场)长度应小于100")
    @TableField()
    private String area;

   @TableField(exist = false)
   private List<String> fileUuidList;
   

} 
