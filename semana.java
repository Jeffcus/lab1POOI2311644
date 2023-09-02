import java.util.Scanner;

public interface semana {
    public static void main(String[] args) {
        //  Importar el paquete java.util

        //  Crear Scanner
        Scanner scanner = new Scanner(System.in);

        //  dato ingresado
        System.out.print("Introduzca un numero para hallar el dia de la semana: ");
        int numero = scanner.nextInt();

        //  sentencia switch
        String dia;

        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Número no válido";
        }

        //  resultado
        System.out.println("El día de la semana es: " + dia);

        // Cerrar  Scanner
        scanner.close();
    }
}
