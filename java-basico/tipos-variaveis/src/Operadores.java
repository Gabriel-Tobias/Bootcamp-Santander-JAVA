public class Operadores {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 7;

        // operador ternario
        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        // operador de comparaçao entre objetos
        String nome1 = "gabe";
        String nome2 = new String("gabe");

        System.out.println(nome1.equals(nome2));

        
    }
}
