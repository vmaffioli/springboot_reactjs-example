package com.vmaffioli.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vmaffioli.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
