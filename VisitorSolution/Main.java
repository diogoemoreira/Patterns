package projetoPDS.VisitorSolution;

public class Main {
	
	public static void main(String[] args) {
		Visitor springV = new SpringVisitor();
		Visitor summerV = new SummerVisitor();
		Visitor fallV = new FallVisitor();
		Visitor winterV = new WinterVisitor();
		Visitor problemV = new ProblemVisitor();
		
		BiologyDep bd = new BiologyDep();
		EletronicsDep ed = new EletronicsDep();
		HealthDep hd = new HealthDep();
		MusicDep md = new MusicDep();
		
		bd.accept(springV);
		ed.accept(springV);
		hd.accept(springV);
		md.accept(springV);
		System.out.println(bd +"\n"+ ed +"\n"+ hd +"\n"+ md);
		bd.accept(problemV);
		System.out.println(" "+bd +"\n "+ ed +"\n "+ hd +"\n "+ md);
		
		bd.accept(summerV);
		ed.accept(summerV);
		hd.accept(summerV);
		md.accept(summerV);
		System.out.println("\n"+bd +"\n"+ ed +"\n"+ hd +"\n"+ md);
		ed.accept(problemV);
		System.out.println(" "+bd +"\n "+ ed +"\n "+ hd +"\n "+ md);
		
		bd.accept(fallV);
		ed.accept(fallV);
		hd.accept(fallV);
		md.accept(fallV);
		System.out.println("\n"+bd +"\n"+ ed +"\n"+ hd +"\n"+ md);
		hd.accept(problemV);
		System.out.println(" "+bd +"\n "+ ed +"\n "+ hd +"\n "+ md);
		
		bd.accept(winterV);
		ed.accept(winterV);
		hd.accept(winterV);
		md.accept(winterV);
		System.out.println("\n"+bd +"\n"+ ed +"\n"+ hd +"\n"+ md);
		md.accept(problemV);
		System.out.println(" "+bd +"\n "+ ed +"\n "+ hd +"\n "+ md);
	}
}
