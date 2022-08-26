/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.heranca.com.sobrescrita;

/**
 *
 * @author celia.taniwaki
 */
public class ExemploHerancaComSobrescrita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cria um objeto da classe VendedorComissao
        VendedorComissao vc = new VendedorComissao(123,"Mickey",15000.0,0.20);
        // Exibe o objeto (chamada implícita do toString()
        System.out.println(vc);

        // Cria um objeto da classe herdeira
        VendedorComissaoMaisFixo vcf = new VendedorComissaoMaisFixo
                       (456,"Pateta", 15000.0, 0.20, 2000.0);
        // Exibe o objeto
        System.out.println(vcf);
        
    }
    
}
