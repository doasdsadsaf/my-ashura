package com.example.ashura.web;

import org.apache.catalina.Group;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import java.util.Properties;

@SpringBootApplication
public class AshuraWebApplication {

    public static void main(String[] args) {
        //nacos 地址
        String serverAddr = "http://124.223.2.193:8848/";
        //Data Id
         String dataId = "ashura-web.ymal";
       // Group
        String group = "DEFAULT_GROUP";
        Properties properties = new Properties();
        properties.put("serverAddr",serverAddr);
        ConfigService configService = NacosFactory.createConfigService(properties);
        //获取配置,String dataId, String group, long timeoutMs
         String content = configService.getConfig(dataId, group, 5000);
         System.out.println(content);
        SpringApplication.run(AshuraWebApplication.class, args);
        System.out.println("启动成功");
    }

}
