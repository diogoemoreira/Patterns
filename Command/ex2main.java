import java.util.ArrayList;

public class ex2main {

	public static void main(String[] args) {
		ArrayList<String> Nomes = new ArrayList<String>();
		Nomes.add("Luis"); Nomes.add("Diogo"); Nomes.add("Joao"); Nomes.add("Maria"); Nomes.add("Carlos"); Nomes.add("Helder"); Nomes.add("José");

		CommandInterface Add = new AddElement<String>(Nomes, "Pedro");
		CommandInterface Rem = new RemElement<String>(Nomes, "Luis");
		
		System.out.println(Nomes);
		Add.execute();
		System.out.println(Nomes);
		Add.undo();
		System.out.println(Nomes);
		Rem.execute();
		System.out.println(Nomes);
		Rem.undo();
		System.out.println(Nomes);

	}

}
