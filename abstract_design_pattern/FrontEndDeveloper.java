package abstract_design_pattern;

public class FrontEndDeveloper implements Employee {

    public int getSalary() {
        System.out.println("Front End Developer Salary: 50000" );
        return 50000;
    }

    public String getName() {
        return "Front End Developer";
    }   

}
