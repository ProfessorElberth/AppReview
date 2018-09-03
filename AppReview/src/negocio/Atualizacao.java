package negocio;

public class Atualizacao {
	public String motivo;
	public int ano;
	public int mes;
	
	public void divulgar() {
		System.out.printf("Atualização\n "
				+ ":: motivo - %s\n "
				+ ":: ano - %d\n "
				+ ":: mês - %d\n",
				motivo,
				ano,
				mes
			);		
	}
}