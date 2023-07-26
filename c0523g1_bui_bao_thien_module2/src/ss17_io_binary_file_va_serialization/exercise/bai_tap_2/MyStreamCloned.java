package ss17_io_binary_file_va_serialization.exercise.bai_tap_2;

import java.io.*;
import java.util.ArrayList;

public class MyStreamCloned {
    public static void writeObject(ArrayList<Customer> customers, String FILE_PATH ) {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH);
             ObjectOutputStream oos = new ObjectOutputStream(fos);)
        {
            oos.writeObject(customers);
            System.out.println("Write done");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<Customer> readObject(String filePath) {
        ArrayList<Customer> result = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis);)
        {
            result = (ArrayList<Customer>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found bro");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
    public static void myObjectCloneMethod(String inputPath, String outputPath) {
        try (FileOutputStream fos = new FileOutputStream(outputPath);
             ObjectOutputStream oos = new ObjectOutputStream(fos);)
        {
            ArrayList<Customer> temp = new ArrayList<>();
            temp = readObject(inputPath);
            oos.writeObject(temp);
            System.out.println("Data File Cloned");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
