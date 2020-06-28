import java.util.ArrayList;

public class Box implements Objeto {
    //Box has an array of Objects(food or boxes) and can be seen as a tree in this example
    ArrayList<Objeto> things = new ArrayList<Objeto>();

    public Box(){}

    @Override
    public double price() {
        //a Box gets the price of every object inside it
        double totalPrice=0.0;
        for(Objeto o: things){
            System.out.println(o.getClass().toString()+" price added to total");
            totalPrice+=o.price();
            //if there are more boxes they also go over their objects
        }
        
        return totalPrice;
    }

    public void add(Objeto o){
        //add an object to the box
        things.add(o);
    }

    public void remove(Objeto o){
        //remove an object from the box
        if(things.contains(o)){
            things.remove(o);
        }
        else{
            System.out.println("Object not in this box!");
        }
    }

    public String toString(){
        return "This box's price is: "+price() ;
    }
}