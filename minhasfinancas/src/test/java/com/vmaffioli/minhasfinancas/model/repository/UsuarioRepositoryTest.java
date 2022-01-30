package com.vmaffioli.minhasfinancas.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.vmaffioli.minhasfinancas.model.entity.Usuario;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("teste")
public class UsuarioRepositoryTest {
	
	@Autowired
	UsuarioRepository repository;
		
	@Test
	public void deveVerificarAExistenciaDeUmEmail() {
		//cenario
		Usuario usuario = Usuario.builder().nome("usuario").email("usuario@email.com").build();
		repository.save(usuario);
		
		//execução
		boolean result = repository.existsByEmail("usuario@email.com");
		
		//verificação
		Assertions.assertThat(result).isTrue();
		
	}
	
	@Test
	public void deveRetornarFalsoQuandoNaoHouveUsuarioCadastradoComOEmail() {
		//cenario
		repository.deleteAll();
		
		//execução
		boolean result = repository.existsByEmail("usuario@email.com");
		
		//verificação
		Assertions.assertThat(result).isFalse();
		
	}

}
