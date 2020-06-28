public class Pedido {
    TipoPrato tipo;

    public Pedido(TipoPrato tipo) {
        this.tipo = tipo;
    }

    public enum TipoPrato{
        Vegetariano,
        Carne,
        Peixe
    }
}