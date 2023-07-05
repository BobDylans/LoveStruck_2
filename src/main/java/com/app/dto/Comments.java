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
import org.springframework.data.annotation.Id;

/**
* 
* @author 舒润
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
    @Id
    @ApiModelProperty("")
    private String id;
    /**
    * 
    */
    @ApiModelProperty("")
    private String parentId;
    /**
    * 
    */
    @ApiModelProperty("")
    private String content;
    /**
    * 
    */
    @ApiModelProperty("")
    private String userId;
    /**
    * 
    */
    @ApiModelProperty("")
    private Date commentCreatesTime;
}
