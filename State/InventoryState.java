public class InventoryState implements State{
    //this state only changes state in one method
    @Override
    public void register(Book b) {
        b.setState(new AvailableState());
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
        System.out.println("Operation not available");
    }
    public String toString() {
        return "[Inventory]";
    }
    
}