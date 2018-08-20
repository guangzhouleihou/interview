package com.leihou.mapper;

import com.leihou.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("select * from hm_user where username=#{username} and password =#{password}")
    User login(User user);

    @Update("update hm_user set password=#{password},mobile=#{mobile}")
    int update(User user);

    @Select("select * from hm_user where id=#{id}")
    User queryById(String id);

    @Insert("insert into values(#{id},#{username},#{passward})")
    int createHmUser(User user);

    @Select("select * from hm_user")
    List<User> queryAll();

}
