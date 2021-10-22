package com.design.mode.composite;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/22 16:42
 * @description 菜单测试
 */
public class MenuTest {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        MenuComponent allMenu = new Menu("All Menus", "All menus combined");
        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinerMenu);
        allMenu.add(cafeMenu);
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce,and a slice of sourdough bread", true, 3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));
        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();
    }


}
