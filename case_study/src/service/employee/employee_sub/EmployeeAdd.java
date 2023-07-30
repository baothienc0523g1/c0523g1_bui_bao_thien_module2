package service.employee.employee_sub;

import model.person.Employee;
import repository.employee.EmployeeRepository;
import repository.employee.IEmployeeRepository;
import service.employee.EmployeeService;
import utilities.MyLocalDateRegex;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class EmployeeAdd extends EmployeeService {
    private Scanner scanner = new Scanner(System.in);
    private MyLocalDateRegex myLocalDateRegex = new MyLocalDateRegex();
    private IEmployeeRepository employeeRepository = new EmployeeRepository();

    public void add() {
        System.out.println("Enter new employee ID");

        String id = "";
        do {
            id = scanner.nextLine();
            if (!myRegex(id, EMPLOY_ID)) {
                System.out.println("ID must be NV-YYYY, with Y is a number");
            }
        } while (!myRegex(id, EMPLOY_ID));

        if (idCheck(id)) {
            do {
                System.out.println("New employee name");
                String name = "";
                do {
                    name = scanner.nextLine();
                    if (!myRegex(name, NAME)) {
                        System.out.println("Wrong syntax of name. Name with 2 words and first letter of each word is in upper case");
                    }
                } while (!myRegex(name, NAME));

                System.out.println("New employee birthday (YYYY-MM-DD)");
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
                        System.out.println("Syntax of birthday is: YYYY-MM-DD, or Employee must over 18 years old");
                    }
                } while (!myLocalDateRegex.myDateRegex(birthDay) || LocalDate.now().compareTo(birthDay) < 18);

                System.out.println("New employee gender");
                String gender = "";
                do {
                    gender = scanner.nextLine();
                    if (!myRegex(gender.toLowerCase(), GENDER)) {
                        System.out.println("Gender only be \"Male\", \"Female\" or \"Else\"");
                    }
                } while (!myRegex(gender.toLowerCase(), GENDER));

                System.out.println("New employee personal id (with 9 or 12 numbers)");
                String personalId = "";
                do {
                    personalId = scanner.nextLine();
                    if (!myRegex(personalId, PERSONAL_ID)) {
                        System.out.println("Personal ID is an array with: 9 or 12 numbers");
                    }
                } while (!myRegex(personalId, PERSONAL_ID));

                System.out.println("New employee phone number (with 10 numbers)");
                String phoneNumber = "";
                do {
                    phoneNumber = scanner.nextLine();
                    if (!myRegex(phoneNumber, PHONE_NUMBER)) {
                        System.out.println("Phone number need start with \"0\" and have 10 numbers");
                    }
                } while (!myRegex(phoneNumber, PHONE_NUMBER));

                System.out.println("New employee email");
                String email = "";
                do {
                    email = scanner.nextLine();
                    if (!myRegex(email, EMAIL)) {
                        System.out.println("Invalid Email");
                    }
                } while (!myRegex(email, EMAIL));

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

                System.out.println("New employee salary");
                Double salary;
                do {
                    salary = Double.parseDouble(scanner.nextLine());
                    if (salary <= 0) {
                        System.out.println("Salary cant be smaller than 0");
                    }
                } while (salary <= 0);

                Employee employee = new Employee(name, birthDay, gender, personalId,
                        phoneNumber, email, id, level, position, salary);
                employeeRepository.add(employee);
                System.out.println("Employee with id " + id + " is added");
                break;
            } while (true);
        } else {
            System.out.println("Employee ID already exist");
        }
    }

}


