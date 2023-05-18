/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;
import java.util.Locale;
import java.util.Scanner;
import paquete02.Vendedor;
/**
 *
 * @author SALA I
 */
public class Principal {
    
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        double sMinino;
        int autos;
        int contador = 1;
        String cadenaFinal;
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        cadenaFinal = ""; // inicializo la variable que contendrá la cadena
        // final.
        
        //Tambien se puede usar un ciclo for.
        while (contador <= 3) { // bandera == true
            System.out.println("Ingrese el nombre del vendedor");
            nombre = entrada.nextLine();
            System.out.println("Ingrese edad del vendedor");
            edad = entrada.nextInt();
            System.out.println("Ingrese el salario mínimo");
            sMinino = entrada.nextDouble();
            System.out.println("Ingrese el número de autos vendidos");
            autos = entrada.nextInt();

            // con los datos ingresados se crea el objeto de tipo Vendedor
            Vendedor v = new Vendedor(nombre, edad, sMinino, 
                    autos);
            v.calcularPagoMensual();
            cadenaFinal = String.format("%sDatos de Vendedor\n"
                    + "Nombre: %s\n"
                    + "Edad: %s\n"
                    + "Salario mínimo: %.2f\n"
                    + "Número de autos: %d\n"
                    + "Pago mensual: %.2f\n\n",
                    cadenaFinal, //Al comentar y no pedir a la cadena final, se dejan de acumular los datos de los demás vendores.
                    v.obtenerNombres(), v.obtenerEdad(),
                    v.obtenerSalarioMinimo(), v.obtenerNumeroAutos(),
                    v.obtenerPagoMensual());

            entrada.nextLine(); // limpieza del buffer
            contador++;
        }
        // cuando se sale del ciclo repetitivo debemos presentar en pantalla
        // el valor de cadena final
        System.out.printf("%s\n", cadenaFinal);
    }
}
