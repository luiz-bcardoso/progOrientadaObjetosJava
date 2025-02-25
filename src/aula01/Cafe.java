package aula01;

public class Cafe {
	private String marca;
	private double preco;
	private int quantidade;
	
	public Cafe(String marca, double preco, int quantidade) {
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Cafe [marca=" + marca + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	
}
