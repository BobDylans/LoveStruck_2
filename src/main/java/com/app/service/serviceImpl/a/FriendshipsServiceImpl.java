package com.app.service.serviceImpl.a;

import com.diboot.core.util.BeanUtils;
import com.app.entity.Friendships;
import com.app.mapper.a.FriendshipsMapper;
import com.app.service.a.FriendshipsService;
import com.app.service.serviceImpl.a.BaseCustomServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* 好友关系表;相关Service实现
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Service
@Slf4j
public class FriendshipsServiceImpl extends BaseCustomServiceImpl<FriendshipsMapper, Friendships> implements FriendshipsService {

}
