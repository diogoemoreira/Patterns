import java.util.ArrayList;

public class NameBox implements Container {
    private ArrayList<String> names = new ArrayList<String>();

    //returns an iterator for this class
    public Iterator getIterator(){ 
        return new NamesIterator(names);
    }

    //adds a name to the ArrayList names
    public boolean add(String name){
        return names.add(name);
    }
    //removes a name from the ArrayList names
    public boolean remove(String name){
        if(names.contains(name)){
            while(names.contains(name)){
                //while the name is still in the ArrayList remove it
                names.remove(name);
            }
            return true; //all the occurences of the name were removed from the ArrayList
        }
        else{
            //self explanatory
            System.out.println("No such element in the ArrayList");
            return false;
        }
    }

    //PRIVATE ITERATOR FOR THIS CLASS
    //
    private class NamesIterator implements Iterator{
        int i=0; //index used to go over array elements
        public ArrayList<String> names; //you could also put the names ArrayList from NameBox public

        //if names ArrayList was public this part is useless
        public NamesIterator(ArrayList<String> names){
            this.names=names;
        }
        //
       
        //confirms if there is another object in the ArrayList
        @Override
        public boolean hasNext(){
            if(i<names.size()){
                return true;
            }
            return false;
        }

        //get the next object (if there is one)
        @Override
        public Object next(){
            if(this.hasNext()){
                return this.names.get(i++); //return element in index i and increment i
            }
            return null;
        }
    }
    //
    //
}