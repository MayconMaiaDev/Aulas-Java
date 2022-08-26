/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.heranca.turmab;

/**
 *
 * @author celia.taniwaki
 */
public class Teste {
    
    public static void main(String[] args) {
        
        // Criação de objeto da classe herdeira
        AlunoGraduacao a1 = new AlunoGraduacao(10000,"Mickey",7.5,9.0);
        
        // Exibição do nome e da nota continuada do objeto a1
        System.out.println("O aluno de nome " + a1.getNome() + 
                           " tem nota continuada = " + a1.getNotaContinuada());
        
        // Exibidção dos dados do objeto a1, usando toString()
        System.out.println("");
        System.out.println(a1);

        // Exibição dos dados do objeto a1, usando exibeDados()
        System.out.println("");
        a1.exibeDados();
        
    }
    
}
