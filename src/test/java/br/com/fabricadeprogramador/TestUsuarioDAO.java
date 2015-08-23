package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
	}
	
	public static void testCadastrar(){

		Usuario usu = new Usuario();
		usu.setNome("Jorge Pinto");
		usu.setLogin("jp");
		usu.setSenha("214");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("cadastrado com sucesso!!");
	}
	
	public static void testAlterar(){

		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Carlos Freitas");
		usu.setLogin("cf");
		usu.setSenha("789");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("Alterado com sucesso!!");
	}
	
	public static void testExcluir(){

		Usuario usu = new Usuario();
		usu.setId(1);
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("Excluido com sucesso!!");
	}

}
