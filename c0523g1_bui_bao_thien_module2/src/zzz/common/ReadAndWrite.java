package zzz.common;

import zzz.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<Product> readFromFile(String inputLocation) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(inputLocation);
            ObjectInputStream ois = new ObjectInputStream(fis);

            products = (List<Product>) ois.readObject();

            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    public static void writeToFile(String inputLocation, String outputLocation) {
        try {
            FileOutputStream fos = new FileOutputStream(outputLocation);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(readFromFile(inputLocation));

            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
