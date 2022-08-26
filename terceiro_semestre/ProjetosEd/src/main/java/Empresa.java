import java.util.ArrayList;
import java.util.List;

public class Empresa {
private List<Funcionario> lista;

    public Empresa() {
         lista = new ArrayList<Funcionario>();
    }

    public void  adicionaFunc(Funcionario f){
        lista.add(f);
    }

    public void exibeTodos(){
        System.out.println("Lista de funnc: ");

    for(Funcionario f : lista){
        System.out.println(f);
    }
    }

    public void exibeTotalSalario(){
        Double total = 0.00;
        for(Funcionario f : lista){
            total += f.calcSalario();
        }
        System.out.println("O total do salario é " + total);
    }

    public void exibeHoristas(){
        System.out.println("Lista de horista");
        for(Funcionario f : lista){
            System.out.println(f);
        }

    }
}
