package service.customer;

import controller.controller_sub.CustomerController;

import model.person.Customer;

import repository.customer.CustomerRepository;
import repository.customer.ICustomerRepository;

import service.booking.BookingService;
import service.customer.customer_sub.CustomerAdd;
import service.customer.customer_sub.CustomerEdit;

import utilities.MyLocalDateRegex;
import utilities.MyRegex;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CustomerService extends MyRegex implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepository();
    private static Scanner scanner = new Scanner(System.in);

    public boolean idCheck(String id) {
        boolean flag = true;
        List<Customer> temp = customerRepository.getList();

        for (int i = 0; i < temp.size(); i++) {
            Customer customer = temp.get(i);
            if (customer.getId().equals(id)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    @Override
    public void getList() {
        List<Customer> customerList = customerRepository.getList();
        if (customerList.size() == 0) {
            System.out.println("Nothing to show");
        } else {
            for (Customer c : customerList) {
                System.out.println(c);
                System.out.println("");
            }
        }
    }

    @Override
    public void add() {
        CustomerAdd customerAdd = new CustomerAdd();
        customerAdd.add();
    }

    @Override
    public void edit() {
        CustomerEdit customerEdit = new CustomerEdit();
        customerEdit.editWithCase();
    }

    @Override
    public void delete() {
        System.out.println("Enter customer's ID need to remove");
        String id = scanner.nextLine();
        if (!idCheck(id)) {
            customerRepository.delete(id);
            System.out.println("Customer with id " + id + " is removed");
        } else {
            System.out.println("Invalid id");
        }
    }

    @Override
    public void searchByName() {
        System.out.println("Enter customer name need to search");
        String name = scanner.nextLine();
        if (customerRepository.search(name).size() > 0) {
            System.out.println(customerRepository.search(name));
        } else {
            System.out.println("Cant find customer with name " + name);
        }
    }

    public void getIdAndName() {
        Map<String, String> idAndName = customerRepository.getIdAndName();
        System.out.println("Pick a customer in list down below: ");
        for (String stringMap : idAndName.keySet()) {
            System.out.println(stringMap + " | " + idAndName.get(stringMap));
        }
    }
}
