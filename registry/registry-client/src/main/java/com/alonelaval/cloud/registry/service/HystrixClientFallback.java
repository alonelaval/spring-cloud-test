package com.alonelaval.cloud.registry.service;

;import org.springframework.stereotype.Component;

/**
 * @author huawei
 * @create 2018-05-18
 **/
@Component
public class HystrixClientFallback implements UserService {

    @Override
    public String name() {
        return "fallback";
    }
}
