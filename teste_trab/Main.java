import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Processo p1 = new Processo();

        p1.nome = "Proceso 1";
        p1.prioridade =  1;
        p1.tamanho = new ArrayList<>();

        p1.tamanho.addAll(Arrays.asList(1,2,3,4));

        System.out.println(p1.nome);
        System.out.println(p1.prioridade);
        System.out.println(p1.tamanho);

        Processo p2 = new Processo();

        p2.nome = "Proceso 2";
        p2.prioridade =  2;
        p2.tamanho = new ArrayList<>();

        p2.tamanho.addAll(Arrays.asList(1,3,2,4));

        System.out.println(p2.nome);
        System.out.println(p2.prioridade);
        System.out.println(p2.tamanho);

        ArrayList<Processo> filaDeEspera = new ArrayList<>();

        filaDeEspera.add(p1);
        filaDeEspera.add(p2);

        




        
    }
    
    

}
