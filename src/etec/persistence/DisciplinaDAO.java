package etec.persistence;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import etec.model.Pessoa;

import etec.model.Disciplina;

public class DisciplinaDAO<T extends Disciplina> implements IDAO<T>{

        private Connection conn;

public DisciplinaDAO(Connection conn) {
		this.conn = conn;
	}
	
public void inserir(T o) throws Exception {
		String sql = "insert into disciplina (nome) values ('"+  ((Disciplina)o).getNome() +"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.execute();
		
	}
public List listar() throws Exception {
		return null;
	}
	
}
