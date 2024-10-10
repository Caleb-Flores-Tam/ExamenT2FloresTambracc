package Interfaces;

import java.util.List;

import model.TblProveedorcl2;

public interface iProveedor {

	void RegistrarProveedor(TblProveedorcl2 producto);
	void ActualizarProveedor(TblProveedorcl2 producto);
	void EliminarProveedor(TblProveedorcl2 producto);
	List<TblProveedorcl2> ListaProveedor();
	TblProveedorcl2 BuscarProveedor(TblProveedorcl2 producto);
	
	
	
}
