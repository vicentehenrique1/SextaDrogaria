package br.com.unialfa.Drogaria.Funcionario.Repository;

import br.com.unialfa.Drogaria.Funcionario.domain.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
}