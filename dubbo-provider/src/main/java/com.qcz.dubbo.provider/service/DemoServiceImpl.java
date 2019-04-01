package com.qcz.dubbo.provider.service;

import com.qcz.dubbo.api.service.DemoService;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String var) {
        return "hello" + var;
    }

}
