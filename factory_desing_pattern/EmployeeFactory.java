package factory_desing_pattern;

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
