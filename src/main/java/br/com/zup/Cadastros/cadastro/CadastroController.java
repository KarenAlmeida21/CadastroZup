package br.com.zup.Cadastros.cadastro;

import br.com.zup.Cadastros.Dto.CadastroDto;
import br.com.zup.Cadastros.Dto.CampoEspecificoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
    @Autowired
    private CadastroService cadastroService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void realizarCadastro(@RequestBody CadastroDto cadastroDto) {
        Cadastro cadastro = new Cadastro();
        cadastro.setBairro(cadastroDto.getBairro());
        cadastro.setCidade(cadastroDto.getCidade());
        cadastro.setCpf(cadastroDto.getCpf());
        cadastro.setIdade(cadastroDto.getIdade());
        cadastro.setMoraSozinho(cadastroDto.isMoraSozinho());
        cadastro.setNomeDoParenteProximo(cadastroDto.getNomeDoParenteProximo());
        cadastro.setSobrenome(cadastroDto.getSobrenome());
        cadastro.setTemPet(cadastroDto.isTemPet());
        cadastroService.cadastrarClient(cadastro);
    }

}



