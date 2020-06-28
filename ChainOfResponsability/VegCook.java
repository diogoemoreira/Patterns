public class VegCook extends AbstractCook{
    Pedido.TipoPrato t = Pedido.TipoPrato.Vegetariano;

    public VegCook(AbstractCook cook){
       super(cook); //assigns his next Cook
    }

    public void cooking(Pedido p){
        if (canCook(p, t))
            System.out.println("Im cooking the Veggies !!!");
        else
            super.cooking(p);
    }
}