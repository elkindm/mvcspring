package co.com.libisoft.mvcspringboot.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.libisoft.mvcspringboot.model.PersonaEntity;

/**
 * 
 * @author elkin
 *<h1>Repositorio del entity persona</h1>
 */
public interface IPersonaDao extends CrudRepository<PersonaEntity, Long> {

}
