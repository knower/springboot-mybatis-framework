package com.monkeycoding.xyz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by czn on 2016/1/22.
 * SpringBoot 项目打成war包，放到tomcat里运行
 */
@SpringBootApplication
public class AppWar extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AppWar.class);
    }

    /*public static void main(String[] args) {
        SpringApplication.run(AppWar.class, args);
    }*/

}