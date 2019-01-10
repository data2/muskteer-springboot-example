package com.muskteer.multi.mybatis.statics.mapper.two;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by wanglei on 2018/2/27.
 */
@Mapper
public interface TwoMapper {
    @Select("select two from dual")
    void testDSTwo();
}
