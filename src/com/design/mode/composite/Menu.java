package com.design.mode.composite;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 16:31
 * @description 菜单
 */
public class Menu extends MenuComponent {
    List<MenuComponent> components = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        components.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        components.remove(menuComponent);
    }


    @Override
    public MenuComponent getChild(int i) {
        return components.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println("," + getDescription());
        System.out.println("-------------------------");
        Iterator<MenuComponent> iterator = components.iterator();
        while (iterator.hasNext()) {
            MenuComponent next = iterator.next();
            next.print();
        }
    }
}
