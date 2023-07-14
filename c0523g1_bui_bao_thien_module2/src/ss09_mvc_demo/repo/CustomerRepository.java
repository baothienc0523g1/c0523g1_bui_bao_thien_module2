package ss09_mvc_demo.repo;

import ss09_mvc_demo.model.Customer;
import ss09_mvc_demo.service.CustomerService;

import java.util.ArrayList;
import java.util.Objects;

public class CustomerRepository extends Customer implements ICustomerRepository {
    /*Ở đây lấy dữ liệu tự nhập vào thay cho DB vì chưa
     * thể lấy được dữ liệu DB vào lúc. Gọi khuôn mẫu Customer
     * đã tạo ở model*/

    public final static int DEFAULT_CAPACITY = 10;
    public static ArrayList<Customer> customersList = new ArrayList<>(DEFAULT_CAPACITY);
    private static int size;

    static {
        Customer customer1 = new Customer(1, "An", 18, "Type I");
        Customer customer2 = new Customer(2, "Binh", 20, "Type II");
        Customer customer3 = new Customer(3, "Chinh", 22, "Type III");
        Customer customer4 = new Customer(4, "Dinh", 24, "Type IV");
        Customer customer5 = new Customer(5, "Hoang", 26, "Type V");
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
        }
        return true;
    }

    public void ensureCapacity() {
        if (size == customersList.size()) {
            ArrayList<Customer> newCustomerList = new ArrayList<>(size * 2);
            for (int i = 0; i < customersList.size(); i++) {
                newCustomerList.add(i, customersList.get(i));
            }
            customersList = newCustomerList;
        }
    }

    @Override
    public ArrayList<Customer> getList() {
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                System.out.println(customersList.get(i));
            }
            return customersList;
        } else {
            return null;
        }
    }

        @Override
        public void add (Customer customer){
            if (checkSize()) {
           /* Scanner sc = new Scanner(System.in);

            System.out.print("Insert ID: ");
            int ID = Integer.parseInt(sc.nextLine());

            System.out.print("Insert ID: ");
            String name = String.valueOf(Integer.parseInt(sc.next()));

            System.out.print("Insert age: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("Insert customer type: ");
            String customerType = String.valueOf(Integer.parseInt(sc.next()));

            Customer newCustomer = new Customer(id, name, age, customerType); */

                size++;
                customersList.add(size - 1, customer);
                System.out.println("Added to list!");
            } else {
                ensureCapacity();
                size++;
                customersList.add(size, customer);
            }
        }

        @Override
        public void remove (int id){
            int count = 0;
            for (int i = 0; i < customersList.size(); i++) {
                if (customersList.get(i).getId() == id) {
                    customersList.remove(i);
                    size--;
                    System.out.println("ID Removed");
                    break;
                } else {
                    count++;
                    if (count == customersList.size()) {
                        System.out.println("Invalid ID, try it again bro");
                    }
                }
            }
        }

        @Override
        public void find(String name){
            for (int i = 0; i < customersList.size(); i++) {
                if (customersList.get(i).getName().contains(name)) {
                    System.out.println(customersList.get(i));
                }
            }
       }
    }
