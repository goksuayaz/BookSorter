import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {



        Set<Book> bookByName  = new TreeSet<>();


        bookByName.add(new Book("Animal Farm", 144, "George Orwell", 1945));
        bookByName.add(new Book("Sonnets", 432, "William Shakespeare", 1609));
        bookByName.add(new Book("Kalahari", 368, "Jessica Khoury", 1991));
        bookByName.add(new Book("Vampire Academy", 352, "Richelle Mead", 2007));
        bookByName.add(new Book("Hard Times", 305, "Charles Dickens", 1854));

        for (Book book : bookByName) {
            System.out.println(book);
        }

        System.out.println("----------------------------------------");


        Set<Book> bookPage = new TreeSet<>(Comparator.comparingInt(Book::getBookPage));
        bookPage.addAll(bookByName);

        for (Book book : bookPage) {
            System.out.println(book);
        }
    }

    }

