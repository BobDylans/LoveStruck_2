package com.app.service.serviceImpl.a;

import com.diboot.core.util.BeanUtils;
import com.app.entity.Profile;
import com.app.mapper.a.ProfileMapper;
import com.app.service.a.ProfileService;
import com.app.service.serviceImpl.a.BaseCustomServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* 个人资料表;相关Service实现
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Service
@Slf4j
public class ProfileServiceImpl extends BaseCustomServiceImpl<ProfileMapper, Profile> implements ProfileService {

}
