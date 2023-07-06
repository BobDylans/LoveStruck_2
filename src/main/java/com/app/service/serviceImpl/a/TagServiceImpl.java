package com.app.service.serviceImpl.a;

import com.diboot.core.util.BeanUtils;
import com.app.entity.Tag;
import com.app.mapper.a.TagMapper;
import com.app.service.a.TagService;
import com.app.service.serviceImpl.a.BaseCustomServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* 标签;相关Service实现
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Service
@Slf4j
public class TagServiceImpl extends BaseCustomServiceImpl<TagMapper, Tag> implements TagService {

}
