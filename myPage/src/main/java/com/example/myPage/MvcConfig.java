package com.example.myPage;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer
{
    public void addViewControllers(ViewControllerRegistry registry)
    {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/about").setViewName("about");
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("images/**", "/css/**", "/js/**")
                .addResourceLocations("classpath:/static/images/", "classpath:/static/css/", "classpath:/static/js/");
    }
}
