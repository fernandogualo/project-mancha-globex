package com.maco.juegosEnGrupo.server.rmi;
/*
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.SQLException;

import com.maco.clienteRMI.dominio.IClienteRMI;

import edu.uclm.esi.common.jsonMessages.JSONMessage;
import edu.uclm.esi.common.server.domain.Manager;
import edu.uclm.esi.common.server.domain.User;

public class ServidorRMI extends UnicastRemoteObject implements IServidorRMI {
	
	public static void main(String [] args){
		try {
			ServidorRMI servidor=new ServidorRMI();
		} catch (RemoteException | MalformedURLException
				| AlreadyBoundException e) {
			e.printStackTrace();
		}
	}

	protected ServidorRMI() throws RemoteException, MalformedURLException, AlreadyBoundException {
		super();
		LocateRegistry.createRegistry(2995);
		try{
			Naming.bind("rmi://127.0.0.1:2995/juegosEnGrupo", this);
		}
		catch (AlreadyBoundException ex){
			Naming.rebind("rmi://127.0.0.1:2995/juegosEnGrupo", this);
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void login(String email, String pwd, IClienteRMI cliente) throws RemoteException, SQLException, IOException  {
		Connection bd=User.identify(email, pwd);
		User user=new User(bd, email, JSONMessage.USER_RMI);
		Manager manager=Manager.get();
		manager.add(user, null);
	}

	@Override
	public void register(String email, String pwd1, String pwd2)
			throws RemoteException {
		// TODO Auto-generated method stub
		
	}
}
*/
