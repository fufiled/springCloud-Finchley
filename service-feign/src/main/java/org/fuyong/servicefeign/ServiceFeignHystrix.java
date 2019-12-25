package org.fuyong.servicefeign;

import org.fuyong.servicefeign.service.ServiceFeign;
import org.junit.Test;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ServiceFeignHystrix implements ServiceFeign {
    @Override
    public String sayHI(String name) {
        return "很抱歉，"+name+"，出现未知错误！";
    }

    @Test
    public  void test(){
        String s="01,02,07,11,15,16,";
        List v= Arrays.asList(s.split(","));
        System.out.println(v);
    }
}
