package com.sda.tallinn6.fundamentals.lectures.nineteen;



import java.util.ArrayList;
import java.util.List;
//--------------------------- LECTURE 21 -----------------------
public class Account {
    double balance;

    List<Product> listOfBoughtProducts = new ArrayList<>();

    public void addUpdateProduct(String productName,int amount){
        for (Product boughtExistingProduct: listOfBoughtProducts) {
            if(boughtExistingProduct.getName().equalsIgnoreCase(productName)){
                int updatedAmount = boughtExistingProduct.getQuantity()+amount;
                boughtExistingProduct.setQuantity(updatedAmount);
                return ;
            }
        }
        Product newProduct = new Product(productName, amount);
       // newProduct.setName(productName);
      //  newProduct.setQuantity(amount);
        listOfBoughtProducts.add(newProduct);


        /*  boolean isExisting = false;

        for (Product boughtExistingProduct : listOfBoughtProducts) {
            if (boughtExistingProduct.getName().equalsIgnoreCase(productName)) {
                int updatedAmount = boughtExistingProduct.getQuantity() + amount;
                boughtExistingProduct.setQuantity(updatedAmount);
                isExisting = true;
                break;
            }
        }
        if (!isExisting) {
            Product newProduct = new Product();
            newProduct.setName(productName);
            newProduct.setQuantity(amount);
            listOfBoughtProducts.add(newProduct);
        }*/
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public boolean deduct(double cost) {
        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
        cost = superMarketUtilities.round(cost);
        balance = superMarketUtilities.round(balance);
        if (balance < cost) {
            System.out.println("There is not enough money");
            return false;
        }else{
            balance = balance - cost;
            balance = superMarketUtilities.round(balance);
            return true;
        }

      /*  double threshold = .0001;
      if (Math.abs(balance - cost) < threshold) {
            balance = balance - cost;
            balance = superMarketUtilities.round(balance);
            return true;
        } else if (balance > cost) {
            balance = balance - cost;
            balance = superMarketUtilities.round(balance);
            return true;
        } else {
            System.out.println("There is not enough money");
            return false;
        }*/
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Product> getListOfBoughtProducts() {
        return listOfBoughtProducts;
    }

    public void setListOfBoughtProducts(List<Product> listOfBoughtProducts) {
        this.listOfBoughtProducts = listOfBoughtProducts;
    }

    public void printAccountInfo() {
        System.out.println("--------------------");
        for (Product boughtProduct: listOfBoughtProducts) {
            System.out.println("Product Name:"+boughtProduct.getName()+" Quantity:"+boughtProduct.getQuantity());
        }
        System.out.println("Last Balance:"+balance);
        System.out.println("--------------------");
    }
}
