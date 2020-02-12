package oiasso.system.examples.jpa.datatables.facade;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import oiasso.system.examples.jpa.datatables.beans.Persona;

public interface PersonaFacade {

	List<Persona> obtenerTodasLasPersonas();

	Persona obtenerPersona(Integer id);

	Persona crearPersona(Persona persona);

	void borrarPersona(Integer id);

	Persona actualizarPersona(Integer id, Persona persona);

	/**
	 * Metodo con paginacion
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	Page<Persona> getAllPersona(Pageable pageable);

	List<Persona> buscarEntreDosId(Integer inicio, Integer fin);

	List<Persona> buscarEntreDosFechas(LocalDate inicio, LocalDate fin);
}
