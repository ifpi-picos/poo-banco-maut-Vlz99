package br.edu.ifpi.poo.cliente;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.edu.ifpi.poo.conta.Conta;
import br.edu.ifpi.poo.endereco.Endereco;
import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Endereco endereco;

    private List<Conta> contas = new ArrayList<Conta>();

    public Cliente(String nome, String cpf, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public void adicionaConta(Conta conta) {
        this.contas.add(conta);
    }

    public void removeConta(Conta conta) {
        this.contas.remove(conta);
    }

    public void listaContas() {
        for (Conta conta : this.contas) {
            System.out.println(conta.getNumero());
        }
    }

    public Conta getConta(String numero) {
        for (Conta conta : this.contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    
}
