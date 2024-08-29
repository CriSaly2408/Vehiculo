import java.util.Scanner;

public class Vehiculo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos de entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer los datos de entrada
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese la cilindrada del vehículo: ");
        String cilindrada = scanner.nextLine();

        System.out.print("Ingrese el tipo de combustible del vehículo: ");
        String tipoCombustible = scanner.nextLine();

        System.out.print("Ingrese la capacidad en pasajeros del vehículo: ");
        int capacidadPasajeros = scanner.nextInt();

        // Mostrar los datos ingresados
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");
    }
}