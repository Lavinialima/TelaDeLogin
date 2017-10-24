package etec.persistence;
import java.util.List;

public interface IDAO<T> {

	void inserir(T o) throws Exception;
	List<T> listar() throws Exception;
	
}
