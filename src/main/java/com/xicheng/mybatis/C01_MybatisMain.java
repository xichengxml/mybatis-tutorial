package com.xicheng.mybatis;

import com.xicheng.mybatis.common.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * description 使用xml配置
 *
 * @author xichengxml
 * @date 2021/2/1 下午 11:53
 */
public class C01_MybatisMain {

    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 代码入口
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession session = sqlSessionFactory.openSession()) {
            User user = session.selectOne(
                    "com.xicheng.mybatis.common.UserMapper.selectBlog", 1);
            System.out.println(user);
        }
    }
}
