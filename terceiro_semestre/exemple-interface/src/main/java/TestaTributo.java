public class TestaTributo {

    public static void main(String[] args){


        // criacao dos objetos


        Alimento pao = new Alimento(124, "pão de forma", 7.0, 2);


        Perfume puroVoodoo = new Perfume(456, "Perfume da Rochelle", 100.0, "Cheiro de voodoo");

        Servico Arcond = new Servico("Instalação do ar condicionado", 200.00);


        System.out.println(pao);

        System.out.println(puroVoodoo);

        System.out.println(Arcond);

        Tributo trib = new Tributo();
// criação do objeto do tributo
        trib.adicionaTributavel(pao);
        trib.adicionaTributavel(puroVoodoo);
        trib.adicionaTributavel(Arcond);

// exibe os objetos da lista de trib
        trib.exibeTodos();

        // exibe o total de tributos dos objetos da lista de trib
        System.out.println("\nO total de tributos é: " + trib.calculaTotalTributo());

    // outra forma de chamar um método que retorna valor abaixo

       // Double total = trib.calculaTotalTributo();


    }

}
