package pe.edu.FinalFinache.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.FinalFinache.models.entity.Usuario;
import pe.edu.FinalFinache.models.repository.UsuarioRepository;
import pe.edu.FinalFinache.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() throws Exception {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuario> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id);
	}

	@Override
	@Transactional
	public Usuario save(Usuario t) throws Exception {
		// TODO Auto-generated method stub
		return usuarioRepository.save(t);
	}

	@Override
	@Transactional
	public Usuario update(Usuario t) throws Exception {
		// TODO Auto-generated method stub
		return usuarioRepository.save(t);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		usuarioRepository.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		usuarioRepository.deleteAll();
	}

}
