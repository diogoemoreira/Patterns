public abstract class AbstractCook{
    protected AbstractCook nextCook; //next element in the chain

    public AbstractCook(AbstractCook nextCook){
        this.nextCook=nextCook; //the nextCook is used to pass the responsability
    };

    public boolean canCook(Pedido p,Pedido.TipoPrato t){
        //confirms if the request is of a type the cook can cook
        if(p.tipo == t){
            return true;
        }
        else
            return false;
    };

    public void cooking(Pedido p){
        if (nextCook!=null)
            nextCook.cooking(p); //if there is a nextCook (isnt null) he passes the responsability
        else
            System.out.println("No cooks available for that type of food!"); //if there is no nextCook it ends
    };	
}