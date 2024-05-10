import java.util.List;

public class Dev {

	private String nome;
	private List<Mentoria> mentorias;
	private List<Curso> cursos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Mentoria> getMentorias() {
		return mentorias;
	}
	public void setMentorias(List<Mentoria> mentorias) {
		this.mentorias = mentorias;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	
}
