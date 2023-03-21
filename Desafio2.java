package Desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio2{



    static List<Bilhete> bilhete = new ArrayList<>();
    static List<Usuario> usuarios = new ArrayList<>();




        public static void main (String[]args){



            Scanner input = new Scanner(System.in);



            int opcao = 0;


            int tipoBilhete;

           try {
               //menu

               System.out.println("-----Menu Principal-----");
               System.out.println("Informe a opção desejada ou 99 para sair");
               System.out.println(" 1 - Cadastrar Usuário");
               System.out.println("2 – Cadastrar Bilhete");
               System.out.println(" 3- Recarregar Bilhete");//er1ro
               System.out.println("4 – Pagar Passagem");//erro
               System.out.println(" 5 – Listar Bilhetes");//erro
               System.out.println("6 – Pesquisar Bilhete por CPF ");
               System.out.println(" 99 - sair");


               do {
                   opcao = input.nextInt();


                   switch (opcao) {

                       case 1: //cadastrar
                           System.out.println("digite seu nome ");
                           String nome = input.nextLine();


                           input.nextLine();

                           System.out.println("digite seu cpf");
                           String cpf = input.nextLine();


                           System.out.println("digite seu telefone");
                           String telefone = input.nextLine();


                           System.out.println(" digite seu email");
                           String email = input.nextLine();


                           Usuario usuario = new Usuario(nome, cpf, telefone, email);
                           usuarios.add(usuario);
                           break;

                       case 2:

                           int guardarTipoDeBilhete;
                           System.out.println(" 2= Cadastrar Bilhete ");
                           input.nextLine();
                           System.out.println("Insira Seu CPF");
                           cpf = input.nextLine();
                           Usuario p1 = null;
                           boolean achou = false;
                           for (Usuario p:usuarios){
                               if (cpf.equals(p.getCpf())){
                                   p1 = p;
                                   achou = true;

                               }
                           }
                           if (!achou) {
                               System.out.println("CPF Inálido. Tente Novamente");


                           }else {

                               System.out.println("Qual Tipo de Bilhete Voce Deseja Obter?");
                               System.out.println("1 = Bilhete Estudante");
                               System.out.println("2 = Bilhete Unico");
                               guardarTipoDeBilhete = input.nextInt();
                               Bilhete b1;
                               if (guardarTipoDeBilhete == 1) {
                                   b1 = new BilheteEstudante(p1);
                                   System.out.println("BILHETE ESTUDANTE CADASTRADO");

                               }else {
                                   b1 = new BilheteUnico(p1);
                                   System.out.println("BILHETE ÚNICO CADASTRADO");
                               }
                               bilhete.add(b1);

                           }
                           break;


                       case 3: //recarregar

                           System.out.println(" Insira o Codigo Do Bilhete ");
                           input.nextLine();

                           String guardarCodigo;
                           guardarCodigo = input.nextLine();

                           Bilhete guardarBilhete = null;
                           boolean achouBilhete = false;
                           for (Bilhete b : bilhete) {


                               if (b.codigoBilhete.equals(guardarCodigo)) {
                                   guardarBilhete = b;
                                   achouBilhete = true;
                               }
                           }

                           if (!achouBilhete) {
                               System.out.println("Codigo invalido. Tente Novamente");
                           } else {

                               if (guardarBilhete instanceof BilheteEstudante) {

                                   guardarBilhete.recarregarBilhete();
                                   System.out.println("BILHETE RECARREGADO");

                               } else {
                                   System.out.println("Informe o Valor que Deseja Recarregar");

                                   double guardarValor = input.nextDouble();
                                   guardarBilhete.recarregarBilhete(guardarValor);

                                   System.out.println("BILHETE RECARREGADO");
                               }
                           }
                           break;


                       case 4: //pagar passagem


                           achou = false;
                           input.nextLine();
                           System.out.println("Informe Seu Código: ");
                           String codigoDobilhete = input.nextLine();
                           guardarBilhete = null;
                           for (Bilhete value : bilhete) {
                               if (codigoDobilhete.equals(value.codigoBilhete)) {
                                   guardarBilhete = value;
                                   achou = true;
                               }
                           }
                           if (achou == false) {

                               //Caso o usuário informe uma opção diferente do esperado, exibir a mensagem “Opção
                               //Inválida” e solicitar uma nova opção.
                               System.out.println("Código Inválido. Informe Outro Código: ");

                           } else {
                               guardarBilhete.pagarPassagem();
                               System.out.println("PASSAGEM PAGA");
                           }
                           break;

                       case 5:

                           input.nextLine();



                           for (Bilhete b1: bilhete
                           ) {
                               System.out.println("seu bilhete é:  " + b1);


                           }

                           break;

                       case 6:

                           boolean encontrei= false;
                           System.out.println(" 6= Pesquisar Bilhete Por CPF");
                           String nada = input.nextLine();
                           System.out.println("Digite o CPF Cadastrado no Bilhete");
                           String salvarCpf = input.nextLine();
                           Bilhete salvarBilhete = null;
                           for (Bilhete bilhete : bilhete) {
                               if (salvarCpf.equals(bilhete.usuario.getCpf())) {
                                   salvarBilhete = bilhete;



                               }


                           }

                           if (encontrei==true)
                               System.out.println("Este é o Seu Bilhete " + ("  ") + salvarBilhete);

                           else
                               System.out.println("CPF Não Encontrado");



                           break;



                   }


               } while (opcao != 99);

           }catch (NumberFormatException e){

               System.out.println("digite um NUMERO cedido");
           }
            input.close();
        }



}
