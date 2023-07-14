package ss09_1_mvc.repo;

import ss09_1_mvc.model.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerRepository implements ICustomerRepository {
    /*Ở đây lấy dữ liệu tự nhập vào thay cho DB vì chưa
     * thể lấy được dữ liệu DB vào lúc. Gọi khuôn mẫu Customer
     * đã tạo ở model*/

    public final static int DEFAULT_CAPACITY = 10;
    public static ArrayList<Customer> customersList = new ArrayList<>(DEFAULT_CAPACITY);
    private static int size;

    static {
        Customer customer1 = new Customer(1, "An", 18, "Type I");
        Customer customer2 = new Customer(2, "Binh", 18, "Type II");
        Customer customer3 = new Customer(3, "Chuong", 18, "Type III");
        Customer customer4 = new Customer(4, "Duy", 18, "Type IV");
        Customer customer5 = new Customer(5, "Hung", 18, "Type V");
        customersList.add(0, customer1);
        customersList.add(1, customer2);
        customersList.add(2, customer3);
        customersList.add(3, customer4);
        customersList.add(4, customer5);
        size = customersList.size();
    }

    public boolean checkSize() {
        if (size > customersList.size()) {
            return false;
        } return true;
    }
    public void ensureCapacity() {
        if (size == customersList.size()) {
            ArrayList<Customer> newCustomerList = new ArrayList<>(size * 2);
            for (int i = 0; i < customersList.size(); i++) {
                newCustomerList.add(i,customersList.get(i));
            }
            customersList = newCustomerList;
        }
    }
    @Override
    public ArrayList<Customer> getList() {
        ArrayList<Customer> customer = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            System.arraycopy(customersList, 0, customer, 0, size - 1);
        }
        return customer;
    }

    @Override
    public void add(Customer customer) {
        if (checkSize()) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Insert ID: ");
            int id = sc.nextInt();

            System.out.print("Insert ID: ");
            String name = String.valueOf(Integer.parseInt(sc.next()));

            System.out.print("Insert age: ");
            int age = sc.nextInt();

            System.out.print("Insert customer type: ");
            String customerType = String.valueOf(Integer.parseInt(sc.next()));

            Customer newCustomer = new Customer(id, name, age, customerType);

            customersList.add(size - 1, newCustomer);
            size++;
        } else {
            ensureCapacity();
            add(customer);
        }
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Customer find(String name) {
        return null;
    }
}
