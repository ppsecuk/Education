package com.sda.tallinn6.fundamentals.practical.homework.task11;

import java.util.Scanner;

public class ArrayUtilities {

    public String[] add(String itemAdded,String[] items){

        for (int counter = 0; counter < items.length; counter++) {
            if (items[counter].equalsIgnoreCase(itemAdded)) {
                System.out.println("Item located at index " + counter + " No need to add.");
                return items;
            }
        }
        for (int counter = 0; counter < items.length; counter++) {
            if (items[counter].isEmpty()) {
                items[counter] = itemAdded;
                System.out.println("Item added");
                return items;
            }
        }
        System.out.println("Array is full cannot add.");
        return items;
    }


    public String[] remove(String itemRemoved,String[] items){

        boolean isEmpty=true;

        for (int counter = 0; counter < items.length; counter++) {
            if (items[counter].equalsIgnoreCase(itemRemoved)) {
                System.out.println("Item removed");
                items[counter] = "";
                return items;
            }
            if (!items[counter].isEmpty()){
                isEmpty=false;
            }
        }
        if(isEmpty){
            System.out.println("Array is empty");
        }else{
            System.out.println("Item not found");
        }

        return items;
    }


    public void view(String[] items){

        boolean isFirst=true;

        for (int counter = 0; counter < items.length; counter++) {
            if (!items[counter].isEmpty()) {
                if (isFirst) {
                    isFirst = false;
                    System.out.print(items[counter]);
                } else {
                    System.out.print("," + items[counter]);
                }

            }
        }
        if(!isFirst){
            System.out.println();
        }else{
            System.out.println("Array is empty. Nothing to show.");
        }
    }


    public String[] search(String itemSearched,String[] items){

        boolean isEmpty=true;

        for (int counter = 0; counter < items.length; counter++) {
            if (items[counter].equalsIgnoreCase(itemSearched)) {
                System.out.println("Item located at index " + counter );
                return items;
            }
            if (!items[counter].isEmpty()){
                isEmpty=false;
            }
        }
        if(isEmpty){
            System.out.println("Array is empty");
        }else{
            System.out.println("Item not found");
        }

        return items;
    }

}
