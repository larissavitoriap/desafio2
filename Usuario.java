package Desafio2;

import java.util.Scanner;

public class Usuario {



    Scanner input = new Scanner(System.in);


    public String nome;

    public String cpf;
    public String email;
    public String telefone;

    public Scanner getInput() {
        return input;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

//////////////////////// apenas separando

    public Usuario(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;

        this.telefone = telefone;


        this.email = email;






        }

    }







