package com.muskteer.multi.mybatis.statics.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by wanglei on 2018/2/27.
 */
@Configuration
@MapperScan(basePackages = {"com.muskteer.multi.mybatis.mapper.one"}, sqlSessionFactoryRef = "sqlSessionFactoryOne")
public class MybatisDatabaseOneConfig {

    @Autowired
    private DataSource ds1;

    @Bean
    public SqlSessionFactory sqlSessionFactoryOne() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(ds1);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplateOne() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactoryOne());
        return sqlSessionTemplate;
    }

}
