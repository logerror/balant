package com.sourcecode.balant.nacosservice.biz.service;

import com.sourcecode.balant.nacosservice.api.NacosMessageService;
import org.springframework.stereotype.Service;

@Service
@org.apache.dubbo.config.annotation.Service(validation = "true", version = "${dubbo.provider.NacosMessageService.version}")
public class NacosMessageServiceImpl implements NacosMessageService {
    @Override
    public String getMessage() {
        return "this is nacos message";
    }
}
