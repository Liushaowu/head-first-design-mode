package com.design.mode.composite;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 16:26
 * @description 菜单项
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public void print(){
        System.out.print(" "+getName());
        if (isVegetarian()){
            System.out.print("(v)");
        }
        System.out.println("，"+getPrice());
        System.out.println("   -- "+getDescription());
    }
}
