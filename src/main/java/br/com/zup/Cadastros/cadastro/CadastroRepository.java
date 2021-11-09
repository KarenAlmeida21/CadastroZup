package br.com.zup.Cadastros.cadastro;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends CrudRepository<Cadastro, String> {
}
