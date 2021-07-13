package tads.eaj.ufrn.rmi;

import java.rmi.*;

public interface RepeteInterface extends Remote{
	public String atualiza(String s) throws RemoteException;
}
