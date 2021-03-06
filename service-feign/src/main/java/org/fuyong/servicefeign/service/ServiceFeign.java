package org.fuyong.servicefeign.service;

import org.fuyong.servicefeign.ServiceFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = ServiceFeignHystrix.class)
public interface ServiceFeign {
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    String sayHI(@RequestParam(value = "name",defaultValue = "付先生")String name);
}
