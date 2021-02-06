#### SQL注入
* 存在$ -- 动态sql

真正执行的时候，才会去赋值
* 全部都是# -- 静态sql
```
select * from `user` where id = #{id}
```
解析配置文件的时候，先用?替代#{}，真正执行sql的时候再去赋值

真正解决sql注入是在Mysql中实现的：com.mysql.cj.ClientPreparedQueryBindings.setString
```
StringBuilder quotedString = new StringBuilder(x.length() + 2);
quotedString.append('\'');
quotedString.append(x);
quotedString.append('\'');
```

${}的正确使用
```
select ${id} from `user` where id = #{id}
```
