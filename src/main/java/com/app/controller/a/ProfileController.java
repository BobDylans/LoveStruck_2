package com.app.controller.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

import com.diboot.core.vo.*;
import com.app.entity.Profile;
import com.app.dto.a.ProfileDTO;
import com.app.vo.a.ProfileListVO;
import com.app.vo.a.ProfileDetailVO;
import com.app.service.a.ProfileService;
import com.app.controller.a.BaseCustomCrudRestController;

import lombok.extern.slf4j.Slf4j;
import javax.validation.Valid;
import java.util.List;

/**
 * 个人资料表; 相关Controller
 *
 * @author shurun
 * @version 1.0
 * @date 2023-07-06
 * Copyright © MyCompany
 */
@Tag(name = "个人资料表;", description = "个人资料表;接口")
@RestController
@RequestMapping("/profile")
@Slf4j
public class ProfileController extends BaseCustomCrudRestController<Profile> {
    @Autowired
    private ProfileService profileService;

    /**
     * 查询ViewObject的分页数据
     * <p>
     * url请求参数示例: /list?field=abc&pageIndex=1&orderBy=abc:DESC
     * </p>
     *
     * @return
     * @throws Exception
     */
    @Operation(summary = "获取列表分页数据")
    @GetMapping("/list")
    public JsonResult getViewObjectListMapping(ProfileDTO queryDto, Pagination pagination) throws Exception{
    		return super.getViewObjectList(queryDto, pagination, ProfileListVO.class);
    }   

    /**
     * 根据资源id查询ViewObject
     *
     * @param id ID
     * @return
     * @throws Exception
     */
    @Operation(summary = "根据ID获取详情数据")
    @GetMapping("/{id}")
    public JsonResult getViewObjectMapping(@PathVariable("id")Long id) throws Exception{
        return super.getViewObject(id, ProfileDetailVO.class);
    }

    /**
     * 创建资源对象
     *
     * @param entity
     * @return JsonResult
     * @throws Exception
     */
    @Operation(summary = "新建数据")
    @PostMapping("/")
    public JsonResult createEntityMapping(@Valid @RequestBody Profile entity) throws Exception {
        return super.createEntity(entity);
    }

    /**
     * 根据ID更新资源对象
     *
     * @param entity
     * @return JsonResult
     * @throws Exception
     */
    @Operation(summary = "根据ID更新数据")
    @PutMapping("/{id}")
    public JsonResult updateEntityMapping(@PathVariable("id")Long id, @Valid @RequestBody Profile entity) throws Exception {
        return super.updateEntity(id, entity);
    }

    /**
     * 根据id删除资源对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    @Operation(summary = "根据ID删除数据")
    @DeleteMapping("/{id}")
    public JsonResult deleteEntityMapping(@PathVariable("id")Long id) throws Exception {
        return super.deleteEntity(id);
    }


} 