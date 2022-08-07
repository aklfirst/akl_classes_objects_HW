public class Book {
    private String bookName;
    private Author Author;
    private int yearPublish;

    public Book (String bookName, Author Author,int yearPublish) {
        this.bookName = bookName;
        this.Author = Author;
        this.yearPublish = yearPublish;

    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthor() {
        return Author.getFirstName() + " " + Author.getLastName();
                    }

    public int getYearPublish () {
        return this.yearPublish;
    }

public void setYearPublish (int yearPublish) {
    this.yearPublish = yearPublish;

}


}
