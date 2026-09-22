package br.com.semestre.main;

import br.com.semestre.model.Mouse;

public class SistemaPrincipal {
	public static void main(String[] args) {

		// TESTE 1: A forma correta (Nascimento legalizado)
		Mouse meuMouse = new Mouse("Dell", "Preto", 50.0);
		Mouse mouseCasa = new Mouse("ATK", "Preto", 250.0);

		System.out.println("\n--- Status dos Mouses ---");
		System.out.println("Mouse da faculdade: " + meuMouse.getMarca() + " | Cor: " + meuMouse.getCor()
				+ " | Tamanho: " + meuMouse.getTamanho() + " | DPI: " + meuMouse.getDpi());
		System.out.println("Mouse de casa: " + mouseCasa.getMarca() + " | Cor: " + mouseCasa.getCor()
				+ " | Tamanho: " + mouseCasa.getTamanho() + " | DPI: " + mouseCasa.getDpi());

		System.out.println("\n--- Testes de Comportamento ---");
		meuMouse.mudarCor("Azul");
		meuMouse.mudarCor("");       // deve ser bloqueado

		meuMouse.ajustarDpi(1600);
		meuMouse.ajustarDpi(32000);  // deve ser bloqueado

		System.out.println("\n--- Tentando nascer com tamanho inválido ---");
		Mouse mouseInvalido = new Mouse("Genérico", "Branco", -10); // tamanho bloqueado

		// TESTE 2: Tentando burlar o sistema (Descomente a linha abaixo)
		// Mouse mouseFantasma = new Mouse();
		// ERRO DE COMPILAÇÃO! "The constructor Mouse() is undefined".
		// Ao criar um construtor com regras, o Java remove o construtor vazio padrão.

		// meuMouse.setTamanho(999); // ERRO! setTamanho é private.
		// meuMouse.setMarca("HP");  // ERRO! setMarca nem existe.
	}
}