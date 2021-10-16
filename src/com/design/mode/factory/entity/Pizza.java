package com.design.mode.factory.entity;

import com.design.mode.factory.entity.abs.ingredient.*;

import java.util.Arrays;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:28
 * @description 披萨
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    /**
     * 制作前 准备
     */
    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the Pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        //打印披萨
        return name + "\r\n"
                + "ingredient table：\r\n"
                + ingredient("dough", dough)
                + ingredient("sauce", sauce)
                + ingredient("veggies", veggies != null ? Arrays.toString(veggies) : null)
                + ingredient("cheese", cheese)
                + ingredient("pepperoni", pepperoni)
                + ingredient("clams", clams);
    }

    String ingredient(String title, Object val) {
        if (val == null || "".equals(val.toString().trim())) {
            return "";
        }
        return title + "：" + val + "\r\n";
    }
}
