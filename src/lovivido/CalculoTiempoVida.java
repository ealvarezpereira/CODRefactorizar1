/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 * Ejercicio 1 de Entornos de desarrollo.
 *
 * @author quique
 */
public class CalculoTiempoVida {

    String nombre;
    String edad;
    int meses;
    int dias;
    int horas;
    int años;

    /**
     * Recibe el nombre y la edad de la persona. 
     * @param nombre Introducir el nombre de la persona.
     * @param edad Introducir la edad de la persona.
     */

    public void recibirNomEd(String nombre, String edad) {
        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");
        años = Integer.parseInt(edad);
    }

    /**
     * Calcula el tiempo que has vivido.
     * @param meses Devuelve el tiempo vivido en meses.
     * @param dias Devuelve el tiempo vivido en dias.
     * @param horas Devuelve el tiempo vivido en horas.
     */
    public void calcularTiempoVivido(int meses, int dias, int horas) {
        
        meses = (años * 12);
        dias = (años * 365);
        horas = (dias * 24);
        JOptionPane.showMessageDialog(null, "Meses: " + meses, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "D\u00edas: " + dias, "Numero de d\u00edas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
