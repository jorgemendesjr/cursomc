package br.com.jorgemendesjr.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jorgemendesjr.cursomc.domain.Cliente;
import br.com.jorgemendesjr.cursomc.repositories.ClienteRepository;
import br.com.jorgemendesjr.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService 
{
	@Autowired
	private ClienteRepository repository;
	
	public Cliente buscar(Integer id)
	{
		Cliente obj = repository.findOne(id);
		if (obj == null)
		{
			throw new ObjectNotFoundException("Cliente " + id + " não encontrado !");
		}
		return obj;
	}

}
