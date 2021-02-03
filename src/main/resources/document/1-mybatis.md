#### 拆解
* 数据源：driver、url、user、password
* 执行语句 crud
* 操作: Connection、PreparedStatement、ResultSet

#### 源码技巧
宏观 -> 微观 -> 图解

#### 问题
1. 如何获取数据库源
environmentsElement:300, XMLConfigBuilder (org.apache.ibatis.builder.xml)
parseConfiguration:120, XMLConfigBuilder (org.apache.ibatis.builder.xml)
parse:101, XMLConfigBuilder (org.apache.ibatis.builder.xml)
build:79, SqlSessionFactoryBuilder (org.apache.ibatis.session)
build:64, SqlSessionFactoryBuilder (org.apache.ibatis.session)
main:23, C01_MybatisMain (com.xicheng.mybatis)


2. 如何执行数据SQL语句
3. 如何执行数据库