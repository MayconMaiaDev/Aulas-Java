public class Alimento extends  Produto{

            // atrib
    private Integer quantVitamina;

    //contructor

    public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }


    //metodos metodo abstrato getValorTributo() vem da classe interface

    public Double getValorTributo() {
        return getPreco() * 0.15;
    }


    @Override
    public String toString() {
        return "Alimento{" +
                "quantVitamina=" + quantVitamina +
                "+tributo=}" + getValorTributo() + super.toString();

    }

}
