package br.com.unialfa.Drogaria.Produto.business;


import br.com.unialfa.Drogaria.Produto.Repository.ProdutoRepository;
import br.com.unialfa.Drogaria.Produto.domain.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.InputMismatchException;

@Service
public class ProdutoBusiness {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Iterable<Produto> listarProduto()
    {
        return produtoRepository.findAll();
    }

    public void cadastrarProduto( Produto produto ) {

            produtoRepository.save(produto);

    }

    public void editarProduto( Produto produto ){

        produtoRepository.save(produto);
    }

    public @ResponseBody
    void deletarProduto( long id){
        produtoRepository.deleteById(id);
    }
}