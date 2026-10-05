package V1;
public class ColaboradorProducao extends Colaborador {
	private int quantidadePecas;
	private float valorPorPeca;
	public int getQuantidadePecas() {
		return this.quantidadePecas;
	}
	public void setQuantidadePecas(int quantidadePecas) {
		this.quantidadePecas = quantidadePecas;
	}
	public float getValorPorPeca() {
		return this.valorPorPeca;
	}
	public void setValorPorPeca(float valorPorPeca) {
		this.valorPorPeca = valorPorPeca;
	}
	public float calcularProdutividade() {
		return this.getQuantidadePecas() * this.getValorPorPeca();
	}
	public float calcularSalarioFinal() {
		return this.getSalarioBase() + this.calcularProdutividade();
	}
}
