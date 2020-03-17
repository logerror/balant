package com.sourcecode.balant.user.biz.dao;


import com.sourcecode.balant.user.biz.dataobject.UserDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    UserDO getUserById(@Param("id") Long id);
}
