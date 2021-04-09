package br.com.unialfa.Drogaria.Produto.service;


import br.com.unialfa.Drogaria.Produto.business.ProdutoBusiness;
import br.com.unialfa.Drogaria.Produto.domain.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoBusiness produtoBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Produto> listarProduto(){

        return produtoBusiness.listarProduto();
    }

    @PostMapping(path = "/add")
    public void cadastrarProduto( @RequestBody Produto produto ){

        produtoBusiness.cadastrarProduto(produto);
    }

    @PutMapping(path = "/edit")
    public void editarProduto( @RequestBody Produto produto ){

        produtoBusiness.editarProduto(produto);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarProduto(@PathVariable(name = "id") long id){

        produtoBusiness.deletarProduto(id);
    }


}
