package service.employee_service;

import model.person.employee.Employee;
import repository.employee_repository.EmployeeRepositoryImpl;
import repository.employee_repository.IEmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private static IEmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    @Override
    public void displayList() {
        employeeRepository.displayList();
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
        int salary;
        do {
            System.out.println("Nhập lương:");
            try {
                salary = Integer.parseInt(scanner.nextLine());
                if (salary <= 0) {
                    throw new RuntimeException("Lương phải lớn hơn 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên.");
            } catch (RuntimeException e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        } while (true);
        Employee employee = new Employee(name, dob, gender, idenNum, phoneNumber, email, id, eduLevel, position, salary);
        employeeRepository.addNew(employee);
    }

    @Override
    public void edit() {
        System.out.println("Nhập ID");
        String id = scanner.nextLine();
        System.out.println("Nhập tên nhân viên");
        String newName = scanner.nextLine();
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
        Employee employee = new Employee(newName, newDob, newGender, newIdenNum, newPhoneNumber, newEmail, id, newEduLevel, newPosition, newSalary);
        employeeRepository.edit(employee);
    }

    @Override
    public void delete() {
        System.out.println("Nhập ID nhân viên");
        int id = Integer.parseInt(scanner.nextLine());
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
