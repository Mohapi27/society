//package org.kgotla.society.configs;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.activation.DataSource;
//
//@Configuration
//public class LiquibaseDatabaseConfigs {
//    @Value("spring.datasource.driverClassName")
//    private String driver;
//
//    @Value("spring.liquibase.url")
//    private String url;
//
//    @Value("spring.liquibase.password")
//    private String password;
//
//    @Value("spring.liquibase.user")
//    private String username;
//    @Bean(name = "liquibaseDataSource")
//    public DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName(driver);
//        dataSourceBuilder.url(url);
//        dataSourceBuilder.username(username);
//        dataSourceBuilder.password(password);
//        return (DataSource) dataSourceBuilder.build();
//    }
//}
