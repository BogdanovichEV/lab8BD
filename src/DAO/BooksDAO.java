package DAO;
import Books.Books;

import java.util.List;

public interface BooksDAO {
    public static final String SQL_FIND_ALL1 = "select * from " + Books.TABLE_NAME;
    public static final String SQL_FIND_ALL = "select * from " + Books.TABLE_NAME+" where "+Books.RELEASE_YEAR +" = YEAR(GETDATE()) OR "+Books.RELEASE_YEAR+" = YEAR(GETDATE())+1";
    public static final String SQL_INSERT = "insert into " + Books.TABLE_NAME + " (" + Books.NAME+", "+Books.AUTHOR_NAME+","+Books.RELEASE_YEAR+", "+Books.PUBLISHING_HOUSE + ") values (?,?,?,?)";

    public static final String SQL_DELETE = "delete from " + Books.TABLE_NAME + " where " + Books.RELEASE_YEAR + " > ?";

    public List<Books> findAll();
    public void insert(Books book);
    public void delete(Books book);
}
