package entidades;

public class Funcionario {
	
	private String nome;
	private Integer horas;
	private Double ValorPorHoras;
	
	public Funcionario() {	
	}

	public Funcionario(String nome, Integer horas, Double valorPorHoras) {
		
		this.nome = nome;
		this.horas = horas;
		ValorPorHoras = valorPorHoras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHoras() {
		return ValorPorHoras;
	}

	public void setValorPorHoras(Double valorPorHoras) {
		ValorPorHoras = valorPorHoras;
	}

	public Double Pagamento() {
		return ValorPorHoras * horas;
	}
	


}
