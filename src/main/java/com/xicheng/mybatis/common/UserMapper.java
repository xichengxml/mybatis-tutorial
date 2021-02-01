package com.xicheng.mybatis.common;

import org.apache.ibatis.annotations.Mapper;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/2/2 上午 12:01
 */
@Mapper
public interface UserMapper {

    User selectBlog(int id);
}
