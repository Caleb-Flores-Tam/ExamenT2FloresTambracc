package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.iProveedor;
import model.TblProveedorcl2;


public class ProveedorImp implements iProveedor{

	public void RegistrarProveedor(TblProveedorcl2 producto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LP2_CL2_FLORESTAMBRACC");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(producto);
			em.getTransaction().commit();
			
			
		} catch (RuntimeException e) {
			e.getMessage();
		}finally{
			em.close();
		}
	}

	public void ActualizarProveedor(TblProveedorcl2 producto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LP2_CL2_FLORESTAMBRACC");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.merge(producto);
			em.getTransaction().commit();
			
			
		} catch (RuntimeException e) {
			e.getMessage();
		}finally{
			em.close();
		}
		
	}

	public void EliminarProveedor(TblProveedorcl2 producto) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_CL2_FLORESTAMBRACC");
		EntityManager em=emf.createEntityManager();
		
		try{
		em.getTransaction().begin();
		TblProveedorcl2 tbpro=em.find(TblProveedorcl2.class,producto.getIdProveedorCL2());
		if(tbpro!=null){
			em.remove(tbpro);
			em.getTransaction().commit();
		}
		}catch(RuntimeException e){
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			e.getMessage();
		}finally {
			em.close();
		}
	}

	public List<TblProveedorcl2> ListaProveedor() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LP2_CL2_FLORESTAMBRACC");
		EntityManager em = emf.createEntityManager();
		List<TblProveedorcl2> listado=null;
		
		try {
			em.getTransaction().begin();
			listado = em.createQuery("select c from TblProveedorcl2 c", TblProveedorcl2.class).getResultList();
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			if(em.getTransaction().isActive()){
				em.getTransaction().rollback();
			}
			e.getMessage();
		}finally{
			em.close();
		}
		
		
		return listado;
	}

	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 producto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LP2_CL2_FLORESTAMBRACC");
		EntityManager em = emf.createEntityManager();
		TblProveedorcl2 buscarprovee = null;
		try {
			em.getTransaction().begin();
			buscarprovee = em.find(TblProveedorcl2.class,producto.getIdProveedorCL2());
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			e.getMessage();
		}finally{
			em.close();
		}
		return buscarprovee;
	}

}
