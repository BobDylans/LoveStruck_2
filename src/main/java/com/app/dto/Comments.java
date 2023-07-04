package com.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName comments
*/
@Data
@ApiModel("评论文档")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comments implements Serializable {

    /**
    * 
    */
    @ApiModelProperty("")
    private Object id;
    /**
    * 
    */
    @ApiModelProperty("")
    private Object parentId;
    /**
    * 
    */
    @ApiModelProperty("")
    private Object content;
    /**
    * 
    */
    @ApiModelProperty("")
    private Object userId;
    /**
    * 
    */
    @ApiModelProperty("")
    private Date commentCreatesTime;
}
