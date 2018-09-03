package negocio;

public class Jogo {

	public String nome;
	public int anoCriacao;
	public int qtdeFase;
	public boolean acao;
	public float valor;
	public String[] jogadores;
	public Atualizacao atualizacao;
	public Criador criador;
	
	public void divulgar() {
		System.out.printf("Jogo\n "
				+ ":: nome - %s\n "
				+ ":: ano de criação - %d\n "
				+ ":: quantidade de fases - %d\n "
				+ ":: ação - %s\n "
				+ ":: valor - %.2f\n "
				+ ":: quantidade de jogadores - %d\n",
				nome,
				anoCriacao,
				qtdeFase,
				acao ? "sim" : "não",
				valor,
				jogadores.length
			);
		
		atualizacao.divulgar();
		
		criador.divulgar();
	}	
}