import java.util.Locale;
import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: 
        //Conhecer e importar a classe Scanner;
        //Exibir as mensagens para o nosso usuário;
        //Obter pela scanner os valores digitados no terminal;
        //Exibir a mensagem conta criada.

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Digite o nome do Titular da conta: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da conta: ");
        Double depositoInicial = scanner.nextDouble();


        System.out.println("\nOlá [nomeCliente], obrigado por criar uma conta em nosso banco, sua agência é [agencia], conta [numeroDaConta] e seu saldo [depositoInicial] já está disponível para saque");


    }
}
