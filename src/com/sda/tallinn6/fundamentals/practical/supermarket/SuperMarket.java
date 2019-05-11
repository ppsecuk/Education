package com.sda.tallinn6.fundamentals.practical.supermarket;

import java.util.ArrayList;
import java.util.List;

public class SuperMarket {

    //private Product[] listOfProducts;


    private List<Product> listOfProducts = new ArrayList<>();

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void printAllProducts() {
        for (int i = 0; i < listOfProducts.size(); i++) {
            Product existingProduct = listOfProducts.get(i);
            System.out.println(listOfProducts.get(i).getName() + " " + listOfProducts.get(i).getPrice() + " " + listOfProducts.get(i).getQuantity());
        }
    }

    public void insertProduct(Product product) {

        /*Product product1 = new Product("product1", 10.99);
        Product product2 = new Product("product2", 11.99);
        Product product3 = new Product("product3", 12.99);
        Product product4 = new Product("product4", 13.99);

        listOfProducts.add(product1);
        listOfProducts.add(product2);
        listOfProducts.add(product3);
        listOfProducts.add(product4);*/
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
        }return -1;
    }

}
