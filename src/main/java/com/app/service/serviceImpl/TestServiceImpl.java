package com.app.service.serviceImpl;

import com.diboot.core.util.BeanUtils;
import com.app.entity.Test;
import com.app.mapper.TestMapper;
import com.app.service.TestService;
import com.app.service.serviceImpl.BaseCustomServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* 代码测试相关Service实现
* @author shurun
* @version 1.0
* @date 2023-07-03
 * Copyright © MyCompany
*/
@Service
@Slf4j
public class TestServiceImpl extends BaseCustomServiceImpl<TestMapper, Test> implements TestService {

}
