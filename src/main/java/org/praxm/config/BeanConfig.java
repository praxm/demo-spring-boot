package org.praxm.config;

import org.praxm.controller.FrontController;
import org.praxm.service.AppService;
import org.praxm.service.impl.AppServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@Configuration
public class BeanConfig {

    public AppService getAppService(){
        return new AppServiceImpl();
    }


}
