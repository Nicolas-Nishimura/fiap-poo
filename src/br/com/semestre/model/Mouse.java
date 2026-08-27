package br.com.semestre.model;
public class Mouse {
	public String cor;
	public double tamanho; 
	public String marca;
	public double dpi = 800.0;  
	
	public void mudarCor(String novaCor) {
		
		if (novaCor != null && !novaCor.trim().isEmpty()) {
			this.cor = novaCor;
			System.out.println("Sucesso: A cor do mouse foi alterada para " + this.cor);
		} else {
			System.out.println("Erro: A cor informada é inválida. O estado não foi alterado.");
		}
	}
	
	public void ajustarDpi(double novoDpi) {
		
		if (novoDpi >= 400 && novoDpi <= 16000) {
			this.dpi = novoDpi;
			System.out.println("Sucesso: DPI ajustado para " + this.dpi);
		} else {
			System.out.println("Erro: DPI " + novoDpi + " é inválido. Escolha um valor entre 400 e 16000.");
		}
	}
}
