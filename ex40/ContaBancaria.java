package ex40;

public class ContaBancaria {
	private String agencia;
	private String numero;
	private double saldo;
	private String extrato;
	private double limite;
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String setExtrato() {
		return extrato;
	}
	
	public void setExtrato(String extrato) {
		this.extrato = extrato;
	}
	
	public double setLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	ContaBancaria(){
		
	}
	
	ContaBancaria(String agencia, String numero){
		
	}
	
	public void Depositar(double valorDeposito) {
		
	}
	
	public void Sacar(double valorSaque){
		
	}
	
	public void Transferir(double valorTransf, Cliente destinatario){
		
	}
	
	public Double ConsultarSaldo(){
		return saldo;
	}
	
	public String extrato() {
		return extrato;
	}

}
