package repository.employee_repository;

import model.person.employee.Employee;
import utils.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private final String FILE_PATH = "D:\\CodeGym\\Git\\C0523G1-duydd-co523g1_Module2\\FuramaResort\\src\\data\\Employee.csv";
    Scanner scanner =new Scanner(System.in);
    @Override

    public List<Employee> searchByName(String name) {
        ArrayList<Employee> employeeList = this.displayList();
        List<Employee> employeeSearchList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(employeeList.get(i).getName(), name)) {
                employeeSearchList.add(employeeList.get(i));
            } else {
                System.out.println("Nhân viên không tồn tại");
            }
        }
        return employeeSearchList;
    }

    @Override
    public ArrayList<Employee> displayList() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        List<String> stringList = Stream.read(FILE_PATH);
        String[] array = null;
        for (String s : stringList) {
            array = s.split(",");
            Employee employee = new Employee(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8], Integer.parseInt(array[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void addNew(Employee employee) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        employeeList.add(employee);
        for (int i = 0; i < employeeList.size(); i++) {
            stringList.add(employeeList.get(i).getInfoToCSV());
        }
        Stream.write(FILE_PATH, stringList, true);
    }

    @Override
    public void edit(Employee employee) {
    }

    @Override
    public void edit(String id) {
        ArrayList<Employee> employeeList = this.displayList();
        ArrayList<String> stringList = new ArrayList<>();
        for (Employee e : employeeList) {
            if (e.getEmployeeID().equals(id)) {
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
                e.setName(newName);
                e.setEmployeeID(newID);
                e.setDob(newDob);
                e.setGender(newGender);
                e.setIdentificationNumber(newIdenNum);
                e.setPhoneNumber(newPhoneNumber);
                e.setEmail(newEmail);
                e.setEducationLevel(newEduLevel);
                e.setJobPosition(newPosition);
                e.setSalary(newSalary);
            }
            stringList.add(e.getInfoToCSV());
        }
        Stream.write(FILE_PATH, stringList, false);
    }

    @Override
    public void delete(int id) {
        ArrayList<Employee> employeeList = this.displayList();
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (Integer.parseInt(employeeList.get(i).getEmployeeID()) == id) {
                employeeList.remove(employeeList.get(i));
            } else {
                System.out.println("ID không tồn tại");
                break;
            }
            stringList.add(employeeList.get(i).getInfoToCSV());
        }
        Stream.write(FILE_PATH, stringList, false);
        displayList();
    }

    @Override
    public void delete(String id) {

    }
}
