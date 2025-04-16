
package convertidorDos;

import java.util.Scanner;

public class ConvertidorMoneda {

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        boolean activo = true;

        while (activo) {
            mostrarOpciones();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirDolaresASoles(scanner);
                    break;
                case 2:
                    convertirSolesADolares(scanner);
                    break;
                case 3:
                    activo = false;
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }

    private void mostrarOpciones() {
        System.out.println("=== Conversor simple de monedas ===");
        System.out.println("1) Convertir de dólares a soles");
        System.out.println("2) Convertir de soles a dólares");
        System.out.println("3) Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void convertirDolaresASoles(Scanner scanner) {
        System.out.print("Ingrese la cantidad en dólares: ");
        double cantidad = scanner.nextDouble();
        double resultado = cantidad * 3.75;
        System.out.println("Resultado: S/. " + Math.round(resultado * 100.0) / 100.0);
    }

    private void convertirSolesADolares(Scanner scanner) {
        System.out.print("Ingrese la cantidad en soles: ");
        double cantidad = scanner.nextDouble();
        double resultado = cantidad / 3.75;
        System.out.println("Resultado: $ " + Math.round(resultado * 100.0) / 100.0);
    }
}
