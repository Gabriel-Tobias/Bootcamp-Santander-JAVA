import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("tenho " + idade + " anos");
        System.out.println("Minha altura é de " + altura + " cm ");
        scanner.close();
      }
       catch (InputMismatchException e){
        System.out.println("Os campos idade e altura precisam ser numericos");
     }

    }
}
