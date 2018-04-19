package Real_inter;

import DAO.BooksDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DataSourse.DataSource;
import Books.Books;


public class BooksDAOIP  implements BooksDAO{
    public List<Books> findAll() {
        List<Books> result = new ArrayList<Books>();
        Connection connection = null;
        try {
            DataSource dataSource=new DataSource();
            connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_FIND_ALL);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Books item = new Books();
                item.setName(rs.getString(Books.NAME));
                item.setAuthor_name(rs.getString(Books.AUTHOR_NAME));
                item.setRelease_year(rs.getString(Books.RELEASE_YEAR));
                item.setPublishing_house(rs.getString(Books.PUBLISHING_HOUSE));
                result.add(item);
            }
        }  catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    public List<Books> findAll1() {
        List<Books> result = new ArrayList<Books>();
        Connection connection = null;
        try {
            DataSource dataSource=new DataSource();
            connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_FIND_ALL1);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Books item = new Books();
                item.setName(rs.getString(Books.NAME));
                item.setAuthor_name(rs.getString(Books.AUTHOR_NAME));
                item.setRelease_year(rs.getString(Books.RELEASE_YEAR));
                item.setPublishing_house(rs.getString(Books.PUBLISHING_HOUSE));
                result.add(item);
            }
        }  catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }


    public void insert(Books item) {
        try {
            DataSource dataSource =new DataSource();
            Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_INSERT);
            statement.setString(1, item.getName());
            statement.setString(2, item.getAuthor_name());
            statement.setString(3, item.getRelease_year());
            statement.setString(4, item.getPublishing_house());
            statement.execute();

                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }




    public void delete(Books item) {
        Connection connection = null;
        DataSource dataSource= new DataSource();
        try {
            connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_DELETE);
            statement.setString(1, item.getRelease_year());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
