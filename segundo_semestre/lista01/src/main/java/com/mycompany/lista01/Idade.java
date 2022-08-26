/*
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
public class Idade {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);  
        
        String nome;
        
	Integer anoNascimento;
	
	Integer soma = 2030 - anoNascimento;
        
        
        System.out.println("Qual é seu nome?: ");
        nome = entrada.nextLine();
        
        System.out.println("Olá, " + nome  + "! Qual é o ano do seu nascimento ? ");
        anoNascimento = entrada.nextInt();
	
	System.out.println("Em 2030 você terá" + soma + "anos");
        
     
    }
}
