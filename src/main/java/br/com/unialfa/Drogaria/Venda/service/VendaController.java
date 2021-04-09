package br.com.unialfa.Drogaria.Venda.service;


import br.com.unialfa.Drogaria.Venda.business.VendaBusiness;
import br.com.unialfa.Drogaria.Venda.domain.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/venda")
public class VendaController {

    @Autowired
    private VendaBusiness vendaBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Venda> listarVenda(){

        return vendaBusiness.listarVenda();
    }

    @PostMapping(path = "/add")
    public void cadastrarVenda( @RequestBody Venda venda ){

        vendaBusiness.cadastrarVenda(venda);
    }

    @PutMapping(path = "/edit")
    public void editarVenda( @RequestBody Venda venda ){

        vendaBusiness.editarVenda(venda);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarVenda(@PathVariable(name = "id") long id){

        vendaBusiness.deletarVenda(id);
    }


}
