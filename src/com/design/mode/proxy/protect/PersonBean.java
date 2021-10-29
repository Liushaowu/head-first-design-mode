package com.design.mode.proxy.protect;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/28 15:09
 * @description
 */
public interface PersonBean {
    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();


    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);
}
