/* 

Name: Ryan Hallett
Date: 3/6/25
Collaboration: W3Schools, GeeksForGeeks, 
Notes, Programiz, In-Class Work
Class: COS 225 OOP
Instructor: Chris Dufor

 */

public class LibraryTester {
    public static void main(String[] args) {
        BookShelf shelfO = new BookShelf('O');
        BookShelf shelfT = new BookShelf('T');

        Book One = new Book("The Heart of the Betrayed", "Crime");
        Book Two = new Book("Our Hill of Stars", "Fantasy");
        Book Three = new Book("One of a Kind", "Science Fiction");
        Book Four = new Book("The Vision of Roses", "Romance");

        System.out.println(shelfO + "\n" + shelfT);

        System.out.println(One + "\n" + Two +
        "\n" + Three + "\n" + Four);
        
        shelfO.addBook(One);
        shelfO.addBook(Two);
        shelfO.addBook(Three);
        shelfO.addBook(Four);
        shelfT.addBook(One);
        shelfT.addBook(Two);
        shelfT.addBook(Three);
        shelfT.addBook(Four);
        
        System.out.println(shelfO + "\n" + shelfT);
    }
}
