import java.util.Scanner;  // Importa la clase Scanner para leer la entrada del usuario desde la consola

public class Vehiculos {  // Define la clase pública Vehiculo

    public static void main(String[] args) {  // Método principal donde inicia la ejecución del programa
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita al usuario ingresar su nombre y almacena el valor en la variable 'nombre'
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            // Solicita al usuario ingresar su edad y almacena el valor en la variable 'edad'
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente después de leer un entero

            // Solicita al usuario ingresar la marca del vehículo y almacena el valor en la variable 'marca'
            System.out.print("Ingrese la marca del vehículo: ");
            String marca = scanner.nextLine();

            // Solicita al usuario ingresar el modelo del vehículo y almacena el valor en la variable 'modelo'
            System.out.print("Ingrese el modelo del vehículo: ");
            String modelo = scanner.nextLine();

            // Solicita al usuario ingresar la cilindrada del vehículo y almacena el valor en la variable 'cilindrada'
            System.out.print("Ingrese la cilindrada del vehículo: ");
            String cilindrada = scanner.nextLine();

            // Solicita al usuario ingresar el tipo de combustible del vehículo y almacena el valor en la variable 'tipoCombustible'
            System.out.print("Ingrese el tipo de combustible del vehículo: ");
            String tipoCombustible = scanner.nextLine();

            // Solicita al usuario ingresar la capacidad en pasajeros del vehículo y almacena el valor en la variable 'capacidadPasajeros'
            System.out.print("Ingrese la capacidad en pasajeros del vehículo: ");
            int capacidadPasajeros = scanner.nextInt();

            // Imprime los datos ingresados por el usuario
            System.out.println("\n--- Datos del Usuario ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);

            System.out.println("\n--- Datos del Vehículo ---");
            System.out.println("La marca que ha ingresado es: " + marca);
            System.out.println("El modelo que ha ingresado es: " + modelo);
            System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
            System.out.println("El tipo de combustible es: " + tipoCombustible);
            System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");
        }
    }
}
