import java.util.Scanner;
import java.util.Locale;

/**
 * Primeiro desafio da formação Java Developer.
 * 
 * @author Breno Santos
 * @version 1.0
 */
public class ContaTerminal
{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);
        System.out.println("Por favor, digite o número da agência:");
        String agencia = leitor.nextLine();
        System.out.println("Por favor, digite o número da conta:");
        int numero = Integer.parseInt(leitor.nextLine());
        System.out.println("Por favor, digite o nome completo do titular:");
        String nomeCliente = leitor.nextLine();
        System.out.println("Por favor, digite o valor a ser depositado na conta:");
        double saldo = Double.parseDouble(leitor.nextLine());

        System.out.println(String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, " +
            "sua agência é %s, conta %d e seu saldo %.4f já está " +
            "disponível para saque", nomeCliente, agencia, numero, saldo));
    }
}