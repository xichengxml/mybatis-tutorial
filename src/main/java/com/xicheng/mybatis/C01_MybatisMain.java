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
        // 配置数据源，扫描Mapper.xml文件
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 构建sql执行器
        try (SqlSession session = sqlSessionFactory.openSession()) {
            User user = session.selectOne("com.xicheng.mybatis.common.UserMapper.select", 1);
            System.out.println(user);
        }
    }
}
