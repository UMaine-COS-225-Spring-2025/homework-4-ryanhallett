public class LibraryTester {
    
    public static void main(String[] args) {
        BookShelf shelfO = new BookShelf('O');
        BookShelf shelfT = new BookShelf('T');
        System.out.println(shelfO);
        System.out.println(shelfT);

        Book One = new Book("The Heart of the Betrayed", "Crime");
        Book Two = new Book("Our Hill of Stars", "Fantasy");
        Book Three = new Book("One of a Kind", "Science Fiction");
        Book Four = new Book("The Vision of Roses", "Romance");

        System.out.println(One);
        System.out.println(Two);
        System.out.println(Three);
        System.out.println(Four);
        
        shelfT.addBook("The Heart of the Betrayed", "Crime");
        shelfT.addBook("Our Hill of Stars", "Fantasy");
        shelfT.addBook("One of a Kind", "Science Fiction");
        shelfT.addBook("The Vision of Roses", "Romance");
        shelfO.addBook("The Heart of the Betrayed", "Crime");
        shelfO.addBook("Our Hill of Stars", "Fantasy");
        shelfO.addBook("One of a Kind", "Science Fiction");
        shelfO.addBook("The Vision of Roses", "Romance");
        System.out.println(shelfO);
        System.out.println(shelfT);


    
        

    }
}
