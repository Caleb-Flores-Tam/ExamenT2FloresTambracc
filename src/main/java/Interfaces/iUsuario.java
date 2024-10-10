package Interfaces;

import model.TblUsuariocl2;
import java.util.List;

public interface iUsuario {

	void RegistrarUsuario(TblUsuariocl2 usuario);
	void ActualizarUsuario(TblUsuariocl2 usuario);
	void EliminarUsuario(TblUsuariocl2 usuario);
	List<TblUsuariocl2> ListarUsuario();
	TblUsuariocl2 BuscarUsuario(TblUsuariocl2 usuario);
	
}
