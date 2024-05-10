import java.time.LocalDate;

public class Bootcamp {
	
	public Bootcamp() {
		this.dataInicio = LocalDate.now();
		this.dataTermino = dataInicio.plusDays(45);
	}
	
	private String nome;
	private String descricao;
	private LocalDate dataInicio;
	private LocalDate dataTermino;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public LocalDate getDataTermino() {
		return dataTermino;
	}
	
	

}
