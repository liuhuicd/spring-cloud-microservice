package com.lxzj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ribbon")
public class RebbonTestApi {

    @RequestMapping(value = "name", method = RequestMethod.GET)
    public String getMyBlogNameApi() {
        return "该服务端口号：8072";
    }
}
