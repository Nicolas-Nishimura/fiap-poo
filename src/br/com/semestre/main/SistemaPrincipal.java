package br.com.semestre.main;

import br.com.semestre.model.Mouse;

public class SistemaPrincipal {
	public static void main(String[] args) {

		Mouse meuMouse = new Mouse();
		meuMouse.setCor("Preto");
		meuMouse.setTamanho(50.0);
		meuMouse.setMarca("Dell");

		Mouse mouseCasa = new Mouse();
		mouseCasa.setCor("Preto");
		mouseCasa.setTamanho(250.0);
		mouseCasa.setMarca("ATK");

		System.out.println("Mouse da faculdade: " + meuMouse.getTamanho());
		System.out.println("Mouse de casa: " + mouseCasa.getTamanho());

		System.out.println("\n--- TESTES ---");
		meuMouse.setCor("Azul");
		meuMouse.setCor("");        

		meuMouse.setDpi(800);
		meuMouse.setDpi(32000);    

		mouseCasa.setTamanho(-10);  

		System.out.println("\n--- Tentando burlar o sistema ---");

		System.out.println("A proteção funcionou: atributos privados não podem ser acessados diretamente.");
	}
}