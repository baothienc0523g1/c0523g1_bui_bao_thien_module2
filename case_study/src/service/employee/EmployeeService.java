package service.employee;

import controller.controller_sub.EmployeeController;
import model.person.Employee;

import repository.employee.EmployeeRepository;
import repository.employee.IEmployeeRepository;

import service.employee.employee_sub.EmployeeAdd;
import service.employee.employee_sub.EmployeeEdit;

import utilities.MyLocalDateRegex;
import utilities.MyRegex;

import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class EmployeeService extends MyRegex implements IEmployeeService {
    private IEmployeeRepository employeeRepository = new EmployeeRepository();
    private MyLocalDateRegex myLocalDateRegex = new MyLocalDateRegex();
    private EmployeeController employeeController = new EmployeeController();
    private Scanner scanner = new Scanner(System.in);

    public boolean idCheck(String id) {
        boolean flag = true;
        List<Employee> temp = employeeRepository.getList();

        for (int i = 0; i < temp.size(); i++) {
            Employee e = employeeRepository.getList().get(i);
            if (e.getId().equals(id)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    @Override
    public void getList() {
        List<Employee> employeeList = employeeRepository.getList();
        if (employeeList.size() == 0) {
            System.out.println("Nothing to show");
        } else {
            for (Employee e : employeeList) {
                System.out.println(e);
                System.out.println("");
            }
        }
    }

    @Override
    public void add() {
        EmployeeAdd employeeAdd = new EmployeeAdd();
        employeeAdd.add();
    }

    @Override
    public void edit() {
        EmployeeEdit employeeEdit = new EmployeeEdit();
        employeeEdit.editWithCase();
    }

    @Override
    public void delete() {
        System.out.println("Enter employee ID need to remove");
        String id = scanner.nextLine();
        if (!idCheck(id)) {
            employeeRepository.delete(id);
            System.out.println("Employee with id " + id + " is removed");
        } else {
            System.out.println("Invalid ID");
        }
    }

    public void searchByName() {
        System.out.println("Enter employee's name");
        String name = scanner.nextLine();
        if (employeeRepository.search(name).size() > 0) {
            System.out.println(employeeRepository.search(name));
        } else {
            System.out.println("Cant find employee with name " + name);
        }
    }

    public void getIdAndName() {
        Map<String, String> idAndName = employeeRepository.getIdAndName();
        System.out.println("Chose Employee service ID down below: ");
        for (String string : idAndName.keySet()) {
            System.out.println(string + " | " + idAndName.get(string));
        }
    }
}
