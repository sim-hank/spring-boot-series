package com.xhulife.helloworld.hello;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xingming.tan@56qq.com
 * @since 2019/3/27
 */
@RestController
public class HelloController {

    @GetMapping("/say-hello")
    public String sayHello(String name) {
        if (StringUtils.isEmpty(name))
            name = "world";
        return "hello " + name;
    }
}
