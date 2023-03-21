package Desafio2;


public class BilheteUnico extends Bilhete {
//interface

/*Deve haver uma interface ou classe abstrata representando o Bilhete Único, contendo
um código do bilhete, o Usuário e os métodos para pagarPassagem, recarregarBilhete
e pesquisarBilhetePorCpf.*/


        private double saldo;

        public BilheteUnico(Usuario usuario) {
            super(usuario);
            this.saldo = saldo;
        }


        public void recarregarPassagem( double valor){

            saldo= saldo+ valor;
        }

        public void pagarPassagem(){

            saldo = saldo - 5;


        }

       //cadastro
       public String toString() {
           String dados = "";
           dados += "nome do usuario : " + this.usuario.getNome() + ("  ");
           dados += " codigo do bilhete : " + this.codigoBilhete + ("  ");
           dados += " saldo: " + this.saldo + ("  ");
                return dados  ;
            }


        }



