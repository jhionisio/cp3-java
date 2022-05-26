package ex42;

import java.util.ArrayList;

public class Agenda {
	

 	private int quantidade; 
 	private Contato contatos;
 	private ArrayList<String> Acontatos;
 	
 	public Contato getContatos() {
		return contatos;
	}
	public void setContatos(Contato contatos) {
		this.contatos = contatos;
	}
	
	public ArrayList<String> getLcontatos() {
		return Acontatos;
	}
	public void setLcontatos(ArrayList<String> lcontatos) {
		this.Acontatos = lcontatos;
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