package V1;
public class Colaborador {
	private String matricula;
	private String nome;
	private final float salarioBase = 2000;
	public Colaborador(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	public String getMatricula() {
		return this.nome;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return this.matricula;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalarioBase() {
		return this.salarioBase;
	}
	public float calcularSalarioFinal() {
		return this.getSalarioBase();
	}
	public String exibirDados() {
		return "Matrícula: " + this.getMatricula() + "|Nome: " + this.getNome() +  "|Salário base:" + this.getSalarioBase();
	}
}
