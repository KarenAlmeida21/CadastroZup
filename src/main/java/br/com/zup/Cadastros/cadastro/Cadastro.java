package br.com.zup.Cadastros.cadastro;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "cadastros")
public class Cadastro {
    @Id
    private String cpf;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String sobrenome;
    private String cidade;
    private String bairro;
    @Column(name= "nome_do_parente_proximo")
    private String nomeDoParenteProximo;
    @Column(name ="morar_sozinho")
    private boolean moraSozinho;
    @Column(name="tem_pet")
    private boolean temPet;
    private int idade;
    @Column (name = "data_do_cadastro")
    private LocalDate dataDoCadastro;

    public Cadastro() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNomeDoParenteProximo() {
        return nomeDoParenteProximo;
    }

    public void setNomeDoParenteProximo(String nomeDoParenteProximo) {
        this.nomeDoParenteProximo = nomeDoParenteProximo;
    }

    public LocalDate getDataDoCadastro() {
        return dataDoCadastro;
    }

    public void setDataDoCadastro(LocalDate dataDoCadastro) {
        this.dataDoCadastro = dataDoCadastro;
    }


    public boolean isMoraSozinho() {
        return moraSozinho;
    }

    public void setMoraSozinho(boolean moraSozinho) {
        this.moraSozinho = moraSozinho;
    }

    public boolean isTemPet() {
        return temPet;
    }

    public void setTemPet(boolean temPet) {
        this.temPet = temPet;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}