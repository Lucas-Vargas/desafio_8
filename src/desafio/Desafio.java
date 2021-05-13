/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author s.lucas
 */
public class Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
       
        
            System.out.println("Exercicio 2:");
            int exer=1;
            while(exer!=0){
            System.out.println("Insira 1 para ir ao primeiro exercicio 2 para ir ao segundo,\n3 para ir ao terceiro e 4 para ir ao quarto ou 0 para sair.");
            exer = ler.nextInt();
        if(exer==1){
                double ze, chico;
                 int cont;
                cont = 1;
                 ze = 1.10;
                   chico = 1.50;
                     DecimalFormat f = new DecimalFormat("0.00");
                    while(chico>=ze){
                    System.out.println("Zé: "+f.format(ze)+"m\n"
                    + "Chico: "+f.format(chico)+"m");
                    ze = ze+0.03;
                     chico = chico+0.02;
                cont++;
            }System.out.println("Demorou "+cont+" anos para Zé alcançar chico, Zé ficou com "+f.format(ze)+"m\n e Chico com "+f.format(chico));
            }                        
        if(exer==2){
                int num, cont025=0, cont2650=0, cont5175=0, cont76100=0;
                System.out.println("Digite um númeo positivo para continuar um negativo para sair.");
                num = ler.nextInt();
                while(num>=0){
                    if(num>=0 && num<=25){
                        cont025++;
                    }else if(num>=26 && num<=50){
                        cont2650++;
                    }else if(num>=51 && num<=75){
                        cont5175++;
                    }else if(num>=76 && num<=100){
                        cont76100++;
                    }
                    System.out.println("Digite um númeo positivo para continuar um negativo para sair.");
                num = ler.nextInt();
                }  
                    System.out.println("foram digitados "+cont025+" números entre 0 e 25");
                    System.out.println("foram digitados "+cont2650+" números entre 26 e 50");
                    System.out.println("foram digitados "+cont5175+" números entre 51 e 75");
                    System.out.println("foram digitados "+cont76100+" números entre 76 e 100");
        }if(exer==3){
                int nume=1000;
                
                while(nume>=1000 && nume<2000){
                    
                    nume++;
                    if(nume%11==5){
                        System.out.println(nume);
                        
                    }
                }  
        }if(exer==4){
            int val, numer=1, val1020=0;
                System.out.println("escreva 10 valores:");
                
                while(numer<=10){
                 System.out.println("Escreva o "+numer+" valor");
                 val = ler.nextInt();
                 numer++;
                 if(val>=10 && val<=20){
                     val1020++;
                 }
                 if(numer>10){
                     System.out.println("A quantidade de números digitados dentro do grupo de 10 até 20 é de: "+val1020);
                 }
                }
                
                 }
    
    }System.out.println("Até breve :)");
    }
        