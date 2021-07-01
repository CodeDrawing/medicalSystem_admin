package top.codezx.medicalsystem_admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zx
 * @date 2020/6/1
 **/

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
//        registry.addViewController("/main.html").setViewName("dashboard");
    }
    @Bean
    public LocaleResolver localeResolver(){
        return new top.codezx.medicalsystem_admin.config.MyLocaleResolver();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html","/","/admin/**","/component/**","/adminLogin","/toLogin","/config/**","system/captcha/**");
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/studentText/uploadFile/**").
//                addResourceLocations("file:/"+"Volumes/studentText/uploadFile/");
//    }
}

