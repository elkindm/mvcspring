package co.com.libisoft.mvcspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.libisoft.mvcspringboot.dao.IPersonaDao;
import co.com.libisoft.mvcspringboot.model.PersonaEntity;

@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	private IPersonaDao personaDao;

	@Override
	@Transactional(readOnly = true)
	public List<PersonaEntity> listarPersonas() {
		
		return (List<PersonaEntity>) personaDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(PersonaEntity persona) {
		personaDao.save(persona);
		
	}

	@Override
	@Transactional
	public void eliminar(PersonaEntity persona) {
		personaDao.delete(persona);
		
	}

	@Override
	@Transactional(readOnly = true)
	public PersonaEntity encontrarPersona(PersonaEntity persona) {
		return personaDao.findById(persona.getId()).orElse(null);
	}

}
