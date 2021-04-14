package com.sat.upload.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zx
 * @date 2021/04/14
 */
@Data
@ConfigurationProperties(prefix = "sat.upload")
@Component
public class UploadProperties {

    private String baseUrl;
    private List<String> allowTypes;
}
