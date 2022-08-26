/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.list;

/**
 *
 * @author Aluno
 */
public class carro {
    
      private  String marca;
      
      private  String modelo;
      
      private String placa;
      
     private Integer ano;
     
     
     private String cor;
     
     public carro(){  // construtor "cheio" 
     }

    public carro(String marca, String modelo, String placa, Integer ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
    }

 

    @Override
    public String toString() {
        return "carro{" + "marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + 
                ", cor=" + cor + '}';
    }
}

