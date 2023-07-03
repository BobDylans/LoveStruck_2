package com.app.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.diboot.core.config.Cons;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;
import java.util.Date;

/**
* 字段自动填充策略处理类
* @author shurun
* @version 1.0
* @date 2023-07-03
* Copyright © MyCompany
*/
@Component
public class AutoFillMetaObjectHandler implements MetaObjectHandler{
		
    @Override
    public void insertFill(MetaObject metaObject) {
        // 创建数据时，创建时间与更新时间都由数据库进行自动填充
    }

    @Override
    public void updateFill(MetaObject metaObject) {
    		this.strictUpdateFill(metaObject, Cons.FieldName.updateTime.name(), Date::new, Date.class);
    }
}