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
@MapperScan(basePackages = "com.muskteer.multi.mybatis.mapper.two", sqlSessionFactoryRef = "sqlSessionFactoryTwo")
public class MybatisDatabaseTwoConfig {

    @Autowired
    public DataSource ds2;

    @Bean
    public SqlSessionFactory sqlSessionFactoryTwo() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(ds2);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplateTwo() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactoryTwo());
        return sqlSessionTemplate;
    }

}
