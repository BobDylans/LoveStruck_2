package com.app.service.serviceImpl.a;

import com.diboot.core.util.BeanUtils;
import com.app.entity.Category;
import com.app.mapper.a.CategoryMapper;
import com.app.service.a.CategoryService;
import com.app.service.serviceImpl.a.BaseCustomServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* 标签类别;相关Service实现
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Service
@Slf4j
public class CategoryServiceImpl extends BaseCustomServiceImpl<CategoryMapper, Category> implements CategoryService {

}
