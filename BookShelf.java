import java.util.ArrayList;

public class BookShelf {
    public char firstLetter;
    public ArrayList<Book> myList;


    public BookShelf(char letter) {
        this.firstLetter = letter;
        this.myList = new ArrayList<>(8);
    }

    public ArrayList<Book> getBooks() {
        return myList;
    }

    public void setBooks(ArrayList<Book> books) {
        if (books.size() <= 8) {
            myList.clear();
            myList.addAll(books);
        } else {
            System.out.println("no more than 8 books.");
        }
    }

    public void addBook(String title, String genre) {
        if (myList.size() < 8) {
            if (title.charAt(0) == firstLetter) {
                myList.add(new Book(title, genre));
            }
        }
    }
}