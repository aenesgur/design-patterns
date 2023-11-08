package memento.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeHistory {

    private List<EmployeeMemento> employeeMementoList = new ArrayList<>();

    public void add(EmployeeMemento employeeMemento){
        employeeMementoList.add(employeeMemento);
    }

    public EmployeeMemento get(int index){
        return employeeMementoList.get(index);
    }
}
