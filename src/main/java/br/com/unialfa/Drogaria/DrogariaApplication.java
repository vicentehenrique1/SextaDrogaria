package br.com.unialfa.Drogaria;

import br.com.unialfa.Drogaria.Cliente.Repository.ClienteRepository;
import br.com.unialfa.Drogaria.Cliente.domain.Cliente;
import br.com.unialfa.Drogaria.Fabricante.Repository.FabricanteRepository;
import br.com.unialfa.Drogaria.Funcionario.Repository.FuncionarioRepository;
import br.com.unialfa.Drogaria.Produto.Repository.ProdutoRepository;
import br.com.unialfa.Drogaria.Venda.Repository.VendaRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class DrogariaApplication {
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private FabricanteRepository fabricanteRepository;
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private VendaRepository vendaRepository;

	public static void main(String[] args) {
		SpringApplication.run(DrogariaApplication.class, args);
	}

	@Bean
	InitializingBean sendDatabase() {
		Cliente cliente = new Cliente();
		cliente.setNome("ClienteTeste");
		cliente.setCpf("111.111.111-11");
		cliente.setDataNascimento(LocalDate.now());
		cliente.setVersao(1);
		cliente.setPrimeiroNome("Teste");
		clienteRepository.save(cliente);


		return null;

}
}