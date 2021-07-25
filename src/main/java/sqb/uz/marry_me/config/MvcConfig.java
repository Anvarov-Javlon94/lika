package sqb.uz.marry_me.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

//    private  String path = "C:/Users/Javlon-Bezop/Desktop/ecommerce/src/main/resources/static/images";
//    private String path = "C:/Users/Javlon-Bezop/Desktop/Marry Me/marry_me/src/main/resources/static/images/demo";



    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/images/**").addResourceLocations("file:///static/images/");
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/","classpath:/resources/");
        registry.addResourceHandler("/static/**").addResourceLocations("/static/","classpath:/static/");
        registry.addResourceHandler("/static/js/**").addResourceLocations("/static/js/");
    }
}
