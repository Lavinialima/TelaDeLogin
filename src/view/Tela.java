package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import etec.Aplicacao;
import etec.model.Disciplina;
import etec.model.Pessoa;


public class Tela extends JFrame implements ActionListener{
	
	private Aplicacao app;
	private JButton btnEntrar, btnCadastrar;
	private JLabel  Titulo,Login,Senha;
	private JTextField login;
	private JPasswordField senha;
	
public Tela(Aplicacao app){
	ij();
	ic();
	this.app = app;
}
public void ic(){//metodo para iniciar os componentes da janela
		
		this.Titulo= new JLabel("Login");//criando
		this.Titulo.setBounds(20,20,getWidth()-30,50);//setando as propiedades de proporção
		this.Titulo.setHorizontalAlignment(SwingConstants.CENTER);//bota o alinhamento da lbl centralizada
		this.Titulo.setFont(new Font("Gabriola",0,55));///seta a fonte da letra na label 
		this.add(Titulo);
		//this.getContentPane().add(new JLabel(new ImageIcon("C:")));
		
		this.btnEntrar= new JButton("Entrar");
		this.btnEntrar.setBounds(200,245,140,50);// seta as propiedades do botao
		this.btnEntrar.setBackground(Color.GRAY);//colocando a cor do botao
		this.btnEntrar.setFont(new Font("Century Gotic",Font.BOLD,20));//setando a fonte do botao
		this.btnEntrar.setBorderPainted(false);// deixa sem as bordas .. arredondo as pontas do botao
		this.btnEntrar.setForeground(Color.WHITE);// COLOCANDO A COR DA LETRA DO BOTAO 
		this.btnEntrar.addActionListener(this);
		this.btnEntrar.setVisible(true); // Deixando visível.
		this.add(btnEntrar);// adiciona o botao na janela 
		
		this.btnCadastrar= new JButton("Cadastrar");
		this.btnCadastrar.setBounds(15,245,140,50);// seta as propiedades do botao
		this.btnCadastrar.setBackground(Color.GRAY);//colocando a cor do botao
		this.btnCadastrar.setFont(new Font("Century Gotic",Font.BOLD,20));//setando a fonte do botao
		this.btnCadastrar.setBorderPainted(false);// deixa sem as bordas .. arredondo as pontas do botao
		this.btnCadastrar.setForeground(Color.WHITE);// COLOCANDO A COR DA LETRA DO BOTAO 
		this.btnCadastrar.addActionListener(this);
		this.btnCadastrar.setVisible(true); // Deixando visível.
		this.add(btnCadastrar);// adiciona o botao na janela 
		

		
	}	
	
public void ij(){ // Método para iniciar a janela
		
		
		this.Login= new JLabel("Login :");//criando 
		this.Login.setBounds(15,100,160,50);//setando as propiedades de proporção
		this.Login.setFont(new Font("Gabriola",0,30));//setando a fonte e suas caracteristicas
		this.add(Login);
	
		this.login = new JTextField();//criando
		this.login.setBounds(90,105,250,35);//setando as propiedades proporcionais
		this.login.setBackground(new Color(190,201,201));
		this.login.setFont(new Font ("Century Gotic",0,18));//setando a font e suas caracteristicas
		this.login.setVisible (true); // Deixando visível.
		this.add(login);
	
		this.Senha= new JLabel("Senha :");//criando 
		this.Senha.setBounds(15,170,160,50);//setando as propiedades de proporção
		this.Senha.setFont(new Font("Gabriola",0,30));//setando a fonte e suas caracteristicas
		this.add(Senha);
		//15,170,160,50
	
		this.senha= new JPasswordField();//criando
		this.senha.setBounds(90,175,250,35);//setando as propiedades proporcionais
		this.senha.setBackground(new Color(190,201,201));
		this.senha.setFont(new Font ("Century Gotic",0,18));//setando a font e suas caracteristicas
		this.senha.setVisible (true); // Deixando visível.
		this.add(senha);
		
		//este método inicializa a informações da janela
		JFrame janela = new JFrame();
		this.setTitle("Janela de Login");//seta o titulo da janela
		this.setBounds(10,10,380,365);//seta as propiedades da janela
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//feha o programa ao ser clicado no 'x'
		this.setLocationRelativeTo(null);//centraliza a janela
		this.setLayout(null);//tira o layout automatico do java para que posssa ser feito manualmente	
		//this.setBackground();
		this.setResizable(false);
		this.setVisible(true);
		
	


this.btnEntrar.addActionListener(new ActionListener(){


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	String nomeDoUsuarioQueQuerLogar = Tela.this.login.getText(); 
	String senhaDoUsuarioQueQuerLogar = Tela.this.senha.getText();
	System.out.println();
	Aplicacao a = Tela.this.app;
	//List<Pessoa> usuariosCadastrados = Tela.this.app.getUsuariosCadastrados();
	
	for (Pessoa p : Tela.this.app.getUsuariosCadastrados()) {
		if(p.getLogin().equals(nomeDoUsuarioQueQuerLogar)) {
			Tela.this.app.getUsuariosLogados().add(p);
			System.out.println("Usuario logado com sucesso");
			System.out.println(p.getLogin());
			break;
		}//if
	}//for
//	System.out.println("Usuario ou Senha nao conferem!!!");
	
	}});
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}

	//);

		/*pegarValorTextField(login);
		dispose();
	    pegarValorTextField(senha);
		dispose();*/

