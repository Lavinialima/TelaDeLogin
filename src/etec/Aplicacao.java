package etec;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import etec.model.Disciplina;
import etec.model.Pessoa;
import etec.persistence.ConexaoFactory;
import etec.persistence.DisciplinaDAO;
import etec.persistence.PessoaDAO;
import view.Tela;

public class Aplicacao {
	private List<Pessoa> usuariosCadastrados = new ArrayList<Pessoa>();
	private List<Pessoa> usuariosLogados = new ArrayList<Pessoa>();
	private Pessoa usuarioLogado;

public Aplicacao(){
	this.usuariosCadastrados.add(new Pessoa("Lavínia"));
	this.Tela();
}
public List<Pessoa> getUsuariosCadastrados() {
	System.out.println("public List<Pessoa> getUsuariosCadastrados() {..." + this.usuariosCadastrados.size());
	return usuariosCadastrados;
}
public List<Pessoa> getUsuariosLogados() {
	System.out.println("public List<Pessoa> getUsuariosCadastrados() {..." + this.usuariosCadastrados.size());
	return usuariosCadastrados;
}

private void Tela() {
	// TODO Auto-generated method stub
	
}

	public static void main(String[] args) throws Exception {
		
		Tela T = new Tela(null);
		Connection mysqlConnection = new ConexaoFactory().getMysqlConnection();
		
		PessoaDAO pessoaDAO = new PessoaDAO(mysqlConnection);		
		Pessoa pessoa1 = new Pessoa("Lavínia");		
		
		Disciplina dPCII = new Disciplina();
		dPCII.setNome("PCII");
		
		DisciplinaDAO discDAO = new DisciplinaDAO(mysqlConnection);
		
		pessoaDAO.inserir(pessoa1);
		discDAO.inserir(dPCII);		
	}
}
