package com.xicheng.mybatis;

import com.xicheng.mybatis.common.UserMapper;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * description 通过反射获取参数名，默认是arg0，arg1
 * jdk8，可以加一个编译配置，修改参数名，这样mybatis可以不用再使用@Param注解
 * <compilerArgs>
 *    <compilerArg>-parameters</compilerArg>
 * </compilerArgs>
 *
 * @author xichengxml
 * @date 2021/2/6 上午 08:12
 */
public class C04_MethodTest {

    public static void main(String[] args) throws Exception {
        Method method = UserMapper.class.getMethod("selectByIdAndName", new Class[]{int.class, String.class});
        for (Parameter parameter : method.getParameters()) {
            System.out.println(parameter.getName());
        }
    }
}
