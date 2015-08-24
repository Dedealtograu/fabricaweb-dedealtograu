package br.com.fabricadeprogramador;

import java.util.List;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testAutenticar();
	}
	
	private static void testAutenticar() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usu = new Usuario();
		usu.setLogin("jb");
		usu.setSenha("567");
		Usuario usuRetorno = usuarioDAO.autenticar(usu);
		
		System.out.println(usuRetorno);
	}

	private static void testBuscaPorId() {
		UsuarioDAO usuDAO = new UsuarioDAO();
		Usuario usuario = usuDAO.buscaPorId(2);
		System.out.println(usuario);
	}
	
	private static void testBuscaTodos() {
		UsuarioDAO usuDAO = new UsuarioDAO();
		List<Usuario> lista = usuDAO.buscaTodos();
		for(Usuario u : lista){
			System.out.println(u);
		}
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
	
	public static void testSalvar() {
		Usuario usuario = new Usuario();
		usuario.setId(2);
		usuario.setNome("Maria de Souza");
		usuario.setLogin("ms");
		usuario.setSenha("123");
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
		
		System.out.println("Salvo com Sucesso");
	}
	
}



















