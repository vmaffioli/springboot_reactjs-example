package com.vmaffioli.minhasfinancas.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.vmaffioli.minhasfinancas.exceptions.RegraNegocioException;
import com.vmaffioli.minhasfinancas.model.entity.Usuario;
import com.vmaffioli.minhasfinancas.model.repository.UsuarioRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("teste")
public class UsuarioServiceTest {
	
	@Autowired
	UsuarioService service;
	
	@Autowired
	UsuarioRepository repository;
	
	@Test(expected = Test.None.class)
	public void deveValidarEmail() {
		//cenario
		repository.deleteAll();
		
		//execução
		service.validarEmail("email@email.com");
	}
	
	
	@Test(expected = RegraNegocioException.class)
	public void deveLancarErroAoValidarEmailQUandoExistirEMailCadastrado() {
		//cenario
		Usuario usuario = Usuario.builder().nome("usuario").email("email@email.com").build();
		repository.save(usuario);
		
		//execução
		service.validarEmail("email@email.com");
		
		
	}
}
