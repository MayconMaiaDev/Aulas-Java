/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author mmaia
 */
public class Calculadora {
    public static void main(String[] args) {
        
      // declarando o leitor para ler o que o usuario digita
      Scanner entrada = new Scanner(System.in);  
      // declarando as variaveis que vão representar o numero 1 e numero 2
      Integer n1, n2 = 0;        
      
      // declarando as variaveis responsaveis por cada operação
      Integer soma, subtracao, multiplicacao;

        // pedindo para o usuario digitar um valor
        System.out.println("Informe o primeiro valor: ");
        // lendo o valor que o usuario digitou como o "primeiro valor/ numero".
        n1 = entrada.nextInt();

        // lendo o valor que o usuario digitou como o "segundo valor/ numero".
        System.out.println("Informe o segundo valor: ");
        n2 = entrada.nextInt();
        
        
        // realizando a adição abaixo
        soma = n1 + n2;
        System.out.println("A soma dos dois valores é: "+ soma);
        
        // realizando a subtração abaixo 
        subtracao = n1 - n2;
        System.out.println("A subtração dos dois valores é: " + subtracao);
        
        // realizando a multiplicação abaixo 
        multiplicacao = n1 * n2;
        System.out.println("A multiplicação dos dois valores é: " + multiplicacao);
        
       
    }
}
