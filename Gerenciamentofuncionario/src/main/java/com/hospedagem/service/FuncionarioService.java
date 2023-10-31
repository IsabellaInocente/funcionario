package com.hospedagem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospedagem.entites.Funcionario;
import com.hospedagem.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	private final FuncionarioRepository funcionarioRepository;
	
	@Autowired
	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}
	public List<Funcionario> buscaTodosFuncionario(){
		return funcionarioRepository.findAll();
	}
	
	public Funcionario buscaFuncionarioId(Long id) {
		Optional <Funcionario> Funcionario = funcionarioRepository.findById(id);
		return Funcionario.orElse(null);
	}
	
	public Funcionario salvaFuncionario(Funcionario Funcionario) {
		return funcionarioRepository.save(Funcionario);
	}
	public Funcionario alterarFuncionario(Long id, Funcionario alterarU) {
		Optional <Funcionario> existeFuncionario = funcionarioRepository.findById(id);
		if(existeFuncionario.isPresent()) {
			alterarU.setId(id);
			return funcionarioRepository.save(alterarU);
		}
		return null;
	}
	public boolean apagarFuncionario(Long id) {
		Optional <Funcionario> existeFuncionario = funcionarioRepository.findById(id);
		if (existeFuncionario.isPresent()) {
			funcionarioRepository.deleteById(id);
			return true;
		}
		return false;
	}

}
