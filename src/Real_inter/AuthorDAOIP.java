package Real_inter;
import DAO.*;
import Author.Author;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DataSourse.DataSource;
public class AuthorDAOIP implements AuthorDAO{
    private DataSource dataSource;

    public List<Author> findAll() {
        List<Author> result = new ArrayList<Author>();
        Connection connection = null;
        try {
            DataSource dataSource=new DataSource();
            connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_FIND_ALL);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Author item = new Author();
                item.setFull_name(rs.getString(Author.FULL_NAME));
                item.setCountry(rs.getString(Author.COUNTRY));
                result.add(item);
            }
            connection.close();
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return result;
    }
    public List<Author> findAllA() {
        List<Author> result = new ArrayList<Author>();
        Connection connection = null;
        try {
            DataSource dataSource=new DataSource();
            connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_FIND_ALL1);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Author item = new Author();
                item.setFull_name(rs.getString(Author.FULL_NAME));
                item.setCountry(rs.getString(Author.COUNTRY));
                result.add(item);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void insert(Author item) {
        Connection connection=null;
        Savepoint savepointOne=null;
        try {
            DataSource dataSource =new DataSource();
            connection = dataSource.getConnection();
            connection.setAutoCommit(false);
            savepointOne = connection.setSavepoint("SavepointOne");
            PreparedStatement statement = connection.prepareStatement(SQL_INSERT);
            statement.setString(1, item.getFull_name());
            statement.setString(2, item.getCountry());
            statement.execute();
            connection.commit();
        }
        catch (Exception e) {
            try {
                System.out.println("Откат к точке savepointOne");
                connection.rollback(savepointOne);
            }
            catch (Exception ex)
            {

            }
            }
            finally {
            try {
                connection.close();
            }
            catch (Exception e)
            {

            }
        }
        }

}
