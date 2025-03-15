package mian;

import application.Iphone;

public class Main {

	public static void main(String[] args) {
		Iphone meuIphone = new Iphone();
		
		// Testando
		meuIphone.selecionarMusica("Let it be");
		meuIphone.tocar();
		meuIphone.pausar();
		
		meuIphone.ligar("000 12345-6789");
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();
		
		meuIphone.exibirPagina("https://www.apple.com");
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();
	}

}
