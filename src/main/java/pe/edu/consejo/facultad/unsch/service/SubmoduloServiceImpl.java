package pe.edu.consejo.facultad.unsch.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.consejo.facultad.unsch.dao.SubmoduloDao;
import pe.edu.consejo.facultad.unsch.entities.Submodulo;

@Service("submoduloService")
@Transactional
public class SubmoduloServiceImpl implements SubmoduloService {
	
	@Autowired
	private SubmoduloDao submoduloDao;

	@Override
	public List<Submodulo> listarPorPerfil(String usuario) {
		return submoduloDao.listarPorPerfil(usuario);
	}

}
