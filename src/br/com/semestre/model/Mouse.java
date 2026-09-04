package br.com.semestre.model;

public class Mouse {

	private String cor;
	private double tamanho;
	private String marca;
	private double dpi = 800.0;

	public String getCor() {
		return this.cor;
	}

	public void setCor(String novaCor) {
		if (novaCor != null && !novaCor.trim().isEmpty()) {
			this.cor = novaCor;
			System.out.println("Sucesso: A cor do mouse foi alterada para " + this.cor);
		} else {
			System.out.println("Erro: A cor informada é inválida. O estado não foi alterado.");
		}
	}

	public double getTamanho() {
		return this.tamanho;
	}

	public void setTamanho(double novoTamanho) {
		if (novoTamanho > 0) {
			this.tamanho = novoTamanho;
		} else {
			System.out.println("Erro: Tamanho inválido. Deve ser maior que 0.");
		}
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getDpi() {
		return this.dpi;
	}

	public void setDpi(double novoDpi) {
		if (novoDpi >= 400 && novoDpi <= 16000) {
			this.dpi = novoDpi;
			System.out.println("Sucesso: DPI ajustado para " + this.dpi);
		} else {
			System.out.println("Erro: DPI " + novoDpi + " é inválido. Escolha um valor entre 400 e 16000.");
		}
	}

	public void mudarCor(String novaCor) {
		setCor(novaCor);
	}

	public void ajustarDpi(double novoDpi) {
		setDpi(novoDpi);
	}
}