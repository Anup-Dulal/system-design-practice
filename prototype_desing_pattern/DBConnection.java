package prototype_desing_pattern;

public class DBConnection implements Cloneable {
    private String connectionString;
    private String username;
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

        Thread.sleep(5000); // Simulate time-consuming operation

    }
    @Override
    public String toString() {
        return "DBConnection{" +
                "connectionString='" + connectionString + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}

