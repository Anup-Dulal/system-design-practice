package prototype_desing_pattern;

import java.util.ArrayList;
import java.util.List;

public class DBConnection implements Cloneable {
    private String connectionString;
    private String username;
    private List<String> connectionPool = new ArrayList<>();

    public List<String> getConnectionPool() {
        return connectionPool;
    }
    public void setConnectionPool(List<String> connectionPool) {
        this.connectionPool = connectionPool;
    }
    public String getConnectionString() {
        return connectionString;
    }
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void loadConnection() throws InterruptedException {
        // Simulate loading connection (e.g., from a config file)
        this.connectionString = "jdbc:mysql://localhost:3306/mydb";
        this.connectionPool.add("conn1");
        this.connectionPool.add("conn2");
        this.connectionPool.add("conn3");

        Thread.sleep(5000); // Simulate time-consuming operation

    }
    @Override
    public String toString() {
        return "DBConnection{" +
                "connectionString='" + connectionString + '\'' +
                ", username='" + username + '\'' +
                ", connectionPool=" + connectionPool +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // implement deep copy logic
        DBConnection dbConnection = new DBConnection();
        dbConnection.setConnectionString(this.connectionString);
        dbConnection.setUsername(this.username);

        dbConnection.setConnectionPool(new ArrayList<>(this.connectionPool));
        return dbConnection;
    }


}

