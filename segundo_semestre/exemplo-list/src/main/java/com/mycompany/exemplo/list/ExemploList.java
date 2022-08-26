/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ExemploList {
 
    public static void main(String[] args) {
        // List e ArrayList 
        // List é uma Interface em java, uma interface nunca é instanciavél
        // ArrayList é umsa classe que implementa a Interface list
        
        // criando uma lista do tipo LIST que vai receber um objeto da classe ArrayList
        
        List listaLouca = new ArrayList<>();
        
        listaLouca.add("Oi" );
        listaLouca.add(2020 );
        listaLouca.add(90.5);
        listaLouca.add(true);
        
        // mostrando a lista
        System.out.println("ListaLouca" + listaLouca);
        
        
        System.out.println("ListaLouca tamanho" + listaLouca.size());
   
        
        
            listaLouca.add(50.67);
         //verificando se a lista esta vazia
        System.out.println("ListaLouca Esta vazia" + listaLouca.isEmpty());
        // verificando se a lista contem a string oi
        System.out.println("ListaLouca contem string" + listaLouca.contains("oi"));
        
        
        //exibindo o item da lista louca no indice 2
        
        System.out.println("Item do indice 2 " + listaLouca.get(2));
        
        System.out.println("Indice do iem true " + listaLouca.indexOf(true));
        
        
        listaLouca.add(3);
        
        
        System.out.println("ListaLouca" + listaLouca);

        // removendo um elemento da lista
        listaLouca.remove(90.5);
        
        System.out.println("ListaLouca" + listaLouca);
        
        listaLouca.remove(3);
        
        System.out.println("ListaLouca" + listaLouca);
        
        
        
    // Exibindo a lista louca utilizando o FOR adicional

        for (int i = 0; i < listaLouca.size(); i++) {
            System.out.print(listaLouca.get(i) + ("\t"));
        }
            System.out.println("");
        
        
       
        
    }
    
}
