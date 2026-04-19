package abstract_design_pattern;

public class BackEndFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new BackEndDeveloper();
    }

}
