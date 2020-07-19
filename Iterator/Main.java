public class Main {
    public static void main(String[] args){
        NameBox names = new NameBox();
        names.add("John");
        names.add("Mary");
        names.add("Peter");
        names.add("John");
        names.add("Lully");
        Iterator it = names.getIterator(); //receives iterator for the class
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //iterator finished going through all elements
        it = names.getIterator();//get a new iterator
        names.remove("John");//remove all occurences of John from the list
        System.out.println("\nJohn was removed from the list \n");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}