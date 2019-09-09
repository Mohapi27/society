package org.kgotla.society.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

//@Primary
@Configuration
public class DatabaseConfigs {

    @Value("spring.datasource.driverClassName")
    private String driver;

    @Value("spring.datasource.url")
    private String url;

    @Value("spring.datasource.password")
    private String password;

    @Value("spring.datasource.username")
    private String username;

    @Bean
    @Primary
    @ConfigurationProperties(value = "application.properties")
    public DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName(driver);
//        dataSourceBuilder.url(url);
//        dataSourceBuilder.username(username);
//        dataSourceBuilder.password(password);
//        return (DataSource) dataSourceBuilder.build();
        return DataSourceBuilder.create().build();
    }
}




