import java.util.Scanner;

public class signosiguales {
    public static void main(String[] args) {
        //crear escaner
        Scanner scanner = new Scanner(System.in);

        // ingrese numA
        System.out.print("Ingresa el primer número (numA): ");
        int numA = scanner.nextInt();

        // Ingrese numb
        System.out.print("Ingresa el segundo número (numB): ");
        int numB = scanner.nextInt();

        // verificar los numeros
        boolean sonPositivos = (numA > 0) && (numB > 0);

        // resultado
        System.out.println("¿Son ambos números positivos? " + sonPositivos);

        // cerrar escaner
        scanner.close();
    }
}
//Escriba una sentencia de Java que imprima true (verdadero), si numA y numB tienen el mismo signo (+/-)