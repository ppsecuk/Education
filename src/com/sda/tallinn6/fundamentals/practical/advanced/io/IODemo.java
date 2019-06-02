package com.sda.tallinn6.fundamentals.practical.advanced.io;

import java.io.*;

public class IODemo {
    public static void main(String[] args) throws IOException {
        String fileName = "/home/pavel/Desktop/test";
        writeTextToFile(fileName, "Hello !!!");
        printFileText(fileName);
    }



    public static void writeTextToFile(String fileName, String text) throws IOException {
        File file = new File(fileName);

        FileWriter fileWriter = new FileWriter(file, true);

        fileWriter.write(text);

        fileWriter.close();
    }

    public static void printFileText(String fileName){
        File file = new File("/home/pavel/Desktop/test");
        System.out.println(file.exists());
        System.out.println(file.getPath());

        try (FileReader fileReader = new FileReader(file)){
            int i;
            do{
                i = fileReader.read();
                if(i != -1){
                    char ch = (char) i;
                    System.out.print(ch);
                }
            }
            while(i != -1);

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
