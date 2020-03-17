package com.sourcecode.balant.system.biz.service;


import com.sourcecode.balant.octopus.api.ActionService;
import com.sourcecode.balant.system.api.SystemAdminService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class SystemAdminServiceImpl implements SystemAdminService {

    @Reference(validation = "true", version = "${dubbo.consumer.ActionService.version}")
    private ActionService actionService;

    @Override
    public String getUserName() {
        return actionService.getActionById(1L).getUserNickName();
    }
}
