import java.util.Scanner;

public class Adios {

    public static int restar(int numero1, int numero2) {
        int resultado = numero1 - numero2;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Escribe el numero 1");
        numero1 = scanner.nextInt();
        System.out.println("Escribe el numero 2");
        numero2 = scanner.nextInt();

        int resultado = numero1 + numero2;
        System.out.println("La suma es " + resultado);

        System.out.println("Escribe el numero 1 para restar");
        numero1 = scanner.nextInt();
        System.out.println("Escribe el numero 2 para restar");
        numero2 = scanner.nextInt();

        int resultadoResta = restar(numero1, numero2);
        System.out.println("La resta es " + resultadoResta);

        scanner.close();
    }
}