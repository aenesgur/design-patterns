package memento.employee;

public class Employee {
    private String name;
    private String department;

    public Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void printEmployeeInfo(){
        System.out.println(this.name.concat(" = ".concat(this.department)));
    }

    public EmployeeMemento save(){
        return new EmployeeMemento(this.department);
    }

    public void restore(EmployeeMemento employeeMemento){
        this.department = employeeMemento.getDepartment();
    }
}
