package br.com.unialfa.Drogaria.Fabricante.business;


import br.com.unialfa.Drogaria.Fabricante.Repository.FabricanteRepository;
import br.com.unialfa.Drogaria.Fabricante.domain.Fabricante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.InputMismatchException;

@Service
public
class FabricanteBusiness {

    @Autowired
    private FabricanteRepository fabricanteRepository;

    public Iterable<Fabricante> listarFabricante()
    {
        return fabricanteRepository.findAll();
    }

    public void cadastrarFabricante( Fabricante fabricante ) {
       
            fabricanteRepository.save(fabricante);
       
        }
    

    public void editarFabricante( Fabricante fabricante ){

        fabricanteRepository.save(fabricante);
    }

    public @ResponseBody
    void deletarFabricante( long id){
        fabricanteRepository.deleteById(id);
    }
}