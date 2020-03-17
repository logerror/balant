package com.sourcecode.balant.octopus.biz.service;

import com.sourcecode.balant.octopus.api.ActionService;
import com.sourcecode.balant.octopus.api.bo.ActionBO;
import com.sourcecode.balant.user.api.UserService;
import com.sourcecode.balant.user.api.bo.UserBO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
@org.apache.dubbo.config.annotation.Service(validation = "true", version = "${dubbo.provider.ActionService.version}")
public class ActionServiceImpl implements ActionService {

    @Reference(validation = "true", version = "${dubbo.consumer.UserService.version}")
    private UserService userService;

    @Override
    public ActionBO getActionById(Long id) {
        //此处只是为了展示RPC远程调用的过程
        UserBO userBO = userService.getUserById(1L);
        ActionBO actionBO = new ActionBO();
        actionBO.setUserNickName(userBO.getNickname());
        return actionBO;
    }
}
