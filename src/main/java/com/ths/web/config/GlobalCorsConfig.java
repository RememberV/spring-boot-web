package com.ths.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @Author JiangYu
 * @Description 跨域配置
 * @Date 2022-09-15 11:03
 * @Version 1.0
 */
@Configuration
public class GlobalCorsConfig implements WebMvcConfigurer {

    @Resource
    InterceptorConfig interceptorConfig;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptorConfig)
                .addPathPatterns("/**")
                .excludePathPatterns("/common/login");
    }
}
