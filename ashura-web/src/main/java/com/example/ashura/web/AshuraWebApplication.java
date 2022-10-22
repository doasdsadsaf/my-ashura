package com.example.ashura.web;

import org.apache.catalina.Group;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import java.util.Properties;

@SpringBootApplication
public class AshuraWebApplication {
    private static final Logger logger = LoggerFactory.getLogger(AshuraWebApplication.class);

    public static void main(String[] args) throws NacosException {
         //nacos 地址
        String serverAddr = "http://124.223.2.193:8848";
        //Data Id
         String dataId = "ashura-web.ymal";
       // Group
        String group = "DEFAULT_GROUP";
        Properties properties = new Properties();
        properties.put("serverAddr",serverAddr);
      //  properties.put("namespace","public");
        ConfigService configService = NacosFactory.createConfigService(properties);
        //获取配置,String dataId, String group, long timeoutMs
         String content = configService.getConfig(dataId, group, 5000);
        logger.info(content);
        SpringApplication.run(AshuraWebApplication.class, args);
        logger.info("启动成功");
    }

}
