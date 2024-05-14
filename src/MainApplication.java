import java.time.LocalDate;

public class MainApplication {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setDescricao("Java - DIO");
		curso1.setTitulo(" Descricao do Java na DIO");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setDescricao("Javascript - DIO");
		curso2.setTitulo(" Descricao do Javascript na DIO");
		curso2.setCargaHoraria(4);
		
		Mentoria ment = new Mentoria();
		ment.setTitulo(" Mentoria de Java");
		ment.setDescricao("Descricao da mentoria de Java");
		ment.setDataMentoria(LocalDate.now());
		
		Bootcamp boot = new Bootcamp();
		boot.setNome("Bootcamp Java - DIO");
		boot.setDescricao("Entendendo Java na Prática");
		boot.getConteudos().add(curso1);
		boot.getConteudos().add(curso2);
		boot.getConteudos().add(ment);

		Dev dev1 = new Dev();
		dev1.setNome("Jean Vitor");
		dev1.inscreverBootCamp(boot);
		
		Dev dev2 = new Dev();
		dev2.setNome("Luana B");
		dev2.inscreverBootCamp(boot);
		
		System.out.println("Conteudos Inscritos 1 = " + dev1.getConteudosInscritos());
		System.out.println("Conteudos Inscritos 2 = " + dev2.getConteudosInscritos());
		System.out.println("XP dev1 = " + dev1.calcularTotalXp());
		System.out.println("XP dev2 = " + dev2.calcularTotalXp());
		dev1.progredir();
		dev2.progredir();
		
		System.out.println("Conteudos concluidos 1 = " + dev1.getConteudosConcluidos());
		System.out.println("Conteudos concluidos 2 = " + dev2.getConteudosConcluidos());
		System.out.println("XP dev1 = " + dev1.calcularTotalXp());
		System.out.println("XP dev2 = " + dev2.calcularTotalXp());
		dev1.progredir();
		dev2.progredir();
		System.out.println("Conteudos concluidos 2 = " + dev1.getConteudosConcluidos());
		System.out.println("Conteudos concluidos 2 = " + dev2.getConteudosConcluidos());
		System.out.println("XP dev1 = " + dev1.calcularTotalXp());
		System.out.println("XP dev2 = " + dev2.calcularTotalXp());
		
		dev1.progredir();
		dev2.progredir();
		System.out.println("Conteudos Inscritos 1 = " + dev1.getConteudosInscritos());
		System.out.println("Conteudos Inscritos 2 = " + dev2.getConteudosInscritos());
		System.out.println("XP dev1 = " + dev1.calcularTotalXp());
		System.out.println("XP dev2 = " + dev2.calcularTotalXp());
		
	}

}
