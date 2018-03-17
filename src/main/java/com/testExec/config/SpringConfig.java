package com.testExec.config;

import com.testExec.dao.OrderDao;
import com.testExec.dao.OrderDaoImpl;
import com.testExec.service.OrderService;
import com.testExec.service.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:h2:~/test");
        dataSource.setUsername("Anton");
        dataSource.setPassword("4452dcdc");
        dataSource.setDriverClassName("org.h2.Driver");
        return dataSource;
    }

    @Bean
    public OrderDao getOrderDao(){
        return new OrderDaoImpl(getJdbcTemplate());
    }

    @Bean
    public OrderService getOrderService(){
        return new OrderServiceImpl();
    }
}
