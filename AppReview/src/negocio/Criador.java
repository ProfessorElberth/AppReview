package negocio;

public class Criador {

	public String empresa;
	public int anoFundacao;
	public float patrimonio;
	public Contato contato;
	
	public void divulgar() {
		System.out.printf("Criador\n "
				+ ":: empresa - %s\n "
				+ ":: ano de funda��o - %d\n "
				+ ":: patrim�nio - %.2f\n",
				empresa,
				anoFundacao,
				patrimonio
			);		
		
		contato.divulgar();
	}	
}