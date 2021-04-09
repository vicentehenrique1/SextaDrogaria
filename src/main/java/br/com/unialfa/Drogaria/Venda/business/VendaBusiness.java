package br.com.unialfa.Drogaria.Venda.business;


import br.com.unialfa.Drogaria.Venda.Repository.VendaRepository;
import br.com.unialfa.Drogaria.Venda.domain.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.InputMismatchException;

@Service
public class VendaBusiness {

    @Autowired
    private VendaRepository vendaRepository;

    public Iterable<Venda> listarVenda()
    {
        return vendaRepository.findAll();
    }

    public void cadastrarVenda( Venda venda ) {

            vendaRepository.save(venda);

    }

    public void editarVenda( Venda venda ){

        vendaRepository.save(venda);
    }

    public @ResponseBody
    void deletarVenda( long id){
        vendaRepository.deleteById(id);
    }
}