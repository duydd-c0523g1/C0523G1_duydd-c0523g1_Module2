package service.employee;

import model.person.employee.Employee;
import repository.employee.EmployeeRepositoryImpl;
import repository.employee.IEmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private static IEmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    @Override
    public void displayList() {
        List<Employee> employeeList = employeeRepository.displayList();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh (DD/MM/YYY)");
        String dob = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập số CCCD");
        String idenNum = scanner.nextLine();
        System.out.println("Nhập số điện thoại");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập Email");
        String email = scanner.nextLine();
        System.out.println("Nhập ID");
        String id = scanner.nextLine();
        System.out.println("Nhập trình độ học vấn");
        String eduLevel = scanner.nextLine();
        System.out.println("Nhập chức vụ");
        String position = scanner.nextLine();
        System.out.println("Nhập lương");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(name, dob, gender, idenNum, phoneNumber, email, id, eduLevel, position, salary);
        employeeRepository.addNew(employee);
    }

    @Override
    public void edit() {
        System.out.println("Nhập ID");
        String id = scanner.nextLine();
        System.out.println("Nhập tên nhân viên");
        String newName = scanner.nextLine();
        System.out.println("Nhập ID nhân viên");
        String newID = scanner.nextLine();
        System.out.println("Nhập ngày sinh (DD/MM/YYY)");
        String newDob = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String newGender = scanner.nextLine();
        System.out.println("Nhập số CCCD");
        String newIdenNum = scanner.nextLine();
        System.out.println("Nhập số điện thoại");
        String newPhoneNumber = scanner.nextLine();
        System.out.println("Nhập Email");
        String newEmail = scanner.nextLine();
        System.out.println("Nhập trình độ học vấn");
        String newEduLevel = scanner.nextLine();
        System.out.println("Nhập chức vụ");
        String newPosition = scanner.nextLine();
        System.out.println("Nhập lương");
        int newSalary = Integer.parseInt(scanner.nextLine());
        Employee employeeEdit = new Employee(newName, newID, newDob, newGender, newIdenNum, newPhoneNumber, newEmail,
                newEduLevel, newPosition, newSalary);
        employeeRepository.edit(id, employeeEdit);
    }

    @Override
    public void delete() {
        System.out.println("Nhập ID nhân viên");
        String id = scanner.nextLine();
        employeeRepository.delete(id);
    }

    @Override
    public void searchByName() {
        System.out.println("Nhập tên nhân viên cần tìm kiếm");
        String name = scanner.nextLine();
        List<Employee> employeeList = employeeRepository.searchByName(name);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
