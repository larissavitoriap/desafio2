package Desafio2;

import java.util.Random;

public class Bilhete {


/*Deve haver uma interface ou classe abstrata representando o Bilhete Único, contendo
um código do bilhete, o Usuário e os métodos para pagarPassagem, recarregarBilhete
e pesquisarBilhetePorCpf.*/


    public String codigoBilhete;

    protected Usuario usuario;


    public Bilhete( Usuario usuario) {

        this.codigoBilhete = geradorCodigo();
        this.usuario = usuario;
    }

    public void pagarPassagem() {


    }

    public void pagarPassagem(double preco) {


    }

    public void recarregarBilhete() {

    }


    public void pesquisarBilhete() {


    }

    public void recarregarBilhete(double valor) {


    }

    public String geradorCodigo() {
        Random gerar = new Random();
        String codigo= String.format("%04d", gerar.nextInt(10000) );

        return codigo;
    }

}

