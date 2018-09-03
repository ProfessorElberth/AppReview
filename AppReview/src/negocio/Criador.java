package negocio;

public class Criador {

	public String empresa;
	public int anoFundacao;
	public float patrimonio;
	public Contato contato;
	
	public void divulgar() {
		System.out.printf("Criador\n "
				+ ":: empresa - %s\n "
				+ ":: ano de fundação - %d\n "
				+ ":: patrimônio - %.2f\n",
				empresa,
				anoFundacao,
				patrimonio
			);		
		
		contato.divulgar();
	}	
}