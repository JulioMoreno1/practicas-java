/* Este es un programa que calcula el sueldo de un empleado en base a un sueldo base, las horas extra  y 
la categoría que tiene el empleado; los datos son introducidos por el usuario desde el teclado. 
  -- El empleado no puede más de 30 horas extras; en caso de tener más de 30 horas extra, solo
  sólo se le consideraran 30 horas.
  -- La categorias se deben adaptar a la siguiente tabla de categorías:

            -------------------------------------------------
            categoria           |           precio hora extra
            -------------------------------------------------
            1                   |           $ 30
            -------------------------------------------------
            2                   |           $ 38
            -------------------------------------------------
            3                   |           $ 50
            -------------------------------------------------
            4                   |           $ 70
            -------------------------------------------------

 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NominaBasica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario = 0.0;
        byte categoria = 0;
        byte horasExtra = 0;

        System.out.print("Ingrese el sueldo del empleado: ");
        salario = teclado.nextDouble();
        System.out.print("Ingrese la categoria del empleado: ");
        categoria = teclado.nextByte();
        System.out.print("Ingrese las horas extra del empleado: ");
        horasExtra = teclado.nextByte();

        Locale moneda = new Locale("en", "us");

        NumberFormat fmoneda = NumberFormat.getInstance(moneda);

        if (horasExtra < 1) {
            System.out.println("El salario del empleado es: $" + fmoneda.format(salario));
        } else {
            switch (categoria) {
                case 1:

                    break;
                default:
                    throw new AssertionError();
            }

        
    }
}
