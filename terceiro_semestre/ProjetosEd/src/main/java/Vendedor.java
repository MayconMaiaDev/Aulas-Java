public class Vendedor extends  Funcionario{


    private Double vendas;

    private Double taxa;

    public Vendedor(String cpf, String nome, Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }


    public Double calcSalario(){
        return this.vendas * this.taxa;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "vendas=" + vendas +
                ", taxa=" + taxa +
                ", salario = " + calcSalario() +
                "} " + super.toString();
    }

}
