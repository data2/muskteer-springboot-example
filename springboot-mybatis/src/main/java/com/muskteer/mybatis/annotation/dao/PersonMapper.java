package com.muskteer.mybatis.annotation.dao;

import com.muskteer.mybatis.annotation.bean.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by wanglei on 2018/2/26.
 */

@Mapper
public interface PersonMapper {
    @Select("select id, name from person")
    List<Person> queryAll();

    /**
     * 添加操作，返回新增元素的 ID
     *
     * @param person
     */
    @Insert("insert into person(id,name) values(#{id},#{name})")
    void insert(Person person);

    /**
     * 更新操作
     *
     * @param person
     * @return 受影响的行数
     */
    @Update("update person set name=#{name},id=#{id} where id=#{id}")
    Long update(Person person);

    /**
     * 删除操作
     *
     * @param id
     * @return 受影响的行数
     */
    @Delete("delete from person where id=#{id}")
    Long delete(@Param("id") Long id);

    /**
     * 查询所有
     *
     * @return
     */
    @Select("select id,name from person")
    List<Person> selectAll();

    /**
     * 根据主键查询单个
     *
     * @param id
     * @return
     */
    @Select("select id,name from person where id=#{id}")
    Person selectById(@Param("id") Long id);


}
