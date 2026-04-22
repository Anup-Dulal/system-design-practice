package prototype_desing_pattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Creating object...");

        DBConnection dbConnection1 = new DBConnection();
        dbConnection1.setUsername("admin");
        dbConnection1.loadConnection();
        System.out.println(dbConnection1);

        try{
            DBConnection dbConnection2 = (DBConnection) dbConnection1.clone();
           System.out.println(dbConnection2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
