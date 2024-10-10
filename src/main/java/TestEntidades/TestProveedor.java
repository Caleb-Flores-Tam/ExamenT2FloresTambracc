package TestEntidades;

import java.util.Date;
import java.util.List;

import Dao.ProveedorImp;
import model.TblProveedorcl2;

public class TestProveedor {

	public static void main(String[] args) {
		//Valores publicos
				TblProveedorcl2 tblpro = new TblProveedorcl2();
				ProveedorImp imppro = new ProveedorImp();
				/*
				
				//Método agregar
				
				tblpro.setNomProveeCL2("Pepito");
				tblpro.setRUCProveeCL2("98765432111");
				tblpro.setRSocialProveeCL2("Gloria");
				tblpro.setEmailProveeCL2("Gloria@empresa.com.pe");
				Date fecha = new Date();
				Date fechasql = new Date(fecha.getTime());
				tblpro.setFeingProveeCL2(fechasql);
				
				imppro.RegistrarProveedor(tblpro);
				System.out.println("Datos Registrados");
				
				
				
				
				 		
				
				//----------------------------------
				tblpro.setIdProveedorCL2(1);
				tblpro.setNomProveeCL2("Miguel");
				tblpro.setRUCProveeCL2("98765432111");
				tblpro.setRSocialProveeCL2("Gloria");
				tblpro.setEmailProveeCL2("Gloria@empresa.com.pe");
				Date fecha = new Date();
				Date fechasql = new Date(fecha.getTime());
				tblpro.setFeingProveeCL2(fechasql);
				
				imppro.ActualizarProveedor(tblpro);
				System.out.println("Datos Registrados");
				
				
				
				//----------------------------------
				//Método Eliminar
				
				tblpro.setIdProveedorCL2(1);
				
				imppro.EliminarProveedor(tblpro);
				System.out.println("Dato Eliminado ");
				
				
				
				
				//----------------------------------
				//Método Listado
				
				List<TblProveedorcl2> lista  = imppro.ListaProveedor();
				
				
				//bucle 
				for(TblProveedorcl2 lis:lista){
					System.out.println("------------Codigo------------"+ lis.getIdProveedorCL2()+ "\n" +
										" Nombre "+lis.getNomProveeCL2()+"\n" +
										" RUC "+lis.getRUCProveeCL2()+"\n"+
										" Razon Social " + lis.getRSocialProveeCL2()+"\n"+
										" Email "+ lis.getEmailProveeCL2()+"\n"+
										" Fecha.. "+ lis.getFeingProveeCL2());
					
				}
				
				*/
				//----------------------------------
				//Método para buscar
				tblpro.setIdProveedorCL2(2);
				TblProveedorcl2 buscapro = imppro.BuscarProveedor(tblpro);
				

				System.out.println("------------Codigo------------"+ buscapro.getIdProveedorCL2()+ "\n" +
						" Nombre -"+buscapro.getNomProveeCL2()+"\n" +
						" RUC -"+buscapro.getRUCProveeCL2()+"\n"+
						" Razon Social -" + buscapro.getRSocialProveeCL2()+"\n"+
						" Email -"+ buscapro.getEmailProveeCL2()+"\n"+
						" Fecha.. "+ buscapro.getFeingProveeCL2());
				
		

	}

}
