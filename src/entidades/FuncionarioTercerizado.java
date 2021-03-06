package entidades;

public class FuncionarioTercerizado extends Funcionario {
	
	private Double TaxaAdicional;

	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String nome, Integer horas, Double valorPorHoras, Double taxaAdicional) {
		super(nome, horas, valorPorHoras);
		TaxaAdicional = taxaAdicional;
	}

	public Double getTaxaAdicional() {
		return TaxaAdicional;
	}

	public void setTaxaAdicional(Double taxaAdicional) {
		TaxaAdicional = taxaAdicional;
	}
	@Override
	public Double Pagamento() {
		return super.Pagamento() + TaxaAdicional * 1.1 ;
	}
	

}
