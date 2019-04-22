package com.example.wdt.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan(value= {"com.*"}, sqlSessionFactoryRef="logSqlSessionFactory")//value= {"mapper domain 패키지 입력"}
@EnableTransactionManagement
public class LogDatabaseConfig {

    @Bean(name = "logDataSource")
    @ConfigurationProperties(prefix = "log.datasource")
    public DataSource logDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "logSqlSessionFactory")
    public SqlSessionFactory logSqlSessionFactory(@Qualifier("logDataSource") DataSource logDataSource, ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(logDataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mybatis/log/*.xml")); //classpath mapper xml 연결
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "logSqlSessionTemplate")
    public SqlSessionTemplate logSqlSessionTemplate(SqlSessionFactory logSqlSessionFactory) throws Exception {

        return new SqlSessionTemplate(logSqlSessionFactory);
    }
}
