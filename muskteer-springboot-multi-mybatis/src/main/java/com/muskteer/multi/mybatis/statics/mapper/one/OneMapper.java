package com.muskteer.multi.mybatis.statics.mapper.one;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by wanglei on 2018/2/27.
 */
@Mapper
public interface OneMapper {

    @Select("select 'one' from dual")
    String testDSOne();
}
