package com.hospedagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospedagem.entites.Funcionario;

public interface FuncionarioRepository  extends JpaRepository<Funcionario, Long>{

}
