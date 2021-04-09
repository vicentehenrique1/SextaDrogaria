package br.com.unialfa.Drogaria.Venda.Repository;

import br.com.unialfa.Drogaria.Venda.domain.Venda;
import org.springframework.data.repository.CrudRepository;

public interface VendaRepository extends CrudRepository<Venda, Long> {
}