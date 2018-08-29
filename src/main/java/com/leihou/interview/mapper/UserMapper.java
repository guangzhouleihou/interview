package com.leihou.interview.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.leihou.interview.pojo.User;


public interface UserMapper {
    @Select("SELECT * FROM hm_user")
    List<User> getAll();

    @Select("SELECT * FROM hm_user WHERE id = #{id}")
    User getOne(String id);

    @Select("SELECT * FROM hm_user WHERE loginid = #{loginid} and password = #{password}")
    User getOneByUser(User user);

    @Insert("INSERT INTO hm_user(id,loginid,password,username) VALUES(#{id},#{loginid}, #{password}, #{username})")
    int insert(User user);

    @Update("UPDATE hm_user SET username=#{username} WHERE id =#{id}")
    int update(User user);
}
