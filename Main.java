/*Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).*/

import java.util.*;
import java.util.List;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    
    Scanner tmp = new Scanner(System.in);
    List<Double> temp = new ArrayList<Double>();
    //Recebendo os valores
    for (int cont = 1; cont <= 6; cont++) {
      System.out.println("Informe a temperatura do mês " + cont + ": ");
      double x = tmp.nextDouble();
    // adicionando valores na list
      temp.add(x);
    }
    System.out.println(temp);
    Double soma = 0d;
    Double media = 0.0;
    //pegando a média
   
    for (int cont = 0; cont <= 5; cont++) {
      soma += temp.get(cont);
    }
    media = soma/6;
    System.out.println("A média é: "+media);
    System.out.println("Os meses maiores que a média é/são ");
    //verificando valores acima da média

    for(int cont =0; cont<=5;cont++){
      if(temp.get(cont)>media){
        Double maior = temp.get(cont);
        if(cont==0){
          System.out.println("1 - Janeiro");
        }
        else if(cont==1){
          System.out.println("2 - Fevereiro");
        }
        else if(cont==2){
          System.out.println("3 - Março");
        }
        else if(cont==3){
          System.out.println("4 - Abril");
        }
        else if(cont==4){
          System.out.println("5 - Maio");
        }
        else if(cont==5){
          System.out.println("6 - Junho");
        }
        else{
          System.out.println("Nenhuma temeratura acima da média.");
        }
        
      }
    }


  }
}