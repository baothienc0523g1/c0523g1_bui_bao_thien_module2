package ss17_io_binary_file_va_serialization.exercise.bai_tap_2;

import java.util.ArrayList;

public class Main extends MyStreamCloned {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        String inputPath = "D:\\GIT - Bai tap\\c0523g1_bui_bao_thien_module2\\src\\ss17_io_binary_file_va_serialization\\exercise\\bai_tap_2\\customer.dat";
        String outputPath = "D:\\GIT - Bai tap\\c0523g1_bui_bao_thien_module2\\src\\ss17_io_binary_file_va_serialization\\exercise\\bai_tap_2\\customerOutput.dat";

        customers.add(new Customer(1, "A", 18, "V"));
        customers.add(new Customer(2, "B", 8, "V"));
        customers.add(new Customer(3, "C", 28, "X"));
        customers.add(new Customer(4, "D", 48, "I"));
        customers.add(new Customer(5, "E", 58, "II"));
        customers.add(new Customer(6, "F", 68, "III"));

        writeObject(customers,inputPath);
        myObjectCloneMethod(inputPath, outputPath);
    }
}
