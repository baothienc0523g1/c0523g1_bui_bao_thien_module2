package z_recycle_bin;

import model.person.Customer;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class CustomerEdit {

//        System.out.println("Enter customer ID need to adjustment");
//    String id = "";
//        do {
//        id = scanner.nextLine();
//        if (!myRegex(id, CUSTOMER_ID)) {
//            System.out.println("ID must be KH-YYYY, with Y is a number hihi");
//        }
//    } while (!myRegex(id, CUSTOMER_ID));
//
//        if (idCheck(id)) {
//        for (Customer c : customerRepository.getList()) {
//            if (c.getId().equals(id)) {
//                System.out.println("Chose which data field need to edit");
//                System.out.println("1. Name and ID");
//                System.out.println("2. Birth day");
//                System.out.println("3. Gender");
//                System.out.println("4. Personal ID");
//                System.out.println("5. Phone number");
//                System.out.println("6. Email");
//                System.out.println("7. Address");
//                System.out.println("8. Customer type");
//                System.out.println("9. All");
//                System.out.println("0. Back to Customer main menu");
//                Integer editChoice = Integer.parseInt(scanner.nextLine());
//                switch (editChoice) {
//                    case 1:
//                        System.out.println("Customer new name");
//                        String name = "";
//                        do {
//                            name = scanner.nextLine();
//                            if (!myRegex(name, NAME)) {
//                                System.out.println("Wrong syntax of name, try again bro");
//                            }
//                        } while (!myRegex(name, NAME));
//
//                        String newID = "";
//                        do {
//                            newID = scanner.nextLine();
//                            if (!myRegex(newID, CUSTOMER_ID)) {
//                                System.out.println("ID must be KH-YYYY, with Y is a number");
//                            }
//                        } while (!myRegex(newID, CUSTOMER_ID));
//                        c.setName(name);
//                        c.setId(newID);
//                        customerRepository.edit(id, c);
//                        System.out.println("Customer with id " + id + " is edited");
//                        break;
//                    case 2:
//                        System.out.println("Customer new birthday");
//                        LocalDate birthDay = null;
//                        do {
//                            try {
//                                birthDay = LocalDate.parse(scanner.nextLine());
//                            } catch (DateTimeParseException e) {
//                                System.out.println("Wrong format of day");
//                            } catch (DateTimeException e) {
//                                System.out.println("Wrong format of day");
//                            }
//                            if (!myLocalDateRegex.myDateRegex(birthDay)) {
//                                System.out.println("Customer birthday must be like: YYYY-MM-DD");
//                            } else if (LocalDate.now().compareTo(birthDay) < 18) {
//                                System.out.println("Customer must be older than 18 years old");
//                            }
//                        } while (!myLocalDateRegex.myDateRegex(birthDay) || LocalDate.now().compareTo(birthDay) < 18);
//                        c.setBirthDay(birthDay);
//                        customerRepository.edit(id, c);
//                        System.out.println("Customer with id " + id + " is edited");
//                        break;
//                    case 3:
//                        System.out.println("Customer new gender");
//                        String gender = "";
//                        do {
//                            gender = scanner.nextLine();
//                            if (!myRegex(gender.toLowerCase(), GENDER)) {
//                                System.out.println("Gender only be \"Male\", \"Female\" or \"Else\"");
//                            }
//                        } while (!myRegex(gender.toLowerCase(), GENDER));
//                        c.setGender(gender);
//                        customerRepository.edit(id, c);
//                        System.out.println("Customer with id " + id + " is edited");
//                        break;
//                    case 4:
//                        System.out.println("Customer new personal id (with 9 or 12 numbers)");
//                        String personalId = "";
//                        do {
//                            personalId = scanner.nextLine();
//                            if (!myRegex(personalId, PERSONAL_ID)) {
//                                System.out.println("Personal ID is an array with: 9 or 12 numbers");
//                            }
//                        } while (!myRegex(personalId, PERSONAL_ID));
//                        c.setPersonalId(personalId);
//                        customerRepository.edit(id, c);
//                        System.out.println("Customer with id " + id + " is edited");
//                        break;
//                    case 5:
//                        System.out.println("Customer new phone number (with 10 numbers)");
//                        String phoneNumber = "";
//                        do {
//                            phoneNumber = scanner.nextLine();
//                            if (!myRegex(phoneNumber, PHONE_NUMBER)) {
//                                System.out.println("Phone number need start with \"0\" and have 10 numbers");
//                            }
//                        } while (!myRegex(phoneNumber, PHONE_NUMBER));
//                        c.setPhoneNumber(phoneNumber);
//                        customerRepository.edit(id, c);
//                        System.out.println("Customer with id " + id + " is edited");
//                        break;
//                    case 6:
//                        System.out.println("Customer new email");
//                        String email = "";
//                        do {
//                            email = scanner.nextLine();
//                            if (!myRegex(email, EMAIL)) {
//                                System.out.println("Invalid Email");
//                            }
//                        } while (!myRegex(email, EMAIL));
//                        c.setEmail(email);
//                        customerRepository.edit(id, c);
//                        System.out.println("Customer with id " + id + " is edited");
//                        break;
//                    case 7:
//                        System.out.println("Customer new address");
//                        String address = "";
//                        do {
//                            address = scanner.nextLine();
//                            if (!myRegex(address, ADDRESS)) {
//                                System.out.println("Wrong address");
//                            }
//                        } while (!myRegex(address, ADDRESS));
//                        c.setAddress(address);
//                        customerRepository.edit(id, c);
//                        System.out.println("Customer with id " + id + " is edited");
//                        break;
//                    case 8:
//                        System.out.println("Customer new customer type");
//                        String type = "";
//                        do {
//                            type = scanner.nextLine();
//                            if (!myRegex(type.toLowerCase(), CUSTOMER_TYPE)) {
//                                System.out.println("Customer type must be: Diamond, Platinum, Gold, Silver or Member");
//                            }
//                        } while (!myRegex(type.toLowerCase(), CUSTOMER_TYPE));
//                        c.setType(type);
//                        customerRepository.edit(id, c);
//                        System.out.println("Customer with id " + id + " is edited");
//                        break;
//                    case 9:
//                        System.out.println("Customer new name");
//                        String newName = "";
//                        do {
//                            newName = scanner.nextLine();
//                            if (!myRegex(newName, NAME)) {
//                                System.out.println("Wrong syntax of name, try again bro");
//                            }
//                        } while (!myRegex(newName, NAME));
//
//                        System.out.println("Customer new birthday (YYYY-MM-DD)");
//                        LocalDate newBirthday = null;
//                        do {
//                            try {
//                                newBirthday = LocalDate.parse(scanner.nextLine());
//                            } catch (DateTimeParseException e) {
//                                System.out.println("Wrong format of day");
//                            } catch (DateTimeException e) {
//                                System.out.println("Wrong format of day");
//                            }
//                            if (!myLocalDateRegex.myDateRegex(newBirthday) || LocalDate.now().compareTo(newBirthday) < 18) {
//                                System.out.println("Syntax of birthday is: YYYY-MM-DD, or Customer must over 18 years old");
//                            }
//                        } while (!myLocalDateRegex.myDateRegex(newBirthday) || LocalDate.now().compareTo(newBirthday) < 18);
//
//                        System.out.println("Customer new gender");
//                        String newGender = "";
//                        do {
//                            newGender = scanner.nextLine();
//                            if (!myRegex(newGender.toLowerCase(), GENDER)) {
//                                System.out.println("Gender only be \"Male\", \"Female\" or \"Else\"");
//                            }
//                        } while (!myRegex(newGender.toLowerCase(), GENDER));
//
//                        System.out.println("Customer new personal id (with 9 or 12 numbers)");
//                        String newPersonalId = "";
//                        do {
//                            newPersonalId = scanner.nextLine();
//                            if (!myRegex(newPersonalId, PERSONAL_ID)) {
//                                System.out.println("Personal ID is an array with: 9 or 12 numbers");
//                            }
//                        } while (!myRegex(newPersonalId, PERSONAL_ID));
//
//                        System.out.println("Customer new phone number (with 10 numbers)");
//                        String newPhone = "";
//                        do {
//                            newPhone = scanner.nextLine();
//                            if (!myRegex(newPhone, PHONE_NUMBER)) {
//                                System.out.println("Phone number need start with \"0\" and have 10 numbers");
//                            }
//                        } while (!myRegex(newPhone, PHONE_NUMBER));
//
//                        System.out.println("Customer new email");
//                        String newEmail = "";
//                        do {
//                            newEmail = scanner.nextLine();
//                            if (!myRegex(newEmail, EMAIL)) {
//                                System.out.println("Invalid Email");
//                            }
//                        } while (!myRegex(newEmail, EMAIL));
//
//                        System.out.println("New customer type");
//                        String newType = "";
//                        do {
//                            newType = scanner.nextLine();
//                            if (!myRegex(newType.toLowerCase(), CUSTOMER_TYPE)) {
//                                System.out.println("Customer type must be: Diamond, Platinum, Gold, Silver or Member");
//                            }
//                        } while (!myRegex(newType.toLowerCase(), CUSTOMER_TYPE));
//
//                        System.out.println("Customer new address");
//                        String newAddress = "";
//                        do {
//                            newAddress = scanner.nextLine();
//                            if (!myRegex(newAddress, ADDRESS)) {
//                                System.out.println("Wrong address");
//                            }
//                        } while (!myRegex(newAddress, ADDRESS));
//
//                        Customer customer = new Customer(newName, newBirthday, newGender,
//                                newPersonalId, newPhone, newEmail, id, newType, newAddress);
//                        System.out.println("Customer with id " + id + " is added");
//                        break;
//                    case 0:
//                        customerController.displayMainMenu();
//                        break;
//                }
//            }
//            break;
//        }
//    } else {
//        System.out.println("Cant find customer with ID " + id);
//    }

}
