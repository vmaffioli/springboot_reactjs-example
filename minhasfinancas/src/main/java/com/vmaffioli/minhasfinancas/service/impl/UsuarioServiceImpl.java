package com.vmaffioli.minhasfinancas.service.impl;

import com.vmaffioli.minhasfinancas.model.entity.Usuario;
import com.vmaffioli.minhasfinancas.model.repository.UsuarioRepository;
import com.vmaffioli.minhasfinancas.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService{

	private UsuarioRepository repository;
		
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	
	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		// TODO Auto-generated method stub
		
	}

}
