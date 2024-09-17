package org.launchcode;

import java.sql.SQLOutput;

public class Restaurant {
    public static void main(String[] args) {
        Menu testMenu = new Menu();
        MenuItem item1 = new MenuItem("Mozzerella Sticks", 6.99, "breaded mozzerella cheese, deep fried to perfection.", "appetizer", true, "09/16/2024");
        testMenu.addMenuItem(item1);
        MenuItem item2 = new MenuItem("Spaghetti", 8.99, "roma red tomato sauce served on a bed of angel hair pasta.", "entree", true, "09/16/2024");
        testMenu.addMenuItem(item2);
        MenuItem item3 = new MenuItem("Cannoli", 5.99, "fried pastry dough filled with delicious cream drizzled with chocolate.", "dessert", true, "09/16/2024");
        testMenu.addMenuItem(item3);
        MenuItem item4 = new MenuItem("Cannoli", 5.99, "fried pastry dough filled with delicious cream drizzled with chocolate.", "dessert", true, "09/16/2024");

        System.out.println(testMenu.getMenuItems().get(0).getName());
        System.out.println(testMenu.getMenuItems().get(1).getName());
        System.out.println(testMenu.getMenuItems().get(2).getName());

        testMenu.removeMenuItem(item2);
        System.out.println(testMenu.getMenuItems().get(1).getName());
        System.out.println(item3.equals(item4));

        testMenu.printMenu();
    }
}
