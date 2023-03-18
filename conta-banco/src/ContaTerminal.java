import java.util.Scanner;

public class ContaTerminal {public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        String nomeTitular = scanner.next().toUpperCase();

        System.out.println("Digite o nome do titular: ");
        String sobrenomeTitular = scanner.next().toUpperCase();
        
      
        System.out.println("Digite o numero da agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();        

        System.out.println("Digite o valor inicial da conta: ");
        double saldoInicial = scanner.nextDouble();


        System.out.println("\nOla " + nomeTitular + " " + sobrenomeTitular + ", obrigado por criar uma conta em nosso banco, sua agencia e "
         + agencia + ", conta " + numero + " e seu saldo de " + saldoInicial + " ja esta disponivel para saque.\n\n");
        
        
    }
}