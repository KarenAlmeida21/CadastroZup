package br.com.zup.Cadastros.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository cadastroRepository;

    public Cadastro cadastrarClient(Cadastro cadastro) {
        if(cadastroRepository.existsById(cadastro.getCpf())){
         //   throw new CadastroException;
        }
        cadastro.setDataDoCadastro(LocalDate.now());

       return cadastroRepository.save(cadastro);
    }


    public List<Cadastro> exibir() {
List<Cadastro>Cadastros =(List<Cadastro>)  cadastroRepository ;
return Cadastros;
    }

}
