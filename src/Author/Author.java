package Author;

import java.util.HashSet;
import java.util.Set;

public class Author {

    public static final String TABLE_NAME="Author1";
    public static final String FULL_NAME="Full_name";
    public static final String COUNTRY="Country";

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    private  String full_name;

    public void setCountry(String country) {
        Country = country;
    }

    private  String Country;

    public Set<Author> getItems() {
        return items;
    }

    private Set<Author> items = new HashSet<Author>();

    public String getFull_name() {
        return full_name;
    }

    public String getCountry() {
        return Country;
    }

    @Override
    public String toString() {
        return "Author{" +
                "full_name='" + full_name + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
