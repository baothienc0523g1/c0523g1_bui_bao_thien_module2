package service.customer;

import controller.sub_controller.CustomerController;
import model.person.Customer;
import repository.customer.CustomerRepository;
import repository.customer.ICustomerRepository;
import utilities.MyLocalDateRegex;
import utilities.MyRegex;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class CustomerService extends MyRegex implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepository();
    private CustomerController customerController = new CustomerController();
    MyLocalDateRegex myLocalDateRegex;

    private static Scanner scanner = new Scanner(System.in);

    private boolean idCheck(String id) {
        boolean flag = true;
        List<Customer> temp = customerRepository.getList();
        for (Customer c : temp) {
            if (c.getId().equals(id)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    @Override
    public void getList() {
        List<Customer> customerList = customerRepository.getList();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        System.out.println("Enter customer ID");
        String id = "";
        do {
            id = scanner.nextLine();
            if (!myRegex(id, CUSTOMER_ID)) {
                System.out.println("ID must be KH-YYYY, with Y is a number");
            }
        } while (!myRegex(id, CUSTOMER_ID));

        if (idCheck(id)) {
            do {
                System.out.println("New customer name");
                String name = "";
                do {
                    name = scanner.nextLine();
                    if (!myRegex(name, NAME)) {
                        System.out.println("Wrong syntax of name, try again bro");
                    }
                } while (!myRegex(name, NAME));

                System.out.println("New customer birthday (YYYY-MM-DD)");
                LocalDate birthDay = null;
                do {
                    try {
                        birthDay = LocalDate.parse(scanner.nextLine());
                    } catch (DateTimeParseException e) {
                        System.out.println("Wrong format of day");
                    } catch (DateTimeException e) {
                        System.out.println("Wrong format of day");
                    }
                    if (!myLocalDateRegex.myDateRegex(birthDay) || LocalDate.now().compareTo(birthDay) < 18) {
                        System.out.println("Syntax of birthday is: YYYY-MM-DD, or Customer must over 18 years old");
                    }
                } while (!myLocalDateRegex.myDateRegex(birthDay) || LocalDate.now().compareTo(birthDay) < 18);

                System.out.println("New customer gender");
                String gender = "";
                do {
                    gender = scanner.nextLine();
                    if (!myRegex(gender.toLowerCase(), GENDER)) {
                        System.out.println("Gender only be \"Male\", \"Female\" or \"Else\"");
                    }
                } while (!myRegex(gender.toLowerCase(), GENDER));

                System.out.println("New customer personal id (with 9 or 12 numbers)");
                String personalId = "";
                do {
                    personalId = scanner.nextLine();
                    if (!myRegex(personalId, PERSONAL_ID)) {
                        System.out.println("Personal ID is an array with: 9 or 12 numbers");
                    }
                } while (!myRegex(personalId, PERSONAL_ID));

                System.out.println("New customer phone number (with 10 numbers)");
                String phoneNumber = "";
                do {
                    phoneNumber = scanner.nextLine();
                    if (!myRegex(phoneNumber, PHONE_NUMBER)) {
                        System.out.println("Phone number need start with \"0\" and have 10 numbers");
                    }
                } while (!myRegex(phoneNumber, PHONE_NUMBER));

                System.out.println("New customer email");
                String email = "";
                do {
                    email = scanner.nextLine();
                    if (!myRegex(email, EMAIL)) {
                        System.out.println("Invalid Email");
                    }
                } while (!myRegex(email, EMAIL));

                System.out.println("New customer type");
                String type = "";
                do {
                    type = scanner.nextLine();
                    if (!myRegex(type.toLowerCase(), CUSTOMER_TYPE)) {
                        System.out.println("Customer type must be: Diamond, Platinum, Gold, Silver or Member");
                    }
                } while (!myRegex(type.toLowerCase(), CUSTOMER_TYPE));

                System.out.println("New customer address");
                String address = "";
                do {
                    address = scanner.nextLine();
                    if (!myRegex(address, ADDRESS)) {
                        System.out.println("Wrong address");
                    }
                } while (!myRegex(address, ADDRESS));

                Customer customer = new Customer(name, birthDay, gender,
                        personalId, phoneNumber, email, id, type, address);
                System.out.println("Customer with id " + id + " is added");
                break;
            } while (true);
        } else {
            System.out.println("ID already exist");
        }
    }

    @Override
    public void edit() {
        System.out.println("Enter customer ID need to adjustment");
        String id = "";
        do {
            id = scanner.nextLine();
            if (!myRegex(id, CUSTOMER_ID)) {
                System.out.println("ID must be KH-YYYY, with Y is a number hihi");
            }
        } while (!myRegex(id, CUSTOMER_ID));

        if (idCheck(id)) {
            for (Customer c : customerRepository.getList()) {
                if (c.getId().equals(id)) {
                    System.out.println("Chose which data field need to edit");
                    System.out.println("1. Name and ID");
                    System.out.println("2. Birth day");
                    System.out.println("3. Gender");
                    System.out.println("4. Personal ID");
                    System.out.println("5. Phone number");
                    System.out.println("6. Email");
                    System.out.println("7. Address");
                    System.out.println("8. Customer type");
                    System.out.println("9. All");
                    System.out.println("0. Back to Customer main menu");
                    Integer editChoice = Integer.parseInt(scanner.nextLine());
                    switch (editChoice) {
                        case 1:
                            System.out.println("Customer new name");
                            String name = "";
                            do {
                                name = scanner.nextLine();
                                if (!myRegex(name, NAME)) {
                                    System.out.println("Wrong syntax of name, try again bro");
                                }
                            } while (!myRegex(name, NAME));

                            String newID = "";
                            do {
                                newID = scanner.nextLine();
                                if (!myRegex(newID, CUSTOMER_ID)) {
                                    System.out.println("ID must be KH-YYYY, with Y is a number");
                                }
                            } while (!myRegex(newID, CUSTOMER_ID));
                            c.setName(name);
                            c.setId(newID);
                            customerRepository.edit(id, c);
                            System.out.println("Customer with id " + id + " is edited");
                            break;
                        case 2:
                            System.out.println("Customer new birthday");
                            LocalDate birthDay = null;
                            do {
                                try {
                                    birthDay = LocalDate.parse(scanner.nextLine());
                                } catch (DateTimeParseException e) {
                                    System.out.println("Wrong format of day");
                                } catch (DateTimeException e) {
                                    System.out.println("Wrong format of day");
                                }
                                if (!myLocalDateRegex.myDateRegex(birthDay)) {
                                    System.out.println("Customer birthday must be like: YYYY-MM-DD");
                                } else if (LocalDate.now().compareTo(birthDay) < 18) {
                                    System.out.println("Customer must be older than 18 years old");
                                }
                            } while (!myLocalDateRegex.myDateRegex(birthDay) || LocalDate.now().compareTo(birthDay) < 18);
                            c.setBirthDay(birthDay);
                            customerRepository.edit(id, c);
                            System.out.println("Customer with id " + id + " is edited");
                            break;
                        case 3:
                            System.out.println("Customer new gender");
                            String gender = "";
                            do {
                                gender = scanner.nextLine();
                                if (!myRegex(gender.toLowerCase(), GENDER)) {
                                    System.out.println("Gender only be \"Male\", \"Female\" or \"Else\"");
                                }
                            } while (!myRegex(gender.toLowerCase(), GENDER));
                            c.setGender(gender);
                            customerRepository.edit(id, c);
                            System.out.println("Customer with id " + id + " is edited");
                            break;
                        case 4:
                            System.out.println("Customer new personal id (with 9 or 12 numbers)");
                            String personalId = "";
                            do {
                                personalId = scanner.nextLine();
                                if (!myRegex(personalId, PERSONAL_ID)) {
                                    System.out.println("Personal ID is an array with: 9 or 12 numbers");
                                }
                            } while (!myRegex(personalId, PERSONAL_ID));
                            c.setPersonalId(personalId);
                            customerRepository.edit(id, c);
                            System.out.println("Customer with id " + id + " is edited");
                            break;
                        case 5:
                            System.out.println("Customer new phone number (with 10 numbers)");
                            String phoneNumber = "";
                            do {
                                phoneNumber = scanner.nextLine();
                                if (!myRegex(phoneNumber, PHONE_NUMBER)) {
                                    System.out.println("Phone number need start with \"0\" and have 10 numbers");
                                }
                            } while (!myRegex(phoneNumber, PHONE_NUMBER));
                            c.setPhoneNumber(phoneNumber);
                            customerRepository.edit(id, c);
                            System.out.println("Customer with id " + id + " is edited");
                            break;
                        case 6:
                            System.out.println("Customer new email");
                            String email = "";
                            do {
                                email = scanner.nextLine();
                                if (!myRegex(email, EMAIL)) {
                                    System.out.println("Invalid Email");
                                }
                            } while (!myRegex(email, EMAIL));
                            c.setEmail(email);
                            customerRepository.edit(id, c);
                            System.out.println("Customer with id " + id + " is edited");
                            break;
                        case 7:
                            System.out.println("Customer new address");
                            String address = "";
                            do {
                                address = scanner.nextLine();
                                if (!myRegex(address, ADDRESS)) {
                                    System.out.println("Wrong address");
                                }
                            } while (!myRegex(address, ADDRESS));
                            c.setAddress(address);
                            customerRepository.edit(id, c);
                            System.out.println("Customer with id " + id + " is edited");
                            break;
                        case 8:
                            System.out.println("Customer new customer type");
                            String type = "";
                            do {
                                type = scanner.nextLine();
                                if (!myRegex(type.toLowerCase(), CUSTOMER_TYPE)) {
                                    System.out.println("Customer type must be: Diamond, Platinum, Gold, Silver or Member");
                                }
                            } while (!myRegex(type.toLowerCase(), CUSTOMER_TYPE));
                            c.setType(type);
                            customerRepository.edit(id, c);
                            System.out.println("Customer with id " + id + " is edited");
                            break;
                        case 9:
                            System.out.println("Customer new name");
                            String newName = "";
                            do {
                                newName = scanner.nextLine();
                                if (!myRegex(newName, NAME)) {
                                    System.out.println("Wrong syntax of name, try again bro");
                                }
                            } while (!myRegex(newName, NAME));

                            System.out.println("Customer new birthday (YYYY-MM-DD)");
                            LocalDate newBirthday = null;
                            do {
                                try {
                                    newBirthday = LocalDate.parse(scanner.nextLine());
                                } catch (DateTimeParseException e) {
                                    System.out.println("Wrong format of day");
                                } catch (DateTimeException e) {
                                    System.out.println("Wrong format of day");
                                }
                                if (!myLocalDateRegex.myDateRegex(newBirthday) || LocalDate.now().compareTo(newBirthday) < 18) {
                                    System.out.println("Syntax of birthday is: YYYY-MM-DD, or Customer must over 18 years old");
                                }
                            } while (!myLocalDateRegex.myDateRegex(newBirthday) || LocalDate.now().compareTo(newBirthday) < 18);

                            System.out.println("Customer new gender");
                            String newGender = "";
                            do {
                                newGender = scanner.nextLine();
                                if (!myRegex(newGender.toLowerCase(), GENDER)) {
                                    System.out.println("Gender only be \"Male\", \"Female\" or \"Else\"");
                                }
                            } while (!myRegex(newGender.toLowerCase(), GENDER));

                            System.out.println("Customer new personal id (with 9 or 12 numbers)");
                            String newPersonalId = "";
                            do {
                                newPersonalId = scanner.nextLine();
                                if (!myRegex(newPersonalId, PERSONAL_ID)) {
                                    System.out.println("Personal ID is an array with: 9 or 12 numbers");
                                }
                            } while (!myRegex(newPersonalId, PERSONAL_ID));

                            System.out.println("Customer new phone number (with 10 numbers)");
                            String newPhone = "";
                            do {
                                newPhone = scanner.nextLine();
                                if (!myRegex(newPhone, PHONE_NUMBER)) {
                                    System.out.println("Phone number need start with \"0\" and have 10 numbers");
                                }
                            } while (!myRegex(newPhone, PHONE_NUMBER));

                            System.out.println("Customer new email");
                            String newEmail = "";
                            do {
                                newEmail = scanner.nextLine();
                                if (!myRegex(newEmail, EMAIL)) {
                                    System.out.println("Invalid Email");
                                }
                            } while (!myRegex(newEmail, EMAIL));

                            System.out.println("New customer type");
                            String newType = "";
                            do {
                                newType = scanner.nextLine();
                                if (!myRegex(newType.toLowerCase(), CUSTOMER_TYPE)) {
                                    System.out.println("Customer type must be: Diamond, Platinum, Gold, Silver or Member");
                                }
                            } while (!myRegex(newType.toLowerCase(), CUSTOMER_TYPE));

                            System.out.println("Customer new address");
                            String newAddress = "";
                            do {
                                newAddress = scanner.nextLine();
                                if (!myRegex(newAddress, ADDRESS)) {
                                    System.out.println("Wrong address");
                                }
                            } while (!myRegex(newAddress, ADDRESS));

                            Customer customer = new Customer(newName, newBirthday, newGender,
                                    newPersonalId, newPhone, newEmail, id, newType, newAddress);
                            System.out.println("Customer with id " + id + " is added");
                            break;
                        case 0:
                            customerController.displayMainMenu();
                            break;
                    }
                }
                break;
            }
        } else {
            System.out.println("Cant find customer with ID " + id);
        }
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
        if (customerRepository.searchByName(name).size() > 0) {
            System.out.println(customerRepository.searchByName(name));
        } else {
            System.out.println("Cant find customer with name " + name);
        }
    }
}
