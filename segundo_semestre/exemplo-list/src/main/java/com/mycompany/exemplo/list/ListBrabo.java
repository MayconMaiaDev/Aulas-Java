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
public class ListBrabo {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        
        
        lista.add("Olá mundo");
        
        lista.add("Salve a amazonia, tudo bem ? ");
        lista.add("Como vai ?? ");
        lista.add("SEXTOU");
        lista.add("BUENAS BUENAS ");
        for (String item: lista) {
            System.out.println(item +"\t");
        }

        System.out.println("");
        
        
        //removendo os itens 1 a  1 e exibindo a lista 
        
        
        while (lista.isEmpty()) {
            lista.remove(0);
            
            System.out.println(lista);
        }
       
        
    }
    
}
