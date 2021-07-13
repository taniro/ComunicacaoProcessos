package tads.eaj.ufrn.rmi.servidor;

import tads.eaj.ufrn.rmi.RepeteInterface;

import java.rmi.RemoteException;

public class RepeteImpl implements RepeteInterface {
	
	public RepeteImpl() throws RemoteException{
		// TODO Auto-generated constructor stub
	}

	@Override
	public String atualiza (String s) throws RemoteException{
		return s.toUpperCase();
	}

}
