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
@MapperScan(value= {"com.*"}, sqlSessionFactoryRef="memberSqlSessionFactory")//value= {"mapper domain 패키지 입력"}
@EnableTransactionManagement
public class MemberDatabaseConfig {

    @Bean(name = "memberDataSource")
    @ConfigurationProperties(prefix = "member.datasource")
    public DataSource memberDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "memberSqlSessionFactory")
    public SqlSessionFactory memberSqlSessionFactory(@Qualifier("memberDataSource") DataSource memberDataSource, ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(memberDataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mybatis/member/*.xml")); //classpath mapper xml 연결
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "memberSqlSessionTemplate")
    public SqlSessionTemplate memberSqlSessionTemplate(SqlSessionFactory memberSqlSessionFactory) throws Exception {

        return new SqlSessionTemplate(memberSqlSessionFactory);
    }
}
