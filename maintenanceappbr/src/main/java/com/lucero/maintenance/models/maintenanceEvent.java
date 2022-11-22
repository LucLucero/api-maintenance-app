package com.lucero.maintenance.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Table_Events")
public class maintenanceEvent implements Serializable {
	
	private static final long serialversionUID = 1;
	
	@Id	
	@GeneratedValue (strategy=GenerationType.AUTO)	
	private long id;
	
	private String data;
	
	private String local1; 
	
	private String local2;
	
	private String tag;
	
	private String equipamento;
	
	private String descricao;	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getLocal1() {
		return local1;
	}

	public void setLocal1(String local1) {
		this.local1 = local1;
	}

	public String getLocal2() {
		return local2;
	}

	public void setLocal2(String local2) {
		this.local2 = local2;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setD(String descricao) {
		this.descricao = descricao;
	}

	
	public static long getSerialversionuid() {
		return serialversionUID;
	}
	
	
}
