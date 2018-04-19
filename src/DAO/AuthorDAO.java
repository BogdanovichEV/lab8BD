package DAO;
import Author.Author;
import Books.Books;

import java.util.List;

public interface AuthorDAO {
    public static final String SQL_INSERT = "insert into " + Author.TABLE_NAME + " (" + Author.FULL_NAME + ", " + Author.COUNTRY + ") values (?, ?)";
    public static final String SQL_FIND_ALL = "select * from " + Author.TABLE_NAME;
    public static final String SQL_FIND_ALL1 = "select "+Author.FULL_NAME+","+Author.COUNTRY+" from " + Author.TABLE_NAME+" INNER JOIN "+Books.TABLE_NAME+" On "+Author.FULL_NAME+"="+Books.AUTHOR_NAME+" GROUP BY "+Author.FULL_NAME+","+Author.COUNTRY+" HAVING COUNT(*) > 1";

    public List<Author> findAll();
    public void insert(Author author) ;
}
