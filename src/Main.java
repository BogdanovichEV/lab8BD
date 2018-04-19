
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import Author.Author;
import Books.Books;
import DAO.AuthorDAO;
import DAO.BooksDAO;
import DataSourse.DataSource;
import Real_inter.AuthorDAOIP;
import Real_inter.BooksDAOIP;

public class Main{
    private static BooksDAO warehouseDao;
    private static AuthorDAO itemDao;

    public static void main(String[] args) {

        Author author=new Author();
        author.setFull_name("Name1");
        author.setCountry("country3");
        AuthorDAOIP authorDAOIP=new AuthorDAOIP();
        authorDAOIP.insert(author);
        Books books=new Books();
        books.setName("Book3");
        books.setAuthor_name("B");
        books.setRelease_year("1998");
        books.setPublishing_house("dd");
        BooksDAOIP booksDAOIP=new BooksDAOIP();
       //booksDAOIP.insert(books);

        Books books1=new Books();
        books1.setName("Book2");
        books1.setAuthor_name("A");
        books1.setRelease_year("2018");
        books1.setPublishing_house("dd1");
        BooksDAOIP booksDAOIP2=new BooksDAOIP();
       // booksDAOIP2.insert(books1);
        Books books2=new Books();
        books2.setRelease_year("1990");
        //booksDAOIP2.delete(books2);
        List<Books> result1=new ArrayList<>();
        result1=booksDAOIP2.findAll();
        for(Books i:result1)
        {
            System.out.println(i.toString());
        }
        List<Books> result4=new ArrayList<>();
        result4=booksDAOIP2.findAll1();
        for(Books i:result4)
        {
            System.out.println(i.toString());
        }
        List<Author> result = new ArrayList<Author>();
        result=authorDAOIP.findAll();
        for(Author i:result)
        {
            System.out.println(i.toString());
        }
        List<Author> result2 = new ArrayList<Author>();
        result2=authorDAOIP.findAllA();
        for(Author i:result2)
        {
            System.out.println(i.toString());
        }

    }
}
