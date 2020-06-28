public class ReservedState implements State{
    //this state only chnages state in one method
    @Override
    public void register(Book b) {
        System.out.println("Operation not available");
    }
    @Override
    public void request(Book b) {
        System.out.println("Operation not available");

    }
    @Override
    public void reserve(Book b) {
        System.out.println("Operation not available");

    }
    @Override
    public void cancelReserve(Book b) {
        b.setState(new AvailableState());
    }
    @Override
    public void giveBack(Book b) {
        System.out.println("Operation not available");
    }
    public String toString() {
        return "[Reserved]";
    }
}