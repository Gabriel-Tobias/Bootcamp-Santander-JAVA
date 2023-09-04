import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao banco da DIO\n Coloque seus dados:");
        
        System.out.println("Digite seu nome Completo");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite sua agencia");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite seu saldo");
        double saldo  = scanner.nextDouble();


        System.out.println("Olá ," + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é," + agencia + ", conta + " + numeroConta + " e seu saldo é, "+ saldo + ", e já está disponivél para saque");
    }
}
