package com.tallinn.four.lectures.nineteen;

import java.util.ArrayList;
import java.util.List;

public class SuperMarket {
    private List<Product> listOfProducts = new ArrayList<>();

    public void printAllProducts(){
        for(int counter=0;counter<listOfProducts.size();counter++){
            Product existingProduct = listOfProducts.get(counter);
            System.out.println(existingProduct.getName()+" "
                    +existingProduct.getPrice());
        }
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }
    /**
     * This method will insert product.
     */
    public void insertProduct(Product incomingProduct) {
        listOfProducts.add(incomingProduct);
    }

    //--------------------------- LECTURE 21 -----------------------
    public void removeProduct(int index) {
        listOfProducts.remove(index);
    }
    //--------------------------- LECTURE 21 -----------------------
    /**
     * incomingProductName: This is user inputted new product name
     * nameOfThisProduct variable contains value of the existing product.
     * return -1 represent there is no product with this name.
     */
    public int getIndexOfProduct(String incomingProductName) {

        for (int counter = 0; counter < listOfProducts.size(); counter++) {
            Product product = listOfProducts.get(counter);
            String nameOfThisProductWhichIsInList = product.getName();
            if (nameOfThisProductWhichIsInList.equalsIgnoreCase(incomingProductName)) {
                return counter;
            }
        }
        return -1;
    }









































}
