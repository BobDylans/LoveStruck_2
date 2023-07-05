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
* text Entity定义
* @author shurun
* @version 1.0
* @date 2023-07-05
* Copyright © MyCompany
*/
@Schema(name = "text", description = "text 实体定义")
@Getter @Setter @Accessors(chain = true)
@TableName("text_t")
public class TextT extends BaseCustomEntity {
    private static final long serialVersionUID = -4207096143299744667L;

    @TableField(exist = false)
    private Long id;
		
    @Schema(hidden = true)
    @TableId(type = IdType.ASSIGN_UUID)
    private String uuid;


} 
