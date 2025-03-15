package application;

import func.IAparelhoTelefonico;
import func.INavegadorInternet;
import func.IReprodutorMusical;

public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);		
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada.");		
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada.");		
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + "...");		
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada...");		
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");		
		
	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo música...");
		
	}

	@Override
	public void pausar() {
		System.out.println("Música Pausada.");		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Slecionando música: " + musica);		
		
	}

}
