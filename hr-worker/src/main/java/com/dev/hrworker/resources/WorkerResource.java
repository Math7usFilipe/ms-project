package com.dev.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.hrworker.entities.Worker;
import com.dev.hrworker.repositories.WorkerRepository;

//API rodando por meio de webservices

@RestController //identificando como recurso wev para disponibilizar os endpoints
@RequestMapping(value = "/workers") // caminho padrao desse recurso
public class WorkerResource {
	
	//Endpoint
	@Autowired //injecao de dependencia de forma automatica
	private WorkerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
		//buscando todos os itens no banco de dados
		//instanciando e lista e devolvendo como list
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id){
		Worker obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}
