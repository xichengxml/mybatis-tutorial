package com.xicheng.mybatis.common;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/2/2 上午 12:01
 */
@Mapper
public interface UserMapper {

    User select(int id);

    int selectId(@Param("id") String idStr, @Param("id") int idInt);

    User selectByIdAndName(@Param("id") int id, @Param("name") String name);
}
