package com.lxzj.api;

import com.lxzj.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/feign")
public class BlogApi {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/blogname", method = RequestMethod.GET)
    public String getBlogNameByFeign() {
        return "通过feign调用：" + testService.getBlogName();
    }
}
