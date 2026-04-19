package abstract_design_pattern;

public class Client {
    public static void main(String[] args) {
        Employee frontEndDeveloper = EmployeeFactory.getEmployee(new FrontEndFactory());
        frontEndDeveloper.getSalary();
        frontEndDeveloper.getName();


        Employee backEndDeveloper = EmployeeFactory.getEmployee(new BackEndFactory());
        backEndDeveloper.getName();
        backEndDeveloper.getSalary();
    }
}
