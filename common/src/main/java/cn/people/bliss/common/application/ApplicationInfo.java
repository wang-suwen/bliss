package cn.people.bliss.common.application;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties(prefix = "application")
@Data
public class ApplicationInfo {
    private String name;
    private String version;
    @Value("base-package")
    private String basePackage;
    private String description;
}
