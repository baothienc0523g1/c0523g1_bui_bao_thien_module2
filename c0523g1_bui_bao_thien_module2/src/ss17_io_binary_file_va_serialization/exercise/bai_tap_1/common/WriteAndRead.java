package ss17_io_binary_file_va_serialization.exercise.bai_tap_1.common;

import ss17_io_binary_file_va_serialization.exercise.bai_tap_1.model.ProductSs17;

import java.io.*;
import java.util.ArrayList;

public class WriteAndRead {
    public static ArrayList<ProductSs17> readFromFile(String inputLocation) {
        ArrayList<ProductSs17> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(inputLocation);
            ObjectInputStream ois = new ObjectInputStream(fis);

            products = (ArrayList<ProductSs17>) ois.readObject();

            ois.close();
            fis.close();

        } catch (FileNotFoundException fnf) {
            System.out.println("Cant find the file you to find");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public static void writeToFile(ArrayList<ProductSs17> input, String outputLocation) {
        try {
            FileOutputStream fos = new FileOutputStream(outputLocation);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(input);

            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
