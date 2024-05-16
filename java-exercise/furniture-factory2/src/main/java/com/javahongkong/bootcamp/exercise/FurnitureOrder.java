package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        this.ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        this.ordersOfFurnitures.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float totalCost = 0f;
        for (Map.Entry<Furniture, Integer> entry : ordersOfFurnitures
                .entrySet()) {
            Furniture lable = entry.getKey();
            totalCost += lable.cost() * entry.getValue();
        }
        return totalCost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        int size = 0;
        for (Map.Entry<Furniture, Integer> entry : ordersOfFurnitures
                .entrySet()) {
            Furniture lable = entry.getKey();
            if (lable.equals(type)) {
                size += entry.getValue();
            }
        }
        return size;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        float typeCost = 0f;
        for (Map.Entry<Furniture, Integer> entry : ordersOfFurnitures
        .entrySet()) {
            Furniture lable = entry.getKey();
            if (lable.equals(type)) {
                typeCost += lable.cost() * entry.getValue();
            }
        }
        return typeCost;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int totalOrderQty = 0;
        for (Map.Entry<Furniture, Integer> entry : ordersOfFurnitures
        .entrySet()) {
            totalOrderQty += entry.getValue();
        }
        return totalOrderQty;
    }
}
