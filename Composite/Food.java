public abstract class Food implements Objeto{
    //Here food is any drink/food (didnt came up with any good names for it)
    //Food has a price
    double price=0.01;

    @Override
    public double price() {
        //simply returns the price of the food
        return this.price;
    }
}