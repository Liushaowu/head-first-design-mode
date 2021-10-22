package com.design.mode.composite;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 16:40
 * @description 服务员
 */
public class Waitress {
    MenuComponent allMenu;

    public Waitress(MenuComponent allMenu) {
        this.allMenu = allMenu;
    }

    public void printMenu() {
        allMenu.print();
    }
}
