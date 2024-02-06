package aula2;

public class Cachorro {
	private String nome;
	private String raca;
	private int idade;
	private String cor;
	private String desc;
	
	public String Getnome() {
	return nome;
	}
	public String Getraca() {
	return raca;
	}
	public int Getidade() {
	return idade;
	}
	public String Getcor() {
	return cor;
	}
	public String Getdesc() {
	return desc;
	}
	
	public void Setnome(String nome) {
	this.nome = nome;
	}
	public void Setraca(String raca) {
	this.raca = raca;
	}
	public void Setidade(int idade) {
	this.idade = idade;
	}
	public void Setcor(String cor) {
	this.cor = cor;
	}
	public void Setdesc(String desc) {
	this.desc = desc;
}
public void latir () {
	System.out.println("O cachorro " + nome + "latiu");
}
public void Getcachorro() {
	System.out.println (
	 
			"Nome: " + nome +
			"\nRaça: " + raca +
			"\nIdade: " + idade +
			"\nCor: " + cor 
			"Descrição: " + desc
			);
	
	
	
	
	
}
}












