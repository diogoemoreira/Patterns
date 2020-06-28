public class Main {
    public static void main(String[] args){
        Objeto box = new Box();
        Objeto box2 = new Box();

        Objeto cake = new Cake();
        Objeto beer = new Beer();

        //a cast on box is needed because the interface doesn't have the method add(Objeto o)
        ((Box) box).add(cake);
        ((Box) box).add(beer);
        
        for(int i=0;i<5;i++) 
            ((Box) box2).add(beer);

        ((Box) box).add(box2);

        System.out.println(box.toString());
    }
}