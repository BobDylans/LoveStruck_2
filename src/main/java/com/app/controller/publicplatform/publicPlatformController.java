package com.app.controller.publicplatform;

import com.diboot.core.vo.JsonResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "公告平台接口;", description = "所有涉及到公告平台的接口")
@RestController
@RequestMapping("/public")
@Slf4j
public class publicPlatformController {
    /*
    *公共平台动态查看 */
    //根据当前登录用户推荐适合的动态
    @GetMapping("/{userId}/{pageIndex}")
    public JsonResult pbList(@PathVariable("userId") Long userId,@PathVariable("pageIndex") Integer pageIndex){
        //先查询用户关系表,查询出所有拉黑用户id

        //根据前当前用户圈子查询出动态
        return JsonResult.OK();
    }

}
