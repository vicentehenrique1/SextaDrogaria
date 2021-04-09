package br.com.unialfa.Drogaria.Produto.Repository;

import br.com.unialfa.Drogaria.Produto.domain.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}