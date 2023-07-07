package com.app.service.serviceImpl.a;

import com.diboot.core.util.BeanUtils;
import com.app.entity.TbContent;
import com.app.mapper.a.TbContentMapper;
import com.app.service.a.TbContentService;
import com.app.service.serviceImpl.a.BaseCustomServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* 动态相关Service实现
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Service
@Slf4j

public class TbContentServiceImpl extends BaseCustomServiceImpl<TbContentMapper, TbContent> implements TbContentService {

}
