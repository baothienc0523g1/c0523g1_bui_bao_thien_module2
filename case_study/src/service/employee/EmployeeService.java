package service.employee;

import controller.sub_controller.EmployeeController;
import model.person.Employee;

import repository.employee.EmployeeRepository;
import repository.employee.IEmployeeRepository;

import service.employee.sub.EmployeeAdd;
import service.employee.sub.EmployeeEdit;

import utilities.MyLocalDateRegex;
import utilities.MyRegex;

import java.util.List;
import java.util.Scanner;


public class EmployeeService extends MyRegex implements IEmployeeService {
    private IEmployeeRepository employeeRepository = new EmployeeRepository();
    private MyLocalDateRegex myLocalDateRegex = new MyLocalDateRegex();
    private EmployeeController employeeController = new EmployeeController();
    private Scanner scanner = new Scanner(System.in);

    protected boolean idCheck(String id) {
        boolean flag = true;
        for (int i = 0; i < employeeRepository.getList().size(); i++) {
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
        for (Employee e : employeeList) {
            System.out.println(e);
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
        if (employeeRepository.searchByName(name).size() > 0) {
            System.out.println(employeeRepository.searchByName(name));
        } else {
            System.out.println("Cant find employee with name " + name);
        }
    }
}
