package com.app.mapper;

import com.diboot.core.mapper.BaseCrudMapper;
import com.app.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.io.Serializable;

/**
* 代码测试Mapper
* @author shurun
* @version 1.0
* @date 2023-07-03
 * Copyright © MyCompany
*/
@Mapper
public interface TestMapper extends BaseCrudMapper<Test> {

}

