package com.app.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import java.util.List;

/**
 * @author 舒润
 */
@Data
@Builder
@ApiModel("动态文档")
@AllArgsConstructor
@NoArgsConstructor
public class Posts {
    @ApiModelProperty("动态id")
    private Object id;
    @ApiModelProperty("动态的发布人")
    private Long userId;
    @ApiModelProperty("动态的内容")
    private String context;
    @ApiModelProperty("动态的点赞数")
    private Long likes;
    @ApiModelProperty("谁查看你的动态")
    private List<Integer> ids;
    @ApiModelProperty("当前的动态状态 0：审核中 1：发布失败 2：发布成功")
    private Integer status;
    @ApiModelProperty("对外开发的组")
    private List<Integer> groupIds;
    @ApiModelProperty("对外开放的人")
    private List<User> users;
}
