package repository.employee;

import model.person.Employee;
import utilities.ReadAndWrite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
    private static final String EMPLOYEE_FILE_PATH = "D:\\GIT - Bai tap\\case_study\\src\\data\\employee.csv";
    private List<Employee> employeeList = listToEmployee();

    private List<Employee> listToEmployee() {
        List<Employee> employees = new ArrayList<>();
        List<String> strings = ReadAndWrite.myReadFromCSV(EMPLOYEE_FILE_PATH);
        String[] pointer = null;

        for (String s : strings) {
            pointer = s.split(",");
            Employee employee = new Employee(pointer[0], LocalDate.parse(pointer[1]),pointer[2],
                    pointer[3],pointer[4],pointer[5],pointer[6],pointer[7],
                    pointer[8],Double.parseDouble(pointer[9]));
            employees.add(employee);
        }
        return employees;
    }
    @Override
    public List<Employee> getList() {
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        List<String> temp = new ArrayList<>();
        temp.add(employee.getInfoToCSV());
        ReadAndWrite.myWriteToCSV(temp, EMPLOYEE_FILE_PATH, true);
    }

    @Override
    public void edit(String id, Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee e = employeeList.get(i);
            if (e.getId().equals(id)) {
                e.setId(employee.getId());
                e.setName(employee.getName());
                e.setBirthDay(employee.getBirthDay());
                e.setGender(employee.getGender());
                e.setPersonalId(employee.getPersonalId());
                e.setPhoneNumber(employee.getPhoneNumber());
                e.setEmail(employee.getEmail());
                e.setLevel(employee.getLevel());
                e.setPosition(employee.getPosition());
                e.setSalary(employee.getSalary());
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Employee e : employeeList) {
            stringList.add(e.getInfoToCSV());
        }
        ReadAndWrite.myWriteToCSV(stringList, EMPLOYEE_FILE_PATH,false);
    }

    @Override
    public void delete(String id) {
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                employeeList.remove(employee);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getInfoToCSV());
        }
        ReadAndWrite.myWriteToCSV(stringList, EMPLOYEE_FILE_PATH,false);
    }

    @Override
    public List<Employee> searchByName(String name) {
        List<Employee> employees = new ArrayList<>();
        for (Employee e : employeeList) {
            String temp = e.getName().toLowerCase();
            if (temp.contains(name.toLowerCase())) {
                employees.add(e);
            }
        }
        return employees;
    }
}