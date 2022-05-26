package ex41;

import java.util.ArrayList;

public class Agenda {
	

 	private int quantidade; 
 	private Contato contatos;
 	private ArrayList<String> lcontatos;
 	
 	public Contato getContatos() {
		return contatos;
	}
	public void setContatos(Contato contatos) {
		this.contatos = contatos;
	}
	
	public ArrayList<String> getLcontatos() {
		return lcontatos;
	}
	public void setLcontatos(ArrayList<String> lcontatos) {
		this.lcontatos = lcontatos;
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	

	public Agenda() {
		
	}
	public Agenda(int quantidade) {

		this.quantidade = quantidade;

	}
	
}
