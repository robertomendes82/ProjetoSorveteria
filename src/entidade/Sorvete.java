package entidade;

import java.util.Scanner;

public class Sorvete {
	private int cod;
	private String sabor;
	private double preco;
	
	
	
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "\nCod= " + cod + " Sabor=" + sabor + "  Preço=" + preco;
	}
}
	



	


