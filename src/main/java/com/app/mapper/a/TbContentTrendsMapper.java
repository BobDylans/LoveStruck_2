package com.app.mapper.a;

import com.diboot.core.mapper.BaseCrudMapper;
import com.app.entity.TbContentTrends;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.io.Serializable;

/**
* 与动态交互的信息Mapper
* @author shurun
* @version 1.0
* @date 2023-07-06
 * Copyright © MyCompany
*/
@Mapper
public interface TbContentTrendsMapper extends BaseCrudMapper<TbContentTrends> {

}

