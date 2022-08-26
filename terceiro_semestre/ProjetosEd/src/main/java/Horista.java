public class Horista extends  Funcionario{

    private  Integer qtdHora;

    private Double valorHora;

    public Horista(String cpf, String nome, Integer qtdHora, Double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    public Double calcSalario(){

        return  this.qtdHora * valorHora;

    }

    @Override
    public String toString() {
        return "Horista{" +
                "qtdHora=" + qtdHora +
                ", valorHora=" + valorHora +
                ", salario = " + calcSalario() +
                "} " + super.toString();
    }
}
