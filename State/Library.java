import java.util.Vector;

public class Library {
    Vector<Book> books;

    public Library(){
        books= new Vector<Book>();
    }

    public void add(Book b){
        books.add(b);
    }

    public Book selectBook(int i){
        return books.get(i);
    }

    public void printBooks(){
    	int n=0;
        for(Book b: books){
        	n++;
            System.out.printf(n+" %-20s %-20s %-10s \n",
                b.getTitle(),b.getAuthor(),b.getState());
        }
    }
}