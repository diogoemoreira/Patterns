public class CoRMain {
    public static void main(String[] args){
        AbstractCook chain = new MeatCook(new FishCook(new VegCook(null)));
        chain.cooking(new Pedido(Pedido.TipoPrato.Peixe));
        chain.cooking(new Pedido(Pedido.TipoPrato.Carne));
        chain.cooking(new Pedido(Pedido.TipoPrato.Vegetariano));
        chain.cooking(new Pedido(Pedido.TipoPrato.Carne));
        chain.cooking(new Pedido(Pedido.TipoPrato.Peixe));
    }
}