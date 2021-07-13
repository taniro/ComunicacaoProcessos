package tads.eaj.ufrn.rmi.servidor;

import tads.eaj.ufrn.rmi.RepeteInterface;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RepeteServer {

	public static void main(String[] argv) {
		try {

			RepeteInterface stub = new RepeteImpl();
			UnicastRemoteObject.exportObject(stub, 1099);
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind("rmi://localhost/SERVIDOR", stub);

			System.out.println("Servidor está pronto.");


		} catch (Exception e) {
			System.out.println("Servidor falhou: " + e);
		}
	}
}
