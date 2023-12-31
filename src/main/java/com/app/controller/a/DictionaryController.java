package com.app.controller.a;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import com.diboot.core.util.V;
import com.diboot.core.vo.*;
import com.diboot.core.entity.Dictionary;
import com.diboot.core.controller.BaseCrudRestController;
import com.diboot.iam.annotation.OperationCons;
import com.diboot.iam.annotation.BindPermission;
import lombok.extern.slf4j.Slf4j;
import javax.validation.Valid;
import java.util.List;

/**
 * 数据字典相关Controller
 *
 * @author shurun
 * @version 1.0
 * @date 2023-07-07
 * Copyright © MyCompany
 */
@Tag(name = "数据字典", description = "数据字典相关CRUD接口")
@RestController
@RequestMapping("/dictionary")
@BindPermission(name = "数据字典")
@Slf4j
public class DictionaryController extends BaseCrudRestController<Dictionary> {

    /**
     * 查询ViewObject的分页数据
     * <p>
     * url请求参数示例: /list?name=abc&pageSize=20&pageIndex=1&orderBy=name
     * </p>
     *
     * @return
     * @throws Exception
     */
    @Operation(summary = "获取列表分页数据")
    @BindPermission(name = OperationCons.LABEL_LIST, code = OperationCons.CODE_READ)
    @GetMapping("/list")
    public JsonResult getViewObjectListMapping(Dictionary entity, Pagination pagination) throws Exception{
        return super.getViewObjectList(entity, pagination, DictionaryVO.class);
    }

    /**
     * 根据资源id查询ViewObject
     *
     * @param id ID
     * @return
     * @throws Exception
     */
    @Operation(summary = "根据ID获取详情数据")
    @BindPermission(name = OperationCons.LABEL_DETAIL, code = OperationCons.CODE_READ)
    @GetMapping("/{id}")
    public JsonResult getViewObjectMapping(@PathVariable("id") Long id) throws Exception{
        return super.getViewObject(id, DictionaryVO.class);
    }

    /**
     * 创建资源对象
     *
     * @param entityVO
     * @return JsonResult
     * @throws Exception
     */
    @Operation(summary = "新建数据")
    @BindPermission(name = OperationCons.LABEL_CREATE, code = OperationCons.CODE_WRITE)
    @PostMapping("/")
    public JsonResult createEntityMapping(@RequestBody @Valid DictionaryVO entityVO) throws Exception {
        boolean success = dictionaryService.createDictAndChildren(entityVO);
        if(!success){
            return JsonResult.FAIL_OPERATION("保存数据字典失败！");
        }
        return JsonResult.OK();
    }

    /**
     * 根据ID更新资源对象
     *
     * @param entityVO
     * @return JsonResult
     * @throws Exception
     */
    @Operation(summary = "根据ID更新数据")
    @BindPermission(name = OperationCons.LABEL_UPDATE, code = OperationCons.CODE_WRITE)
    @PutMapping("/{id}")
    public JsonResult updateEntityMapping(@PathVariable("id")Long id, @Valid @RequestBody DictionaryVO entityVO) throws Exception {
        entityVO.setId(id);
        boolean success = dictionaryService.updateDictAndChildren(entityVO);
        if(!success){
            return JsonResult.FAIL_OPERATION("更新数据字典失败！");
        }
        return JsonResult.OK();
    }

    /**
     * 根据id删除资源对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    @Operation(summary = "根据ID删除数据")
    @BindPermission(name = OperationCons.LABEL_DELETE, code = OperationCons.CODE_WRITE)
    @DeleteMapping("/{id}")
    public JsonResult deleteEntityMapping(@PathVariable("id")Long id) throws Exception {
        boolean success = dictionaryService.deleteDictAndChildren(id);
        if(!success){
            return JsonResult.FAIL_OPERATION("删除数据字典失败！");
        }
        return JsonResult.OK();
    }

    /**
     * 获取数据字典数据列表
     *
     * @param type
     * @return
     * @throws Exception
     */
    @Operation(summary = "根据type获取数据字典子项")
    @GetMapping("/items/{type}")
    public JsonResult getItems(@PathVariable("type")String type) throws Exception{
        if (V.isEmpty(type)){
            return JsonResult.FAIL_INVALID_PARAM("type参数未指定");
        }
        List<LabelValue> itemsList = dictionaryService.getLabelValueList(type);
        return JsonResult.OK(itemsList);
    }

    /**
     * 校验类型编码是否重复
     *
     * @param id
     * @param type
     * @return
     */
    @Operation(summary = "检查type是否重复")
    @GetMapping("/checkTypeDuplicate")
    public JsonResult checkTypeDuplicate(@RequestParam(required = false) Long id, @RequestParam String type) {
        if (V.notEmpty(type)) {
            LambdaQueryWrapper<Dictionary> wrapper = new LambdaQueryWrapper();
            wrapper.select(Dictionary::getId).eq(Dictionary::getType, type).eq(Dictionary::getParentId, 0);
            if (V.notEmpty(id)) {
                wrapper.ne(Dictionary::getId, id);
            }
            boolean alreadyExists = dictionaryService.exists(wrapper);
            if (alreadyExists) {
                return new JsonResult(Status.FAIL_OPERATION, "类型编码已存在");
            }
        }
        return JsonResult.OK();
    }
}