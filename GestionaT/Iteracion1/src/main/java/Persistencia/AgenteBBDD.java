package Persistencia;

import java.awt.List;
import java.sql.*;
import java.util.LinkedList;
import java.util.Vector;

public class AgenteBBDD {

	protected static AgenteBBDD mInstancia = null;

	protected static Connection mBD;

	private static String url = "jdbc:mysql://manchaglobexuclm.ddns.net:3306/GestionaT";

	private static String driver = "com.mysql.jdbc.Driver";

	public AgenteBBDD() throws Exception {
		conectar();

	}

	public static AgenteBBDD getAgente() throws Exception {
		if (mInstancia == null) {
			mInstancia = new AgenteBBDD();
		}
		return mInstancia;
	}

	private void conectar() throws Exception {
		Class.forName(driver);
		mBD = DriverManager.getConnection(url, "root", "toor");
	}

	public void desconectar() throws Exception {
		mBD.close();
	}

	public int insert(String SQL) throws SQLException, Exception {
		conectar();
		PreparedStatement stmt = mBD.prepareStatement(SQL);
		int res = stmt.executeUpdate();
		stmt.close();
		desconectar();
		return res;
	}

	public int delete(String SQL) throws SQLException, Exception {
		PreparedStatement stmt = mBD.prepareStatement(SQL);
		int res = stmt.executeUpdate();
		// stmt.close();
		// desconectar();
		return res;
	}

	public int update(String SQL) throws SQLException, Exception {
		conectar();
		PreparedStatement stmt = mBD.prepareStatement(SQL);
		int res = stmt.executeUpdate();
		// stmt.close();
		// desconectar();
		return res;
	}

	public ResultSet select(String SQL) throws SQLException, Exception {
		conectar();
		PreparedStatement stmt = mBD.prepareStatement(SQL);
		ResultSet rs = stmt.executeQuery();
		// stmt.close();
		// desconectar();
		return rs;
	}

}
