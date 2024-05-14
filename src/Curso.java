
public class Curso extends Conteudo{
	
	public Curso() {
		this.cargaHoraria = 0;
	}

	private Integer cargaHoraria;
	
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public Double calcularXp() {
		
		return XP_PADRAO * cargaHoraria;
		
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() 
		+ ", descricao=" + getDescricao() 
		+ ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
	
	
}
