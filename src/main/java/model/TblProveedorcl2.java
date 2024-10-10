package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_proveedorcl2 database table.
 * 
 */
@Entity
@Table(name="tbl_proveedorcl2")
@NamedQuery(name="TblProveedorcl2.findAll", query="SELECT t FROM TblProveedorcl2 t")
public class TblProveedorcl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProveedorCL2;

	private String emailProveeCL2;

	@Temporal(TemporalType.DATE)
	private Date feingProveeCL2;

	private String nomProveeCL2;

	private String RSocialProveeCL2;

	private String RUCProveeCL2;

	public TblProveedorcl2() {
	}

	public int getIdProveedorCL2() {
		return this.idProveedorCL2;
	}

	public void setIdProveedorCL2(int idProveedorCL2) {
		this.idProveedorCL2 = idProveedorCL2;
	}

	public String getEmailProveeCL2() {
		return this.emailProveeCL2;
	}

	public void setEmailProveeCL2(String emailProveeCL2) {
		this.emailProveeCL2 = emailProveeCL2;
	}

	public Date getFeingProveeCL2() {
		return this.feingProveeCL2;
	}

	public void setFeingProveeCL2(Date feingProveeCL2) {
		this.feingProveeCL2 = feingProveeCL2;
	}

	public String getNomProveeCL2() {
		return this.nomProveeCL2;
	}

	public void setNomProveeCL2(String nomProveeCL2) {
		this.nomProveeCL2 = nomProveeCL2;
	}

	public String getRSocialProveeCL2() {
		return this.RSocialProveeCL2;
	}

	public void setRSocialProveeCL2(String RSocialProveeCL2) {
		this.RSocialProveeCL2 = RSocialProveeCL2;
	}

	public String getRUCProveeCL2() {
		return this.RUCProveeCL2;
	}

	public void setRUCProveeCL2(String RUCProveeCL2) {
		this.RUCProveeCL2 = RUCProveeCL2;
	}

}