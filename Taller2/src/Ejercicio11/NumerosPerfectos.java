package Ejercicio11;
import javax.swing.JOptionPane;

public class NumerosPerfectos {
    public static void main(String[] args) {
        int num, perfecto, x;
        
	x = 2;
	perfecto = 0;
        
        JOptionPane.showMessageDialog(null,
        "Un número perfecto es un entero positivo igual a la suma de sus divisores propios. Un divisor\n" +
        "propio es un entero positivo distinto que el número en sí mismo, que divide al número de forma\n" +
        "exacta (es decir, sin resto). Por ejemplo, 6 es un número perfecto, porque la suma de sus divisores\n" +
        "propios 1, 2 y 3 es igual a 6. Este programa le solicitará un número entero positivo y le indicará\n"+
        "su número de divisores y si es un número perfecto o no:", "Bienvenido", 1);
        
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero positivo: ", "Ingreso de datos", 3));
            if (num <= 0){
                JOptionPane.showMessageDialog(null, "El número ingresado no es positivo.\nPor favor inténtelo nuevamente.", "Número inválido", 2);
            }
        } while (num <= 0);
        
	while (x<=num) {
            if (num%x==0) {
		perfecto = perfecto+(num/x);
            }
            x = x+1;
	}

	if (perfecto==num) {
            JOptionPane.showMessageDialog(null, "El número "+num+" es un número perfecto.", "Número perfecto", 1);
	} else {
            JOptionPane.showMessageDialog(null, "El número "+num+" NO es un número perfecto.", "Número no perfecto", 1);
	}
    }
}
