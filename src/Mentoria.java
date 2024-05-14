import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate dataMentoria;
	
	public LocalDate getDataMentoria() {
		return dataMentoria;
	}
	public void setDataMentoria(LocalDate dataMentoria) {
		this.dataMentoria = dataMentoria;
	}
	
	@Override
	public Double calcularXp() { 
		
		return XP_PADRAO + 20D;
	}
	@Override
	public String toString() {
		return "Mentoria [dataMentoria = " + dataMentoria 
				+ ", descricao = " + getDescricao() 
				+ ", titulo = " + getTitulo() +"]";
	}
	
	

}
