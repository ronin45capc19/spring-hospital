package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upn.demo.model.entity.Consultorio;
import pe.edu.upn.demo.model.repository.EspecialidadRepository;
import pe.edu.upn.demo.service.ConsultorioService;

public class EspecialidadServiceImpl implements ConsultorioService{
	
	@Autowired
	private EspecialidadRepository especialidadRepository;

	@Override
	public List<Consultorio> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Consultorio> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consultorio save(Consultorio entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consultorio update(Consultorio entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
