package br.com.semestre.model;

public class Mouse {

	// 1. Atributos sempre privados (Encapsulamento)
	private String marca;
	private String cor;
	private double tamanho;
	private double dpi = 800.0; // valor padrão de fábrica

	// 2. O CONSTRUTOR (O Cartório)
	public Mouse(String marca, String cor, double tamanho) {
		this.marca = marca;
		// Usamos os setters privados para validar logo no nascimento!
		this.setCor(cor);
		this.setTamanho(tamanho);
		System.out.println("Registro inicial: Um mouse " + this.marca + " nasceu na cor "
				+ this.cor + " com tamanho " + this.tamanho);
	}

	// 3. Getters (Apenas leitura)
	public String getMarca() {
		return this.marca;
	}

	public String getCor() {
		return this.cor;
	}

	public double getTamanho() {
		return this.tamanho;
	}

	public double getDpi() {
		return this.dpi;
	}

	// 4. COMPORTAMENTOS PÚBLICOS (Ações reais)
	public void mudarCor(String novaCor) {
		System.out.println("Solicitada troca de cor do mouse " + this.marca + "...");
		this.setCor(novaCor);
	}

	public void ajustarDpi(double novoDpi) {
		System.out.println("Solicitado ajuste de DPI no mouse " + this.marca + "...");
		this.setDpi(novoDpi);
	}

	// 5. SETTERS PRIVADOS (A engrenagem interna de validação)
	private void setCor(String novaCor) {
		if (novaCor != null && !novaCor.trim().isEmpty()) {
			this.cor = novaCor;
			System.out.println("Sucesso: A cor agora é " + this.cor);
		} else {
			System.out.println("Erro de Validação: A cor informada é inválida!");
		}
	}

	private void setTamanho(double novoTamanho) {
		if (novoTamanho > 0) {
			this.tamanho = novoTamanho;
		} else {
			System.out.println("Erro de Validação: O tamanho deve ser maior que 0!");
		}
	}

	private void setDpi(double novoDpi) {
		if (novoDpi >= 400 && novoDpi <= 16000) {
			this.dpi = novoDpi;
			System.out.println("Sucesso: DPI ajustado para " + this.dpi);
		} else {
			System.out.println("Erro de Validação: DPI " + novoDpi + " é inválido. Escolha entre 400 e 16000.");
		}
	}

	// Obs: A marca e o tamanho são IMUTÁVEIS na vida real.
	// Por isso NÃO existe setMarca() e não há ação pública para mudar o tamanho!
}