package TestEntidades;

import java.util.List;

import Dao.UsuarioImp;
import model.TblProveedorcl2;
import model.TblUsuariocl2;

public class TestUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblUsuariocl2 tblusu = new TblUsuariocl2();
		UsuarioImp impusu = new UsuarioImp();
		

		/*
		//M�todo Agregar
		tblusu.setUsuarioCL2("Jueves");
		tblusu.setPasswordCL2("Jueves123");
		
		impusu.RegistrarUsuario(tblusu);
		System.out.println("Datos agregados");
		
		
		
		//M�todo para Actualizar
		tblusu.setIdUsuarioCL2(2);
		tblusu.setUsuarioCL2("Jireh");
		tblusu.setPasswordCL2("caleb123");
		
		impusu.ActualizarUsuario(tblusu);
		System.out.println("Datos Actualizados");

		
		
		//M�todo para Eliminar
		
		tblusu.setIdUsuarioCL2(1);
		
		impusu.EliminarUsuario(tblusu);
		System.out.println("Dato Eliminado");
		
		
		
		//M�todo para Listado
		
		List<TblUsuariocl2> lista = impusu.ListarUsuario();
		
		//bucle
		for(TblUsuariocl2 lis:lista){
			System.out.println("-----------Codigo "+lis.getIdUsuarioCL2()+"-----------"+"\n"+
								" Usuario "+lis.getUsuarioCL2()+"\n"+
								" Password "+lis.getPasswordCL2());
		}
		
		*/
		
		//M�todo para Buscar
		tblusu.setIdUsuarioCL2(2);
		TblUsuariocl2 busca = impusu.BuscarUsuario(tblusu);
		
				System.out.println("-----------Codigo "+busca.getIdUsuarioCL2()+"-----------"+"\n"+
				" Usuario "+busca.getUsuarioCL2()+"\n"+
				" Password "+busca.getPasswordCL2());
		
				/**/
		
	}

}
