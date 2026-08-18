package br.com.semestre.main;
import br.com.semestre.model.Mouse;

public class SistemaPrincipal {
	public static void main(String[] args) {
		Mouse meuMouse = new Mouse();
		meuMouse.cor = "Preto";
		meuMouse.tamanho = "Pequeno";
		meuMouse.marca = "";
		
		Mouse mouseCasa = new Mouse();
		mouseCasa.cor = "Preto";
		mouseCasa.tamanho = "Médio";
		mouseCasa.marca = "ATK";
		
		System.out.println("Mouse da faculdade: " + meuMouse.tamanho);
		System.out.println("Mouse de casa: " + mouseCasa.tamanho);

	}

}
