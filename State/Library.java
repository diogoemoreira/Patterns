import java.util.Vector;

public class Library {
    //has many books that can be in different states
    Vector<Book> books;

    public Library(){
        //initializes the vector which will contain all the books
        books= new Vector<Book>();
    }

    public void add(Book b){
        //adds a book to the vector
        books.add(b);
    }

    public Book selectBook(int i){
        //returns book in position i
        return books.get(i);
    }

    public void printBooks(){
        //prints information for every book
    	int n=0;
        for(Book b: books){
            n++;
            //print with books title,author and current state
            System.out.printf(n+" %-20s %-20s %-10s \n",
                b.getTitle(),b.getAuthor(),b.getState());
        }
    }
}