package negocio;

public class Atualizacao {
	public String motivo;
	public int ano;
	public int mes;
	
	public void divulgar() {
		System.out.printf("Atualiza��o\n "
				+ ":: motivo - %s\n "
				+ ":: ano - %d\n "
				+ ":: m�s - %d\n",
				motivo,
				ano,
				mes
			);		
	}
}