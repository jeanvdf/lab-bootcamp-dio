
public class MainApplication {

	public static void main(String[] args) {
		
		Bootcamp boot = new Bootcamp();
		boot.setNome("Bootcamp Java - DIO");
		boot.setDescricao("Entendendo Java na Prática");

		System.out.println(boot);
		
		Curso curso1 = new Curso();
		curso1.setDescricao("Java - DIO");
		curso1.setTitulo(null);
		
	}

}
