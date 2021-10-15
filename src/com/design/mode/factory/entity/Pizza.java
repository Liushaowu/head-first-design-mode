package com.design.mode.factory.entity;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 16:28
 * @description 披萨
 */
public abstract class Pizza {
    String name;

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

    public String toString() {
        //打印披萨
        return "";
    }
}
