import java.util.Scanner;

public class Testa_questao3 {
    public static void main(String[] args) {
        Questao3 dic = new Questao3();
        int opcao = 0;

        try(Scanner scan = new Scanner(System.in)) {
            while (opcao != 4) {
                System.out.println();
                opcao = Integer.parseInt(scan.nextLine());

                String termo, significado;

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o termo; ");
                        termo = scan.nextLine();
                        System.out.println("digite o significado: ");
                        significado = scan.nextLine();

                        dic.adicionar(termo, significado);
                        break;
                    case 2:
                        System.out.println("Digite o termo a ser buscado: ");
                        termo = scan.nextLine();
                        significado = dic.consultar(termo);
                        System.out.println(significado == null ? "Termo não encontrado" : termo + " = " + significado);
                        break;
                    case 3:
                        dic.listar();
                        break;
                    default:
                        break;
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
