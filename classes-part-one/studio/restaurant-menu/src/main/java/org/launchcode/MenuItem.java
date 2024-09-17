package org.launchcode;

import java.time.LocalDate;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private String dateAdded;

    public MenuItem(String name, double price, String description, String category, boolean isNew, String dateAdded) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.dateAdded = dateAdded;
    }
    public void setName(String name) {

        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }
    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public boolean isNew() {
        return isNew;
    }
    public String getDateAdded() {
        return dateAdded;
    }

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        MenuItem comparedItem = (MenuItem) toBeCompared;
            return comparedItem.getName() == getName();
        }

}

