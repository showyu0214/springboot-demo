package cn.itcast.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationProperties(prefix = "jdbc")
//@Data
public class jdbcProperties {
    String driverClassName;
    String url;
    String username;
    String password;
}
