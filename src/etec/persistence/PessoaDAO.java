package etec.persistence;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import etec.model.Pessoa;

public class PessoaDAO<T extends Pessoa> implements IDAO<T>{
	
	Connection conn;
	
	public PessoaDAO(Connection conn) {
		this.conn = conn;
	}
	
public void inserir(T o) throws Exception {
		String sql = "insert into pessoa (nome) values ('"+   ((Pessoa)o).getLogin()    +"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.execute();		
	}

public List listar() throws Exception {
		return null;
	}
}
