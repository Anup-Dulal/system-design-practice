package abstract_design_pattern;

public class FrontEndFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new FrontEndDeveloper();
    }
    
}
