import java.util.ArrayList;

public class BookShelf {
    public char firstLetter;
    public ArrayList<Book> myList;


    public BookShelf(char firstLetter) {
        this.firstLetter = firstLetter;
        this.myList = new ArrayList<>(8);
    }

    public char getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(char firstLetter) {
        this.firstLetter = firstLetter;
    }

    public ArrayList<Book> getBooks() {
        return myList;
    }

    public void setBooks(ArrayList<Book> myList) {
        this.myList = myList;
    }

    public void addBook(Book book) {
        if (myList.size() < 8) {
            if (book.title.charAt(0) == firstLetter) {
                myList.add(book);
            }
        }
    }

    public void removeBook(Book book) {
        myList.remove(book);
    }

    @Override
    public String toString() {
        if (myList.isEmpty()) {
            return "Empty";
        } 
        String thing = "";
        for (int i = 0; i < myList.size(); i++) {
            thing += myList.get(i).title; 
            thing += "   ";
            }
        return thing;
    }
}