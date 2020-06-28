public class AvailableState implements State{
    @Override
    public void register(Book b) {
        System.out.println("Operation not available");
    }
    @Override
    public void request(Book b) {
        b.setState(new LentState());
    }
    @Override
    public void reserve(Book b) {
        b.setState(new ReservedState());
    }
    @Override
    public void cancelReserve(Book b) {
        System.out.println("Operation not available");
    }
    @Override
    public void giveBack(Book b) {
        System.out.println("Operation not available");
    }

    @Override
    public String toString() {
        return "[Available]";
    }
    
}