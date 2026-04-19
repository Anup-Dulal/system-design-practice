package abstract_design_pattern;

public class BackEndDeveloper implements Employee {

    @Override
    public int getSalary() {
        System.out.println("Back End Developer Salary: 60000" );
        return 60000;
    }

    @Override
    public String getName() {
        System.out.println("Back End Developer Name: John Doe");
        return "John Doe";
    }

}
