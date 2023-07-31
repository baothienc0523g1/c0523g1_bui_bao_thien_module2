package repository.customer;

import model.person.Customer;
import utilities.ReadAndWrite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository extends ReadAndWrite implements ICustomerRepository {
    private final String CUSTOMER_FILE_PATH = "D:\\GIT - Bai tap\\case_study\\src\\data\\customer.csv";
    private List<Customer> customerList = listToCustomer();

    private List<Customer> listToCustomer() {
        List<Customer> customers = new ArrayList<>();
        List<String> stringList = myReadFromCSV(CUSTOMER_FILE_PATH);
        String[] pointer = null;


        for (String s : stringList) {
            pointer = s.split(",");
            Customer customer = new Customer(pointer[0], LocalDate.parse(pointer[1]), pointer[2],
                    pointer[3], pointer[4], pointer[5], pointer[6], pointer[7],
                    pointer[8]);
            customers.add(customer);
        }
        return customers;
    }

    @Override
    public List<Customer> getList() {
        return customerList;
    }

    @Override
    public void add(Customer customer) {
        List<String> temp = new ArrayList<>();
        temp.add(customer.getInfoToCSV());
        myWriteToCSV(temp, CUSTOMER_FILE_PATH, true);
    }

    @Override
    public void edit(String id, Customer customer) {
        for (Customer c : customerList) {
            if (c.getId().equals(id)) {
                c.setId(id);
                c.setName(customer.getName());
                c.setBirthDay(customer.getBirthDay());
                c.setGender(customer.getGender());
                c.setPersonalId(customer.getPersonalId());
                c.setPhoneNumber(customer.getPhoneNumber());
                c.setEmail(customer.getEmail());
                c.setType(customer.getType());
                c.setAddress(customer.getAddress());
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Customer c : customerList) {
            stringList.add(c.getInfoToCSV());
        }
        myWriteToCSV(stringList, CUSTOMER_FILE_PATH, false);
    }

    @Override
    public void delete(String id) {
        List<Customer> temp = customerList;
        for (int i = 0; i < temp.size(); i++) {
            Customer c = temp.get(i);
            if (c.getId().equals(i)) {
                customerList.remove(c);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Customer c : customerList) {
            stringList.add(c.getInfoToCSV());
        }
        myWriteToCSV(stringList, CUSTOMER_FILE_PATH, false);
    }

    @Override
    public List<Customer> search(String name) {
        List<Customer> customers = new ArrayList<>();
        for (Customer c : customerList) {
            String temp = c.getName().toLowerCase();
            if (temp.contains(name.toLowerCase())) {
                customers.add(c);
            }
        }
        return customers;
    }
}
