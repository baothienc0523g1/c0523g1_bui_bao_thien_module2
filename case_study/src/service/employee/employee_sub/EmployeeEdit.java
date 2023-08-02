package service.employee.employee_sub;

import controller.controller_sub.EmployeeController;
import model.person.Employee;
import repository.employee.EmployeeRepository;
import repository.employee.IEmployeeRepository;
import service.employee.EmployeeService;
import utilities.MyLocalDateRegex;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EmployeeEdit extends EmployeeService {
    private IEmployeeRepository employeeRepository = new EmployeeRepository();
    private MyLocalDateRegex myLocalDateRegex = new MyLocalDateRegex();
    private EmployeeController employeeController = new EmployeeController();
    private Scanner scanner = new Scanner(System.in);
    public void editWithCase() {
        System.out.println("Enter employee ID need to adjustment");

        String id = "";
        do {
            id = scanner.nextLine();
            if (!myRegex(id, EMPLOY_ID)) {
                System.out.println("ID must be NV-YYYY, with Y is a number");
            }
        } while (!myRegex(id, EMPLOY_ID));

        if (!idCheck(id)) {
            for (Employee employee : employeeRepository.getList()) {
                if (employee.getId().equals(id)) {
                    do {
                        System.out.println("With filed you'd like to change");
                        System.out.println("1. Employee name");
                        System.out.println("2. Salary");
                        System.out.println("3. Birthday");
                        System.out.println("4. Gender");
                        System.out.println("5. Personal ID");
                        System.out.println("6. Email");
                        System.out.println("7. Phone number");
                        System.out.println("8. Employee level & position");
                        System.out.println("9. All");
                        System.out.println("0 .Return to Employee menu");
                        Integer editChoice = Integer.parseInt(scanner.nextLine());
                        switch (editChoice) {
                            case 1:
                                System.out.println("New employee name");
                                String name = "";
                                do {
                                    name = scanner.nextLine();
                                    if (!myRegex(name, NAME)) {
                                        System.out.println("Wrong syntax of name, try again bro");
                                    }
                                } while (!myRegex(name, NAME));
                                employee.setName(name);
                                employeeRepository.edit(id, employee);
                                System.out.println("Employee with ID " + id + " is edited");
                                break;
                            case 2:
                                System.out.println("Employee new salary");
                                Double salary;
                                do {
                                    salary = Double.parseDouble(scanner.nextLine());
                                    if (salary <= 0) {
                                        System.out.println("Salary cant be smaller than 0");
                                    }
                                } while (salary <= 0);
                                employee.setSalary(salary);
                                employeeRepository.edit(id, employee);
                                System.out.println("Employee with ID " + id + " is edited");
                                break;
                            case 3:
                                System.out.println("Employee new birthday (YYYY-MM-DD)");
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
                                        System.out.println("Syntax of birthday is: YYYY-MM-DD");
                                    }
                                } while (!myLocalDateRegex.myDateRegex(birthDay) || LocalDate.now().compareTo(birthDay) < 18);
                                employee.setBirthDay(birthDay);
                                employeeRepository.edit(id, employee);
                                System.out.println("Employee with ID " + id + " is edited");
                                break;
                            case 4:
                                System.out.println("Employee new gender");
                                String gender = "";
                                do {
                                    gender = scanner.nextLine();
                                    if (!myRegex(gender.toLowerCase(), GENDER)) {
                                        System.out.println("Gender only be \"Male\", \"Female\" or \"Else\"");
                                    }
                                } while (!myRegex(gender.toLowerCase(), GENDER));
                                employee.setGender(gender);
                                employeeRepository.edit(id, employee);
                                System.out.println("Employee with ID " + id + " is edited");
                                break;
                            case 5:
                                System.out.println("Employee new personal id (with 9 or 12 numbers)");
                                String personalId = "";
                                do {
                                    personalId = scanner.nextLine();
                                    if (!myRegex(personalId, PERSONAL_ID)) {
                                        System.out.println("Personal ID is an array with: 9 or 12 numbers");
                                    }
                                } while (!myRegex(personalId, PERSONAL_ID));
                                employee.setPersonalId(personalId);
                                employeeRepository.edit(id, employee);
                                System.out.println("Employee with ID " + id + " is edited");
                                break;
                            case 6:
                                System.out.println("Employee new email");
                                String email = "";
                                do {
                                    email = scanner.nextLine();
                                    if (!myRegex(email, EMAIL)) {
                                        System.out.println("Invalid Email");
                                    }
                                } while (!myRegex(email, EMAIL));
                                employee.setEmail(email);
                                employeeRepository.edit(id, employee);
                                System.out.println("Employee with ID " + id + " is edited");
                                break;
                            case 7:
                                System.out.println("Employee new phone number (with 10 numbers");
                                String phoneNumber = "";
                                do {
                                    phoneNumber = scanner.nextLine();
                                    if (!myRegex(phoneNumber, PHONE_NUMBER)) {
                                        System.out.println("Phone number need start with \"0\" and have 10 numbers");
                                    }
                                } while (!myRegex(phoneNumber, PHONE_NUMBER));
                                employee.setPhoneNumber(phoneNumber);
                                employeeRepository.edit(id, employee);
                                System.out.println("Employee with ID " + id + " is edited");
                                break;
                            case 8:
                                System.out.println("New employee level: Intermediate, Degree, College or Graduate");
                                String level = "";
                                do {
                                    level = scanner.nextLine();
                                    if (!myRegex(level.toLowerCase(), EMPLOY_LEVEL)) {
                                        System.out.println("Level only can be: Intermediate, Degree, College or Graduate");
                                    }
                                } while (!myRegex(level.toLowerCase(), EMPLOY_LEVEL));

                                System.out.println("New employee position");
                                String position = scanner.nextLine();
                                employee.setLevel(level);
                                employee.setPosition(position);
                                employeeRepository.edit(id, employee);
                                System.out.println("Employee with ID " + id + " is edited");
                                break;
                            case 9:
                                editAll(id);
                            case 0:
                                employeeController.displayMainMenu();
                                break;
                            default:
                                System.out.println("Invalid value");
                                break;
                        }
                    } while (true);
                }
            }
        } else {
            System.out.println("Cant find employee with id " + id);
        }
    }
    public void editAll(String id) {
        for (Employee employee : employeeRepository.getList()) {
            if (employee.getId().equals(id)) {
                System.out.println("Employee new name");
                String newName = "";
                do {
                    newName = scanner.nextLine();
                    if (!myRegex(newName, NAME)) {
                        System.out.println("Wrong syntax of name, try again bro");
                    }
                } while (!myRegex(newName, NAME));

                System.out.println("Employee new birthday (YYYY-MM-DD)");
                LocalDate newBirthDay = null;
                do {
                    try {
                        newBirthDay = LocalDate.parse(scanner.nextLine());
                    } catch (DateTimeParseException e) {
                        System.out.println("Wrong format of day");
                    } catch (DateTimeException e) {
                        System.out.println("Wrong format of day");
                    }
                    if (!myLocalDateRegex.myDateRegex(newBirthDay) || LocalDate.now().compareTo(newBirthDay) < 18) {
                        System.out.println("Syntax of birthday is: YYYY-MM-DD");
                    }
                } while (!myLocalDateRegex.myDateRegex(newBirthDay) || LocalDate.now().compareTo(newBirthDay) < 18);

                System.out.println("Employee new gender");
                String newGender = "";
                do {
                    newGender = scanner.nextLine();
                    if (!myRegex(newGender.toLowerCase(), GENDER)) {
                        System.out.println("Gender only be \"Male\", \"Female\" or \"Else\"");
                    }
                } while (!myRegex(newGender.toLowerCase(), GENDER));

                System.out.println("Employee new personal id (with 9 or 12 numbers)");
                String newPersonalID = "";
                do {
                    newPersonalID = scanner.nextLine();
                    if (!myRegex(newPersonalID, PERSONAL_ID)) {
                        System.out.println("Personal ID is an array with: 9 or 12 numbers");
                    }
                } while (!myRegex(newPersonalID, PERSONAL_ID));

                System.out.println("New employee phone number (with 10 numbers)");
                String newPhoneNumber = "";
                do {
                    newPhoneNumber = scanner.nextLine();
                    if (!myRegex(newPhoneNumber, PHONE_NUMBER)) {
                        System.out.println("Phone number need start with \"0\" and have 10 numbers");
                    }
                } while (!myRegex(newPhoneNumber, PHONE_NUMBER));

                System.out.println("Employee new email");
                String newEmail = "";
                do {
                    newEmail = scanner.nextLine();
                    if (!myRegex(newEmail, EMAIL)) {
                        System.out.println("Invalid Email");
                    }
                } while (!myRegex(newEmail, EMAIL));

                System.out.println("Employee new level (Intermediate, Degree, College or Graduate)");
                String newLevel = "";
                do {
                    newLevel = scanner.nextLine();
                    if (!myRegex(newLevel.toLowerCase(), EMPLOY_LEVEL)) {
                        System.out.println("Level only can be: Intermediate, Degree, College or Graduate");
                    }
                } while (!myRegex(newLevel.toLowerCase(), EMPLOY_LEVEL));

                System.out.println("Employee new position");
                String newPos = scanner.nextLine();

                System.out.println("New employee salary");
                Double newSalary;
                do {
                    newSalary = Double.parseDouble(scanner.nextLine());
                    if (newSalary <= 0) {
                        System.out.println("Salary cant be smaller than 0");
                    }
                } while (newSalary <= 0);
                employee.setId(id);
                employee.setName(newName);
                employee.setBirthDay(newBirthDay);
                employee.setGender(newGender);
                employee.setPersonalId(newPersonalID);
                employee.setPhoneNumber(newPhoneNumber);
                employee.setEmail(newEmail);
                employee.setLevel(newLevel);
                employee.setPosition(newPos);
                employee.setSalary(newSalary);
                employeeRepository.edit(id, employee);
                System.out.println("Employee with id " + id + " is edited");
            }
            break;
        }
    }
}
