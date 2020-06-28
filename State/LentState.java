public class LentState implements State {
    //this state only changes state in one method
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
        System.out.println("Operation not available");
    }
    @Override
    public void giveBack(Book b) {
        b.setState(new AvailableState());
    }
    public String toString() {
        return "[Lent]";
    }
}