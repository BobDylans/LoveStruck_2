package com.app.service.serviceImpl.a;

import com.diboot.core.util.BeanUtils;
import com.app.entity.User;
import com.app.mapper.a.UserMapper;
import com.app.service.a.UserService;
import com.app.service.serviceImpl.a.BaseCustomServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* 用户表;相关Service实现
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Service
@Slf4j
public class UserServiceImpl extends BaseCustomServiceImpl<UserMapper, User> implements UserService {

}
