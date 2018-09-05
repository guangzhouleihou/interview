package com.leihou.interview.mapper.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    public List<Map<String,Object>> findListSQL(@Param("sql") String sql);


}
