package lojaVirtualControllerJDBC;

import java.sql.Connection;
import java.util.List;

import lojaVirtualDAOJDBC.CategoriaDAO;
import lojaVirtualFactoryJDBC.ConnectionFactory;
import lojaVirtualModeloJDBC.Categoria;

public class CategoriaController {
	
	private CategoriaDAO categoriaDAO;
	
	public CategoriaController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		this.categoriaDAO = new CategoriaDAO(connection);
		
	}
	
	public List<Categoria> listar() {
		return this.categoriaDAO.listar();
	}
}
