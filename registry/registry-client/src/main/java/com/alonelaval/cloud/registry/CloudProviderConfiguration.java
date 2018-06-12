package com.alonelaval.cloud.registry;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @author huawei
 * @create 2018-05-18
 **/
public class CloudProviderConfiguration {
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new RandomRule();
    }
}