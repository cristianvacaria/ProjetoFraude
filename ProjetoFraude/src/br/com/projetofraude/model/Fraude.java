package br.com.projetofraude.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.*;

@Entity
@Table(name = "fraude")
public class Fraude implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer id_fraude;
	
	@Column
	private Integer id_consumidor;
	
	@Column
	private String tipo;
	
	@Column(length = 20)
	private String status;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date data_deteccao;
	
	public Fraude() {
		this.id_fraude = 0;
		this.id_consumidor = 0;
		this.tipo = "";
		this.status = "";
		this.data_deteccao = null;
	}

	public Integer getId_fraude() {
		return id_fraude;
	}

	public void setId_fraude(Integer id_fraude) {
		this.id_fraude = id_fraude;
	}

	public Integer getId_consumidor() {
		return id_consumidor;
	}

	public void setId_consumidor(Integer id_consumidor) {
		this.id_consumidor = id_consumidor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getData_deteccao() {
		return data_deteccao;
	}

	public void setData_deteccao(Date data) {
		this.data_deteccao = data;
	}
	public void clear() {
		this.id_fraude = 0;
		this.id_consumidor = 0;
		this.tipo = "";
		this.status = "";
		this.data_deteccao = null;
	}
	
	@Override
	public String toString() {
		return " ID = " + id_fraude +
				"\n ID Consumidor = " + id_consumidor +
				"\n Tipo = " + tipo +
				"\n Status = " + status + 
				"\n Data = " + data_deteccao;
	}


}
