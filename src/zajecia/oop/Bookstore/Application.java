package zajecia.oop.Bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Application{

    public static void main(String[] args) {

        Bookstore bookstore= new Bookstore();
        insertExampleData(bookstore);

      // bookstore.showBooks();

        Book[] books = bookstore.getBooks("Henryk Sienkiewicz");
        for (int i = 0; i <books.length ; i++) {
            System.out.println(books[i]);
        }


    }
    public static void insertExampleData(Bookstore bookstore){
        Book book1=new Book("Ogniem i mieczem","Henryk Sienkiewicz","2001","1234566789");

        book1.setSize(3);
        String [] ogniemIMIeczem=new String[3];
        ogniemIMIeczem[0] ="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        ogniemIMIeczem[1] ="Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
        ogniemIMIeczem[2] = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        book1.setContent(ogniemIMIeczem);

        Book book2=new Book("Quo Vadis","Henryk Sienkiewicz","2002","1234566789");

        book2.setSize(3);
        String [] quoVadis=new String[3];
        ogniemIMIeczem[0] ="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        ogniemIMIeczem[1] ="Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
        ogniemIMIeczem[2] = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        book2.setContent(quoVadis);

        Book book3=new Book("Dziady 4","Adam Mickiewicz","2002","1234566789");

        book3.setSize(3);
        String [] dziady4=new String[3];
        ogniemIMIeczem[0] ="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        ogniemIMIeczem[1] ="Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
        ogniemIMIeczem[2] = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        book3.setContent(dziady4);
        bookstore.add(book1);
        bookstore.add(book2);
        bookstore.add(book3);
    }


}
