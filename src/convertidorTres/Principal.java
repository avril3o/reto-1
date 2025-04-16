
package convertidorTres;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        ConvertirMonedas convertidor = new ConvertirMonedas();

        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cantidad en dólares: ");
                    double dolares = scanner.nextDouble();
                    convertidor.ConvertirDolaresASoles(dolares);
                    break;
                case 2:
                    System.out.print("Ingrese cantidad en soles: ");
                    double soles = scanner.nextDouble();
                    convertidor.ConvertirSolesADolares(soles);
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("------ Convertidor de Monedas ------");
        System.out.println("1) Dólares -> Soles peruanos");
        System.out.println("2) Soles peruanos -> Dólares");
        System.out.println("3) Salir");
        System.out.print("Seleccione una opción: ");
    }
}
