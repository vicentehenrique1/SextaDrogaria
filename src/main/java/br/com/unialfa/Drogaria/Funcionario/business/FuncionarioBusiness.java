package br.com.unialfa.Drogaria.Funcionario.business;


import br.com.unialfa.Drogaria.Funcionario.Repository.FuncionarioRepository;
import br.com.unialfa.Drogaria.Funcionario.domain.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.InputMismatchException;

@Service
public class FuncionarioBusiness {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Iterable<Funcionario> listarFuncionario()
    {
        return funcionarioRepository.findAll();
    }

    public void cadastrarFuncionario( Funcionario funcionario ) {

            funcionarioRepository.save(funcionario);

    }

    public void editarFuncionario( Funcionario funcionario ){

        funcionarioRepository.save(funcionario);
    }

    public @ResponseBody
    void deletarFuncionario( long id){
        funcionarioRepository.deleteById(id);
    }
}