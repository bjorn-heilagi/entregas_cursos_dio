import java.util.Scanner;

/**
 * Escreva uma descrição da classe Contador aqui.
 * 
 * @author Breno Santos
 * @version 1.0
 */
public class Contador
{
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.err.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
        int contagem = parametroDois - parametroUm;
        for(int x = 1; x <= contagem; x++)
            System.out.println("Imprimindo o número " + x);
    }
}