package co.com.libisoft.mvcspringboot.service;

import java.util.List;

import co.com.libisoft.mvcspringboot.model.PersonaEntity;

public interface IPersonaService {

	public List<PersonaEntity> listarPersonas();
	public void guardar(PersonaEntity persona);
	public void eliminar(PersonaEntity persona);
	public PersonaEntity encontrarPersona(PersonaEntity persona);
	
}
