package DataSourse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    private String url="jdbc:sqlserver://localhost;databaseName=Library;integratedSecurity=true;";
    private String login="admin";
    private String password="1";

    public DataSource()
    {
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return url;
    }
    public String getLogin() {
        return login;
    }

    public String getPassword()
    {
        return password;
    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(getUrl(),getLogin(),getPassword());
    }

    public void closeConnection(Connection connection) {
        if (connection == null) return;
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
