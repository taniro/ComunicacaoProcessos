package tads.eaj.ufrn.rmi.cliente;

import tads.eaj.ufrn.rmi.RepeteInterface;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RepeteClient {
	
	public static void main(String[] args) {
		try {

			Registry registry = LocateRegistry.getRegistry();
			RepeteInterface objRemoto = (RepeteInterface) registry.lookup("rmi://localhost/SERVIDOR");
			String mensagem = "ola mundo";
			System.out.println("Nova frase : "+ objRemoto.atualiza(mensagem));
		} catch (Exception e) {
			System.out.println("Erro no cliente:"+ e);
		}
	}

}
