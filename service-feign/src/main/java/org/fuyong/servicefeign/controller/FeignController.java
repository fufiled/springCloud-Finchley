package org.fuyong.servicefeign.controller;

import org.fuyong.servicefeign.service.ServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FeignController {
    //j02JkRlg6PhS

    @Autowired
    ServiceFeign serviceFeign;

    @RequestMapping("/hi")
    public String sayHI(@RequestParam(value = "name",defaultValue = "付先生")String name){
        return serviceFeign.sayHI(name);
    }
}
