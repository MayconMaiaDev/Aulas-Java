public class Teste {
    public static void main(String[] args) {
        Engenheiro enge1 = new Engenheiro( "48249265787", "Maycon Gomes", 3000.00);

        Vendedor vend1 = new Vendedor("55586745834", "Daniel Maia", 5000.00, 10.00);

        Horista hr1 = new Horista("78954326745", "Yuri Taime", 9000, 30.00);

        System.out.println(enge1);
        System.out.println(vend1);
        System.out.println(hr1);
    }
}
