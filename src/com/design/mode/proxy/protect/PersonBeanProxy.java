package com.design.mode.proxy.protect;

import java.lang.reflect.Proxy;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/28 16:16
 * @description 代理类
 */
public class PersonBeanProxy {
    public static PersonBean  getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));

    }
}
