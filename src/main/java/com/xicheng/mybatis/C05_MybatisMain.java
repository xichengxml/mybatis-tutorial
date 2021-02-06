package com.xicheng.mybatis;

import com.xicheng.mybatis.common.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * description $的正确使用
 *
 * @author xichengxml
 * @date 2021/2/1 下午 11:53
 */
public class C05_MybatisMain {

    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 配置数据源，扫描Mapper.xml文件
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 构建sql执行器
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 构造代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int id = mapper.selectId("id", 1);
        System.out.println(id);
        sqlSession.commit();
        sqlSession.flushStatements();
        sqlSession.close();
    }
}
