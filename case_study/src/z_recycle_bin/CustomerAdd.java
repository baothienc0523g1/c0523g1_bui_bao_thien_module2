package z_recycle_bin;

public class CustomerAdd {

//        System.out.println("Enter customer ID");
//        String id = "";
//        do {
//            id = scanner.nextLine();
//            if (!myRegex(id, CUSTOMER_ID)) {
//                System.out.println("ID must be KH-YYYY, with Y is a number");
//            }
//        } while (!myRegex(id, CUSTOMER_ID));
//
//        if (idCheck(id)) {
//            do {
//                System.out.println("New customer name");
//                String name = "";
//                do {
//                    name = scanner.nextLine();
//                    if (!myRegex(name, NAME)) {
//                        System.out.println("Wrong syntax of name, try again bro");
//                    }
//                } while (!myRegex(name, NAME));
//
//                System.out.println("New customer birthday (YYYY-MM-DD)");
//                LocalDate birthDay = null;
//                do {
//                    try {
//                        birthDay = LocalDate.parse(scanner.nextLine());
//                    } catch (DateTimeParseException e) {
//                        System.out.println("Wrong format of day");
//                    } catch (DateTimeException e) {
//                        System.out.println("Wrong format of day");
//                    }
//                    if (!myLocalDateRegex.myDateRegex(birthDay) || LocalDate.now().compareTo(birthDay) < 18) {
//                        System.out.println("Syntax of birthday is: YYYY-MM-DD, or Customer must over 18 years old");
//                    }
//                } while (!myLocalDateRegex.myDateRegex(birthDay) || LocalDate.now().compareTo(birthDay) < 18);
//
//                System.out.println("New customer gender");
//                String gender = "";
//                do {
//                    gender = scanner.nextLine();
//                    if (!myRegex(gender.toLowerCase(), GENDER)) {
//                        System.out.println("Gender only be \"Male\", \"Female\" or \"Else\"");
//                    }
//                } while (!myRegex(gender.toLowerCase(), GENDER));
//
//                System.out.println("New customer personal id (with 9 or 12 numbers)");
//                String personalId = "";
//                do {
//                    personalId = scanner.nextLine();
//                    if (!myRegex(personalId, PERSONAL_ID)) {
//                        System.out.println("Personal ID is an array with: 9 or 12 numbers");
//                    }
//                } while (!myRegex(personalId, PERSONAL_ID));
//
//                System.out.println("New customer phone number (with 10 numbers)");
//                String phoneNumber = "";
//                do {
//                    phoneNumber = scanner.nextLine();
//                    if (!myRegex(phoneNumber, PHONE_NUMBER)) {
//                        System.out.println("Phone number need start with \"0\" and have 10 numbers");
//                    }
//                } while (!myRegex(phoneNumber, PHONE_NUMBER));
//
//                System.out.println("New customer email");
//                String email = "";
//                do {
//                    email = scanner.nextLine();
//                    if (!myRegex(email, EMAIL)) {
//                        System.out.println("Invalid Email");
//                    }
//                } while (!myRegex(email, EMAIL));
//
//                System.out.println("New customer type");
//                String type = "";
//                do {
//                    type = scanner.nextLine();
//                    if (!myRegex(type.toLowerCase(), CUSTOMER_TYPE)) {
//                        System.out.println("Customer type must be: Diamond, Platinum, Gold, Silver or Member");
//                    }
//                } while (!myRegex(type.toLowerCase(), CUSTOMER_TYPE));
//
//                System.out.println("New customer address");
//                String address = "";
//                do {
//                    address = scanner.nextLine();
//                    if (!myRegex(address, ADDRESS)) {
//                        System.out.println("Wrong address");
//                    }
//                } while (!myRegex(address, ADDRESS));
//
//                Customer customer = new Customer(name, birthDay, gender,
//                        personalId, phoneNumber, email, id, type, address);
//                System.out.println("Customer with id " + id + " is added");
//                break;
//            } while (true);
//        } else {
//            System.out.println("ID already exist");
//        }
}
