public class MeatCook extends AbstractCook{
    Pedido.TipoPrato t = Pedido.TipoPrato.Carne;

    public MeatCook(AbstractCook cook){
       super(cook);  //assigns his next Cook
    }

    public void cooking(Pedido p){
        if (canCook(p, t))
            System.out.println("Im cooking the Meat !!!");
        else
            super.cooking(p);
    }
}