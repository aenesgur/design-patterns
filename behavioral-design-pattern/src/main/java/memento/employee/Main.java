package memento.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Joe", "HR L1");
        EmployeeHistory employeeHistory = new EmployeeHistory();

        employee.setDepartment("HR L2");
        employeeHistory.add(employee.save());
        employee.printEmployeeInfo();

        employee.setDepartment("HR L3");
        employeeHistory.add(employee.save());
        employee.printEmployeeInfo();

        employee.setDepartment("HR L4");
        employeeHistory.add(employee.save());
        employee.printEmployeeInfo();
        employee.restore(employeeHistory.get(1));
        employee.printEmployeeInfo();
    }
}
