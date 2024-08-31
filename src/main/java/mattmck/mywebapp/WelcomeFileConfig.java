package mattmck.mywebapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WelcomeFileConfig implements WebMvcConfigurer {
    
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
		// ref: https://stackoverflow.com/questions/26057995/changing-default-welcome-page-for-spring-boot-application-deployed-as-a-war
        registry.addViewController("/").setViewName("forward:/index.xhtml");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}