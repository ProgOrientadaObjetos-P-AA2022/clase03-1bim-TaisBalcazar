/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

/**
 *
 * @author reroes
 */
public class Ejecutable04 {

    public static void main(String[] args) {

        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();

        double valor1 = 10000;
        double valor2 = 20000;
        double valor3 = 30000;

        h1.establecerNumeroCamas(500);
        h2.establecerNumeroCamas(1000);
        h3.establecerNumeroCamas(1500);

        h1.establecerPresupuesto(valor1);
        h2.establecerPresupuesto(valor2);
        h3.establecerPresupuesto(valor3);

        double suma = h1.obtenerPresupuesto() + h2.obtenerPresupuesto()
                + h3.obtenerPresupuesto();
 
        double suma1 = h1.obtenerNumeroCamas() + h2.obtenerNumeroCamas()
                + h3.obtenerNumeroCamas();

        System.out.printf("La suma de presupuestos es %.2f\n", suma);
        System.out.printf("La suma del numero de camas es %.2f\n", suma1);

    }
}
