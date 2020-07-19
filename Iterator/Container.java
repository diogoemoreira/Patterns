public interface Container {
    //classes with this interface must have the add/remove function and
    //be able to return an iterator for the class
    public Iterator getIterator();
    public boolean add(String name);
    public boolean remove(String name);
}