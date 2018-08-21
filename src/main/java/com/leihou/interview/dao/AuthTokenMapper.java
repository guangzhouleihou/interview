package com.leihou.interview.dao;

import com.leihou.interview.pojo.AuthToken;

public interface AuthTokenMapper {
    int deleteByPrimaryKey(String id);

    int insert(AuthToken record);

    int insertSelective(AuthToken record);

    AuthToken selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AuthToken record);

    int updateByPrimaryKey(AuthToken record);
    
    AuthToken selectToken(String name,String token);
}