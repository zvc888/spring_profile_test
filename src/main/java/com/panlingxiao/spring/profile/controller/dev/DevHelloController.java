package com.panlingxiao.spring.profile.controller.dev;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.panlingxiao.spring.profile.service.HelloService;

/**
 * 模拟在开发环境下使用类
 */
@RequestMapping("/devHello")
public class DevHelloController{

	@RequestMapping("/index")
    public String sayHello() {
        return "";
    }

}