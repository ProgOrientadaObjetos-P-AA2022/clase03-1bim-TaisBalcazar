/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        // Se asigna valores particulares al objeto
        hospital.nombre = "Manuel Ignacio Monteros";
        hospital.numeroCamas = 15000;
        hospital.presupuesto = 12365478.80;
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
        
        Hospital h2 = new Hospital();
        h2.nombre = "UTPL";
        h2.numeroCamas = 25000;
        h2.presupuesto = 151854986.45;
        
        System.out.printf("%s - %d - %.2f\n", h2.nombre, h2.numeroCamas, 
                h2.presupuesto);
    }
}
