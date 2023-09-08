import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.print("Número da conta: ");
       int numeroConta = scanner.nextInt();

       scanner.nextLine();
       System.out.print("Agência: ");
       String numeroAgencia = scanner.nextLine();

       System.out.print("Nome do Cliente: ");
       String nomeCliente = scanner.nextLine();
       
       System.out.print("Digite o valor do deposito: ");
       double saldo = scanner.nextDouble();

       System.out.println("Olá ".concat(nomeCliente) + ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(numeroAgencia)  + ", conta ".concat(String.valueOf(numeroConta)) + " e seu saldo ".concat(String.valueOf(saldo)) + " já está disponivel para saque.");

      
    }
}