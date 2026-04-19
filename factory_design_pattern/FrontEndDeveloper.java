package factory_design_pattern;

import factory_design_pattern.Employee;

public class FrontEndDeveloper implements Employee {

    public int getSalary() {
        System.out.println("Front End Developer Salary: 50000" );
        return 50000;
    }
    
}
