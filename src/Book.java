public class Book implements Comparable<Book>{


    private String bookName;
    private int bookPage;
    private String authorName;
    private int publicDate;




    public Book(String bookName, int bookPage, String authorName, int publicDate) {
        this.bookName = bookName;
        this.bookPage = bookPage;
        this.authorName = authorName;
        this.publicDate = publicDate;

    }

    @Override
    public String toString() {
        return "Book Name : " + bookName + " " +
                ", Book Page : " + bookPage +
                ", Author Name : " + authorName + " " +
                ", Public Date : " + publicDate + "\n";
    }

    public String getBookName() {
        return bookName;
    }


    public int getBookPage() {
        return bookPage;
    }


    public String getAuthorName() {
        return authorName;
    }

    public int getPublicDate() {
        return publicDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.bookName.compareTo(o.bookName);

    }



}
