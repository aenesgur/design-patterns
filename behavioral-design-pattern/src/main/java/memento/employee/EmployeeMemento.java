package memento.employee;

public class EmployeeMemento {
    private String department;

    public EmployeeMemento(String department){
        this.department = department;
    }

    public String getDepartment(){
        return this.department;
    }
}
