package com.muskteer.multi.mybatis.statics.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by wanglei on 2018/2/27.
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "ds1")
    @ConfigurationProperties(prefix = "spring.datasource.ds1")
    public DataSource dataSourceOne(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "ds2")
    @ConfigurationProperties(prefix = "spring.datasource.ds2")
    public DataSource dataSourceTwo(){
        return DataSourceBuilder.create().build();
    }




}
