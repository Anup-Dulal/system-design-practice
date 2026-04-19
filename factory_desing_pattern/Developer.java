package factory_desing_pattern;

public class Developer {
    public static void main(String[] args) {
        Employee emp1 = EmployeeFactory.getEmployee("FrontEndDeveloper");
        emp1.getSalary();
        
        Employee emp2 = EmployeeFactory.getEmployee("BackEndDeveloper");
        emp2.getSalary();
    }
}
