package br.com.cadastrar_links.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.cadastrar_links.model.Links;
import br.com.cadastrar_links.repository.LinksRepository;

@RestController
@RequestMapping("/links")
public class LinksController {

	@Autowired
	LinksRepository linksRepository; //injecao de dependencia da Interface
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Links> listar(){
		return linksRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Links cadastrar(@RequestBody Links links) {
		return linksRepository.save(links);
	}
	
}
