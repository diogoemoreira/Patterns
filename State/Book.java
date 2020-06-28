public class Book{
    State state;
    private static int publicISBN=0;
    protected String title;
    protected int ISBN;
    protected int year;
    protected String Author;

    public Book(final String title, int year, String author) {
        this.state = new InventoryState(); // o state comeca a Inventory
        this.title = title;
        this.ISBN = ++publicISBN;
        this.year = year;
        this.Author = author;
    }

    public void setState(final State state) {
        this.state=state;
    }
    public State getState(){
        return this.state;
    }

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

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return Author;
    }





}