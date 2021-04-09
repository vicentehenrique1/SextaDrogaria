package br.com.unialfa.Drogaria.Cliente.Repository;

import br.com.unialfa.Drogaria.Cliente.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}