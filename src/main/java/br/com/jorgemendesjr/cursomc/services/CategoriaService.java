package br.com.jorgemendesjr.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jorgemendesjr.cursomc.domain.Categoria;
import br.com.jorgemendesjr.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService 
{
	@Autowired
	private CategoriaRepository repositorio;
	
	public Categoria buscar(Integer id)
	{
		Categoria obj = repositorio.findOne(id);
		
		return obj;
	}

}
