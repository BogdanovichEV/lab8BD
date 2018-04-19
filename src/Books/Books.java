package Books;

public class Books {
    public static final String TABLE_NAME="Books1";
    public static final String NAME="Name";
    public static final String AUTHOR_NAME="Author_name";
    public static final String RELEASE_YEAR="Release_year";
    public static final String PUBLISHING_HOUSE="Publishing_house";

    public void setName(String name) {
        Name = name;
    }

    private String Name;

    public void setAuthor_name(String author_name) {
        Author_name = author_name;
    }

    private String Author_name;

    public void setRelease_year(String release_year) {
        Release_year = release_year;
    }

    private String Release_year;

    public void setPublishing_house(String publishing_house) {
        Publishing_house = publishing_house;
    }

    private String Publishing_house;

    public String getAuthor_name() {
        return Author_name;
    }

    public String getName() {
        return Name;
    }

    public String getPublishing_house() {
        return Publishing_house;
    }

    public String getRelease_year() {
        return Release_year;
    }

    @Override
    public String toString() {
        return "Books{" +
                "Name='" + Name + '\'' +
                ", Author_name='" + Author_name + '\'' +
                ", Release_year='" + Release_year + '\'' +
                ", Publishing_house='" + Publishing_house + '\'' +
                '}';
    }
}
