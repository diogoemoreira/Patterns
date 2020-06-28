public class FishCook extends AbstractCook{
    Pedido.TipoPrato t = Pedido.TipoPrato.Peixe;

    public FishCook(AbstractCook cook){
       super(cook); //assigns his next Cook
    }

    public void cooking(Pedido p){
        if (canCook(p, t))
            System.out.println("Im cooking the Fish !!!");
        else
            super.cooking(p);
    }
}