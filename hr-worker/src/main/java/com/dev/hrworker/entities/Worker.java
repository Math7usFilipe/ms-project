package com.dev.hrworker.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //mapeamento Jpa para que seja mapeado como tabela
@Table(name = "tb_worker")
public class Worker implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id //id será a chave primaria da entidade
	@GeneratedValue(strategy = GenerationType.IDENTITY) // faz com o id seja gerado de forma automatica pelo banco de dados
	private Long id;
	private String name;
	private Double dailyIncome;
	
	public Worker() {}

	public Worker(Long id, String name, Double dailyIncome) {
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
}
