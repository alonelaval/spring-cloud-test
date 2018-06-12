package com.alonelaval.cloud.registry.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author huawei
 * @create 2018-04-28
 **/
@FeignClient(name = "registry-service",fallback= HystrixClientFallback.class)
public interface UserService {
    @RequestMapping(method = RequestMethod.GET, value = "/name")
    String name();
}
