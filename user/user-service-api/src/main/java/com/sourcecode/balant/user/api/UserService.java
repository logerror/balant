package com.sourcecode.balant.user.api;


import com.sourcecode.balant.user.api.bo.UserBO;

public interface UserService {
    UserBO getUserById(Long id);
}
