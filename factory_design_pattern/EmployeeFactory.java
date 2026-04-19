package factory_design_pattern;

import factory_design_pattern.Employee;

import factory_design_pattern.BackEndDeveloper;

public class EmployeeFactory {

    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("FrontEndDeveloper")){
            return new FrontEndDeveloper();
        } else if(empType.trim().equalsIgnoreCase("BackEndDeveloper")){
            return new BackEndDeveloper();
        }
        return null;
    }
    
}
