public abstract class Produto  implements Tributavel{


    // atributos

    private  Integer codigo;
    private  String descricao;
    private  Double preco;


    // construtor


    public Produto(Integer codigo, String descricao, Double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }


    //metodo ToString


    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }

    // metodo getPreco()


    public Double getPreco() {
        return preco;
    }
}
