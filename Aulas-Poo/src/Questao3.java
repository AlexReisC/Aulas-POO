import java.util.Map;
import java.util.TreeMap;

public class Questao3{
    private Map<String, String> termos = new TreeMap<>();

    public void adicionar(String termo, String significado){
        termos.put(termo, significado);
    }

    public String consultar(String termo){
        return termos.get(termo);
    }

    public void listar(){
        for (Map.Entry<String, String> entrada : termos.entrySet()) {
            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }
    }
}