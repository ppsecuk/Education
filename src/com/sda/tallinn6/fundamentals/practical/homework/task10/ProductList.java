package com.sda.tallinn6.fundamentals.practical.homework.task10;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

    private List<Product> listOfProducts = new ArrayList<>();

    public void printAllProducts() {
        for (int i = 0; i < listOfProducts.size(); i++) {
            Product existingProduct = listOfProducts.get(i);
            System.out.println(listOfProducts.get(i).getName());
        }
    }

    public void insertProduct(Product product) {
        listOfProducts.add(product);
    }

    public void removeProduct(int index) {
        listOfProducts.remove(0);
    }

    public int getIndexOfProduct(String name) {

        for (int i = 0; i < listOfProducts.size(); i++) {
            Product product = listOfProducts.get(i);
            String nameOfThisProduct = product.getName();
            if (nameOfThisProduct.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isNotFull() {
        if (listOfProducts.size() < 5) {
            return true;
        }
        return false;
    }
}
