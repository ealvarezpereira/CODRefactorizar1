/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

/**
 *
 * @author quique
 */
public class LoVivido {

    /**
     *
     * @param args etc.
     * 
     * En el main simplemente se crea un objeto de tipo CalculoTiempoVida y llamamos a los metodos.
     */
    public static void main(String[] args) {

        CalculoTiempoVida calc = new CalculoTiempoVida();

        calc.recibirNomEd(calc.nombre,calc.edad);
        calc.calcularTiempoVivido(calc.meses,calc.dias,calc.horas);

    }

}
