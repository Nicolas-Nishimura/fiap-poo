package br.com.semestre.main;
import br.com.semestre.model.Mouse;
public class SistemaPrincipal {
	public static void main(String[] args) {
		Mouse meuMouse = new Mouse();
		meuMouse.cor = "Preto";
		meuMouse.tamanho = 50.0;
		meuMouse.marca = "Dell";
		
		Mouse mouseCasa = new Mouse();
		mouseCasa.cor = "Preto";
		mouseCasa.tamanho = 250.0;
		mouseCasa.marca = "ATK";
		
		System.out.println("Mouse da faculdade: " + meuMouse.tamanho);
		System.out.println("Mouse de casa: " + mouseCasa.tamanho);
		
		System.out.println("\n--- TESTES ---");
		meuMouse.mudarCor("Azul");
		meuMouse.mudarCor("");    
		
		meuMouse.ajustarDpi(800);  
		meuMouse.ajustarDpi(32000);
	}
}
