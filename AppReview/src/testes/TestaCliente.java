package testes;

import negocio.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		//Primeira instância
		Cliente c1 = new Cliente("joao", "12345678901", "centro", "rio de janeiro", "RJ");
		c1.exibir();
		
		//Segunda instância
		Cliente c2 = new Cliente("icarai", "niteroi", "RJ");
		c2.nome = "maria";
		c2.cpf = "98765432101";
		c2.exibir();
		
		//Terceira instância
		Cliente c3 = new Cliente();
		c3.exibir();
	}
}
