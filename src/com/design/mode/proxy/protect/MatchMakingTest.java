package com.design.mode.proxy.protect;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/28 16:19
 * @description 测试
 */
public class MatchMakingTest {
    public static void main(String[] args) {
        PersonBean person = new PersonBeanImpl();
        person.setName("Joe javaBean");
        person.setGender("男");
        person.setHotOrNotRating(10);
        person.setInterests("打篮球");
        PersonBean ownerProxy = PersonBeanProxy.getOwnerProxy(person);
        String name = ownerProxy.getName();
        System.out.println("使用owner proxy 获取名称: " + name);
        try {
            ownerProxy.setHotOrNotRating(1);
        } catch (Exception e) {
            System.out.println("不可以修改热度评分");
        }
        ownerProxy.setInterests("踢足球");
    }


}
