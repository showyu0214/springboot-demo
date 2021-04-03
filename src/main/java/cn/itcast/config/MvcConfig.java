package cn.itcast.config;

import cn.itcast.interceptor.Myinterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *@ClassName MvcConfig
 *@Description TODO
 *@Author yubinbin
 *@Date 2020/9/26 16:19
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Myinterceptor()).addPathPatterns("/**");
    }
}
