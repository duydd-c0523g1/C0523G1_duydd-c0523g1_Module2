package repository.employee;

import model.facility.Facility;
import model.person.employee.Employee;
import utils.Stream;

import java.util.*;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private final String FILE_PATH = "D:\\CodeGym\\Git\\C0523G1-duydd-co523g1_Module2\\FuramaResort\\src\\data\\employee.csv";
    Scanner scanner =new Scanner(System.in);
    @Override
    public List<Employee> searchByName(String name) {
        ArrayList<Employee> employeeList = this.displayList();
        List<Employee> employeeSearchList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(employeeList.get(i).getName(), name)) {
                employeeSearchList.add(employeeList.get(i));
            }
        }
        return employeeSearchList;
    }

    @Override
    public Map<Facility, Integer> displayList() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        List<String> stringList = Stream.read(FILE_PATH);
        String[] array = null;
        for (String s : stringList) {
            array = s.split(",");
            Employee employee = new Employee(array[0], array[1], array[2], array[3], array[4],
                    array[5], array[6], array[7], array[8], Integer.parseInt(array[9]));
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
    public void edit(String id,Employee employeeEdit) {
        ArrayList<Employee> employeeList = (ArrayList<Employee>) this.displayList();
        ArrayList<String> stringList = new ArrayList<>();
        for (Employee e : employeeList) {
            if (e.getEmployeeID().equals(id)) {
                e.setName(employeeEdit.getName());
                e.setEmployeeID(employeeEdit.getEmployeeID());
                e.setDob(employeeEdit.getDob());
                e.setGender(employeeEdit.getGender());
                e.setIdentificationNumber(employeeEdit.getIdentificationNumber());
                e.setPhoneNumber(employeeEdit.getPhoneNumber());
                e.setEmail(employeeEdit.getEmail());
                e.setEducationLevel(employeeEdit.getEducationLevel());
                e.setJobPosition(employeeEdit.getJobPosition());
                e.setSalary(employeeEdit.getSalary());
            }
            stringList.add(e.getInfoToCSV());
        }
        Stream.write(FILE_PATH, stringList, false);
    }

    @Override
    public void delete(String id) {
        ArrayList<Employee> employeeList = (ArrayList<Employee>) this.displayList();
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeID().equals(id)) {
                employeeList.remove(i);
                break;
            }
        }
        for (Employee employee: employeeList) {
            stringList.add(employee.getInfoToCSV());
        }
        Stream.write(FILE_PATH, stringList, false);
        displayList();
    }
}
