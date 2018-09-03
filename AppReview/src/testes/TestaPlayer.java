package testes;

import negocio.Atualizacao;
import negocio.Contato;
import negocio.Criador;
import negocio.Jogo;

public class TestaPlayer {

	public static void main(String[] args) {
		Contato c = new Contato();
		c.email = "elberth.moraes@gmail.com";
		c.telefone = "996016255";
				
		Atualizacao atua = new Atualizacao();
		atua.ano = 2018;
		atua.mes = 8;
		atua.motivo = "Primeira atualização";
		
		Criador cria = new Criador();
		cria.anoFundacao = 2000;
		cria.empresa = "INFNET";
		cria.patrimonio = 100000;		
		cria.contato = c;
				
		String[] nomes = {"hugo", "jose", "luis"};		
		Jogo jogo = new Jogo();
		jogo.acao = true;
		jogo.anoCriacao = 2010;
		jogo.jogadores = nomes;
		jogo.nome = "GameOne";
		jogo.qtdeFase = 8;
		jogo.valor = 100;		
		jogo.atualizacao = atua;
		jogo.criador = cria;		
		jogo.divulgar();		
	}
}