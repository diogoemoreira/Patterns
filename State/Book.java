public class Book{
    //ok the book is the class that changes state
    //in summary this class can be in one state and depending on its state can jump to another state in specific methods
    //to see to which state it can jump to see state classes
    State state;
    private static int publicISBN=0;
    protected String title;
    protected int ISBN;
    protected int year;
    protected String Author;

    public Book(final String title, int year, String author) {
        this.state = new InventoryState(); // state starts at Inventory
        this.title = title;
        this.ISBN = ++publicISBN;
        this.year = year;
        this.Author = author;
    }

    public void setState(final State state) {
        //sets the state of the book
        this.state=state;
    }
    public State getState(){
        //gets the current state of the book
        return this.state;
    }

    //this methods call the state the book is in and can either jump to another state or print a message saying it cant use the method
    public void register(){
        this.state.register(this);
    }
    public void request(){
        this.state.request(this);
    }
    public void reserve(){
        this.state.reserve(this);
    }
    public void cancelReserve(){
        this.state.cancelReserve(this);
    }
    public void giveBack(){
        this.state.giveBack(this);
    }
    //
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return Author;
    }





}