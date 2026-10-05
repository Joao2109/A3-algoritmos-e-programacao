package V1;
public class ColaboradorComissionado extends Colaborador {
	private int valorVendas;
	private int percentualComissao;
	public int getValorVendas() {
		return this.valorVendas;
	}
	public void setValorVendas(int valorVendas) {
		this.valorVendas = valorVendas;
	}
	public int getPercentualComissao() {
		return this.valorVendas;
	}
	public void setPercentualComissao(int percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	public float calcularComissao() {
		return this.valorVendas * percentualComissao / 100;
	}
	public float calcularSalarioFinal() {
		return this.getSalarioBase() + this.calcularComissao();
	}
}
