package prototype_desing_pattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Creating object...");

        DBConnection dbConnection1 = new DBConnection();
        dbConnection1.setUsername("admin");
        dbConnection1.loadConnection();


        try{
            DBConnection dbConnection2 = (DBConnection) dbConnection1.clone();
            DBConnection dbConnection3 = (DBConnection) dbConnection1.clone();

            dbConnection1.getConnectionPool().remove(0); // modify original's connection pool
            System.out.println(dbConnection1);
            System.out.println(dbConnection2);
            System.out.println(dbConnection3);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
