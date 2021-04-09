package br.com.unialfa.Drogaria.Cliente.business;

import br.com.unialfa.Drogaria.Cliente.Repository.ClienteRepository;
import br.com.unialfa.Drogaria.Cliente.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;



@Service
public class ClienteBusiness {

    @Autowired
    private ClienteRepository clienteRepository;

    public Iterable<Cliente> listarCliente()
    {
        return clienteRepository.findAll();
    }

    public void cadastrarCliente( Cliente cliente ) {
        clienteRepository.save(cliente);
    }


    public void editarCliente( Cliente cliente ){

        clienteRepository.save(cliente);
    }

    public @ResponseBody
    void deletarCliente( long id){
        clienteRepository.deleteById(id);
    }
}
