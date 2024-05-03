/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversiones;

/**
 *
 * @author Usuario
 */
public class Conversiones1 {
    
    static final double METROS_POR_PIES = 0.3048;
    static final double PULGADAS_POR_CENTIMETRO = 0.393701;
    static final double LITROS_POR_GALON = 3.78541;

    public Conversiones1() {
    }
    
    static double piesAMetros(double pies) {
        return pies * 0.3048;
    }
    
    static double centimetrosAPulgadas(double centimetros) {
            return centimetros * 0.393701;
    }
    
    static double galonesALitros(double galones) {
            return galones * 3.78541;
    }
    
    public static void main(String[] args) {
            double pies = 10.0;
            double metros = piesAMetros(pies);
            System.out.println(pies + " pies son equivalentes a " + metros + " metros.");
            double centimetros = 50.0;
            double pulgadas = centimetrosAPulgadas(centimetros);
            System.out.println(centimetros + " centímetros son equivalentes a " + pulgadas + " pulgadas.");
            double galones = 5.0;
            double litros = galonesALitros(galones);
            System.out.println(galones + " galones son equivalentes a " + litros + " litros.");
    }
}

