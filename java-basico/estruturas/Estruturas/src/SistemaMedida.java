import java.util.Scanner;

public class SistemaMedida {   
  
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Informe o tamanho do produto: \n");
        String sigla = scanner.nextLine();

    switch (sigla) {
        case "P": System.out.println("Pequeno");
            break;

        case "M": System.out.println("Medio");   
            break;

        case "G": System.out.println("Grande");
            break;

        default: System.out.println("Tamanho invalido");
            break;
            
        }
     scanner.close();
    }
   
}
  

