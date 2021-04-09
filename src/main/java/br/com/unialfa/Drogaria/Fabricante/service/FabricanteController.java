package br.com.unialfa.Drogaria.Fabricante.service;


import br.com.unialfa.Drogaria.Fabricante.business.FabricanteBusiness;
import br.com.unialfa.Drogaria.Fabricante.domain.Fabricante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/fabricante")
public class FabricanteController {

    @Autowired
    private FabricanteBusiness fabricanteBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Fabricante> listarFabricante(){

        return fabricanteBusiness.listarFabricante();
    }

    @PostMapping(path = "/add")
    public void cadastrarFabricante( @RequestBody Fabricante fabricante ){

        fabricanteBusiness.cadastrarFabricante(fabricante);
    }

    @PutMapping(path = "/edit")
    public void editarFabricante( @RequestBody Fabricante fabricante ){

        fabricanteBusiness.editarFabricante(fabricante);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarFabricante(@PathVariable(name = "id") long id){

        fabricanteBusiness.deletarFabricante(id);
    }


}
