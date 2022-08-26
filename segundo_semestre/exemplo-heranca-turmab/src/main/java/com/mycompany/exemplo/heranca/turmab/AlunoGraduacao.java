/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.heranca.turmab;

/** Classe AlunoGraduacao - criada como herdeira da classe Aluno
 *
 * @author celia.taniwaki
 */
public class AlunoGraduacao extends Aluno {
    
    // Atributos específicos da classe herdeira
    private Double notaContinuada;
    private Double notaIntegrada;
    
    // Construtor que recebe os valores dos atributos e os inicializa
    public AlunoGraduacao(Integer ra, String nome, Double notaContinuada, Double notaIntegrada) {
        super(ra, nome);    // chamada do construtor da classe mãe para inicializar o ra e o nome
        this.notaContinuada = notaContinuada;
        this.notaIntegrada = notaIntegrada;
    }
    
    // Métodos
    
    /* Método exibeDados - exibe os valores dos atributos do objeto */
    public void exibeDados() {
        System.out.println("Dados do objeto AlunoGraduacao:");
        System.out.println("RA: " + getRa());   // como ra é private na classe Aluno, precisa obter o ra usando getRa()
        System.out.println("Nome: " + nome);    // como nome é protected na classe Aluno, consegue acessar diretamente o nome
        System.out.println("Nota Continuada: " + notaContinuada);
        System.out.println("Nota Integrada: " + notaIntegrada);
    }
    

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }

    // Método toString() - gerado pela IDE
    // Acrescentamos aqui a chamada do super.toString() para retornar os valores do ra e nome (atributos 
    // definidos na classe mãe ou superclasse)
    @Override
    public String toString() {
        return "AlunoGraduacao{" + super.toString() + ", notaContinuada=" + notaContinuada + ", notaIntegrada=" + notaIntegrada + '}';
    }
    
    
    
}
