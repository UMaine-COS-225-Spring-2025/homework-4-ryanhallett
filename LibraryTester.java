public class LibraryTester {
    
    public static void main(String[] args) {
        BookShelf shelfO = new BookShelf('O');
        BookShelf shelfT = new BookShelf('T');
        System.out.println(shelfO);
        System.out.println(shelfT);
        System.out.println("The Heart of the Betrayed");
        System.out.println("Our Hill of Stars");
        System.out.println("One of a Kind");
        System.out.println("The Vision of Roses");
        
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
