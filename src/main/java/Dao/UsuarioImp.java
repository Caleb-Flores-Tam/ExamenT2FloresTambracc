package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.iUsuario;
import model.TblUsuariocl2;

public class UsuarioImp implements iUsuario{

	public void RegistrarUsuario(TblUsuariocl2 usuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LP2_CL2_FLORESTAMBRACC");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(usuario);
			em.getTransaction().commit();
			
			
		} catch (RuntimeException e) {
			e.getMessage();
		}finally{
			em.close();
		}
		
	}

	public void ActualizarUsuario(TblUsuariocl2 usuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LP2_CL2_FLORESTAMBRACC");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.merge(usuario);
			em.getTransaction().commit();
			
			
		} catch (RuntimeException e) {
			e.getMessage();
		}finally{
			em.close();
		}
	}

	public void EliminarUsuario(TblUsuariocl2 usuario) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_CL2_FLORESTAMBRACC");
		EntityManager em=emf.createEntityManager();
		
		try{
		em.getTransaction().begin();
		TblUsuariocl2 tbusu=em.find(TblUsuariocl2.class,usuario.getIdUsuarioCL2());
		if(tbusu!=null){
			em.remove(tbusu);
			em.getTransaction().commit();
		}
		}catch(RuntimeException e){
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			e.getMessage();
		}finally {
			em.close();
		}
		
	}

	public List<TblUsuariocl2> ListarUsuario() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LP2_CL2_FLORESTAMBRACC");
		EntityManager em = emf.createEntityManager();
		List<TblUsuariocl2> listado=null;
		
		try {
			em.getTransaction().begin();
			listado = em.createQuery("select c from TblUsuariocl2 c", TblUsuariocl2.class).getResultList();
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

	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 usuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LP2_CL2_FLORESTAMBRACC");
		EntityManager em = emf.createEntityManager();
		TblUsuariocl2 buscarusuario = null;
		try {
			em.getTransaction().begin();
			buscarusuario = em.find(TblUsuariocl2.class,usuario.getIdUsuarioCL2());
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			e.getMessage();
		}finally{
			em.close();
		}
		return buscarusuario;
	}

}
