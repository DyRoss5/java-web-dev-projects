package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Menu {

        private List<MenuItem> menuItems;
        private LocalDate lastUpdated;

    public Menu() {
            this.menuItems = new ArrayList<>();
            this.lastUpdated = LocalDate.now();
        }

        public void addMenuItem(MenuItem item) {
            menuItems.add(item);
            lastUpdated = LocalDate.now();
        }

        public void removeMenuItem(MenuItem item) {
            menuItems.remove(item);
            lastUpdated = LocalDate.now();
        }

        public List<MenuItem> getMenuItems() {
            return menuItems;
        }

        public LocalDate getLastUpdated() {
            return lastUpdated;
        }

        public MenuItem getItem(String itemName) {
        int itemIndex = menuItems.indexOf(itemName);
        return menuItems.get(itemIndex);
        }

        public void printMenu() {
        for (MenuItem item : menuItems) {
            System.out.println(item.getName());
        }
        }

    }


