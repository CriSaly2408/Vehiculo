 Creación del proyecto y archivo Java:

Paso 1: Crear un nuevo proyecto en un entorno de desarrollo integrado (IDE) como Eclipse, IntelliJ IDEA, o simplemente utilizando un editor de texto como Visual Studio Code.

Paso 2: Dentro del proyecto, crear un nuevo archivo Java con el nombre Vehiculo.java.
2. Importar librerías necesarias:

Paso 3: Incluir la declaración import java.util.Scanner; al inicio del archivo. Esto permite utilizar la clase Scanner, que es necesaria para leer la entrada del usuario desde la consola.
3. Definir la clase principal:

Paso 4: Definir la clase Vehiculo utilizando public class Vehiculo. Esta será la clase principal del programa.
4. Definir el método main:

Paso 5: Dentro de la clase Vehiculo, crear el método public static void main(String[] args). Este es el punto de entrada del programa, donde se ejecutará el código.
5. Inicializar el objeto Scanner:

Paso 6: Dentro del método main, inicializar un objeto Scanner utilizando Scanner scanner = new Scanner(System.in);. Esto permitirá capturar la entrada del usuario.
6. Solicitar y capturar datos del usuario:

Paso 7: Utilizar System.out.print para mostrar mensajes en la consola solicitando al usuario que ingrese datos como la marca, modelo, cilindrada, tipo de combustible, y capacidad en pasajeros del vehículo.

Paso 8: Capturar los datos ingresados por el usuario usando scanner.nextLine() para los datos de tipo String y scanner.nextInt() para el dato de tipo int (capacidad de pasajeros).
7. Mostrar los datos ingresados:

Paso 9: Una vez capturados los datos, utilizar System.out.println para mostrar la información ingresada por el usuario en la consola, repitiendo cada uno de los valores capturados.
