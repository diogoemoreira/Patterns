public interface Iterator{
    //all iterators must be able to tell if there are still elements to go through
    //and be able to go to the next Object
    public boolean hasNext();
    public Object next();
}