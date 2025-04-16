
package convertidorUno;

public class ConsultaMoneda {

    public double obtenerTipoCambio(String origen, String destino) {
        if (origen.equalsIgnoreCase("USD") && destino.equalsIgnoreCase("PEN")) {
            return 3.75;
        } else if (origen.equalsIgnoreCase("PEN") && destino.equalsIgnoreCase("USD")) {
            return 1 / 3.75;
        } else {
            System.out.println("Conversión no disponible.");
            return 0;
        }
    }
}
