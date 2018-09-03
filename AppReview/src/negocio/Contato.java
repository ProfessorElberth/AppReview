package negocio;

public class Contato {
	public String email;
	public String telefone;
	
	public void divulgar() {
		System.out.printf("Contato\n "
				+ ":: e-mail - %s\n "
				+ ":: telefone - %s\n",
				email,
				telefone
			);		
	}
}