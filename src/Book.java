public class Book {
    private String bookName;
    private Author author;
    private int yearPublish;

    public Book(String bookName, Author author, int yearPublish) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublish = yearPublish;

    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthor() {
        return author.toString();
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;

}

   public String toString() {
        return "Название книги: " + getBookName() + "; " + getAuthor() + "; год издания: " + getYearPublish();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass() || obj == null) {
            return false;
        }
        if (this.bookName.equals(((Book) obj).bookName)) {
            if (this.author.equals(((Book) obj).author)) {
                if (this.getYearPublish() == ((Book) obj).yearPublish) {
                    return true;
                }
            }

        }
        return false;
    }



    @Override
    public int hashCode() {
        return java.util.Objects.hash();
    }

}
