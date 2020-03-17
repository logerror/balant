package com.sourcecode.balant.user.biz.service;

import com.sourcecode.balant.user.api.UserService;
import com.sourcecode.balant.user.api.bo.UserBO;
import com.sourcecode.balant.user.biz.dao.UserMapper;
import com.sourcecode.balant.user.biz.dataobject.UserDO;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@org.apache.dubbo.config.annotation.Service(validation = "true", version = "${dubbo.provider.UserService.version}")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBO getUserById(Long id) {
        UserDO userDO = userMapper.getUserById(id);
        UserBO userBO = new UserBO();
        userBO.setNickname(userDO.getNickname());
        return userBO;
    }
}
