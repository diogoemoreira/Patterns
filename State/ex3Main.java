import java.util.Scanner;

public class ex3Main {
    public static void main(String[] args){
        Book b1 = new Book("Anti-Stress",2001,"Luis Rabanadas");
        Book b2 = new Book("Jogos pra que",2011,"Malaquias Zebedeu");
        Book b3 = new Book("Proporcoes",2007,"Maria Luisa");

        Library lib = new Library();

        lib.add(b1);
        lib.add(b2);
        lib.add(b3);

        Scanner sc=new Scanner(System.in);
        
        lib.printBooks();
        int choice=0;
        while(choice!=6){
            System.out.println("<livro>, <operacao>: (1) regista; (2)requisita; (3)devolve; (4)reserva; (5)cancela; (6) Exit");
            String s = sc.next();
            
            String[] ops = s.split(",");
            int choosenBook = Integer.parseInt(ops[0])-1;
            choice = Integer.parseInt(ops[1]);

            switch(choice){
                case 1:
                    lib.selectBook(choosenBook).register();
                    break;
                case 2:
                    lib.selectBook(choosenBook).request();;
                    break;
                case 3:
                    lib.selectBook(choosenBook).giveBack();;
                    break;
                case 4:
                    lib.selectBook(choosenBook).reserve();;
                    break;
                case 5:
                    lib.selectBook(choosenBook).cancelReserve();;
                    break;
                default:
                    break;
            }
            lib.printBooks();
        }
        sc.close();
    }
}