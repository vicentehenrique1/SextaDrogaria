package br.com.unialfa.Drogaria.Funcionario.service;


import br.com.unialfa.Drogaria.Funcionario.business.FuncionarioBusiness;
import br.com.unialfa.Drogaria.Funcionario.domain.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioBusiness funcionarioBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Funcionario> listarFuncionario(){

        return funcionarioBusiness.listarFuncionario();
    }

    @PostMapping(path = "/add")
    public void cadastrarFuncionario( @RequestBody Funcionario funcionario ){

        funcionarioBusiness.cadastrarFuncionario(funcionario);
    }

    @PutMapping(path = "/edit")
    public void editarFuncionario( @RequestBody Funcionario funcionario ){

        funcionarioBusiness.editarFuncionario(funcionario);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarFuncionario(@PathVariable(name = "id") long id){

        funcionarioBusiness.deletarFuncionario(id);
    }


}
