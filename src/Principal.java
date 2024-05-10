

import java.util.Scanner;

public class Principal{
	
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Pedir al usuario que ingrese el largo y el ancho del rectángulo
			System.out.print("Ingresa el largo del rectángulo: ");
			double largo = scanner.nextDouble();
			System.out.print("Ingresa el ancho del rectángulo: ");
			double ancho = scanner.nextDouble();

			// Crear un objeto Rectangulo con los valores proporcionados
			Rectangulo rectangulo = new Rectangulo(largo, ancho);

			// Mostrar el menú y realizar las operaciones según la selección del usuario
			while (true) {
			    menu(rectangulo);
			    System.out.print("Elige una opción: ");
			    int opcion = scanner.nextInt();
			    scanner.nextLine(); // Limpiar el búfer del scanner
			    switch (opcion) {
			        case 1:
			            System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
			            break;
			        case 2:
			            System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
			            break;
			        case 3:
			            System.out.println("Saliendo del programa...");
			            System.exit(0);
			        default:
			            System.out.println("Opción no válida. Por favor, elige una opción válida.");
			    }
			}
		}
    }

    // Función para mostrar el menú de opciones
    public static void menu(Rectangulo rectangulo) {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Calcular y mostrar el perímetro");
        System.out.println("2. Calcular y mostrar el área");
        System.out.println("3. Salir");
    }
}
