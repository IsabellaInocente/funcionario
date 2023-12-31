package com.hospedagem.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String Nome;
	
	@NotNull
	private String rg;
	
	@NotNull
	private String cpf;
	
	@NotNull
	private String endereco;
	
	@NotNull
	private String telefone;
	
	@NotNull
	private String cargo;
	
	@NotNull
	private double salario;
}
