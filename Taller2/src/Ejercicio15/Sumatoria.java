package Ejercicio15;
import javax.swing.JOptionPane;

public class Sumatoria {
    public static void main(String[] args) {
        int a, i, n;
	float factorial2n, x;
        double resultado_acum;
        
	factorial2n = 1;
	resultado_acum = 0;
        JOptionPane.showMessageDialog(null,"Calculo de la serie x/2! + 2x^2/4! + 3x^3/6! + .,. + Nx^N/2N!", "Bienvenido", 1 );
	x = Integer.parseInt(JOptionPane.showInputDialog (null, "Ingrese el valor de X:","Insertar" , 3));
        while (x<0) {
                JOptionPane.showMessageDialog(null,"No puede ser numero negativo", "Error", 2 );
                JOptionPane.showMessageDialog(null,"Por favor ingrese un numero positivo", "Positivo", 1 );
		x = Integer.parseInt(JOptionPane.showInputDialog (null, "Ingrese el valor de X:","Insertar" , 3));
	}
	n = Integer.parseInt(JOptionPane.showInputDialog (null, "Ingrese el valor de N:","Insertar" , 3));
        while (n<0) {
                JOptionPane.showMessageDialog(null,"No puede ser numero negativo", "Error", 2 );
                JOptionPane.showMessageDialog(null,"Por favor ingrese un numero positivo", "Positivo", 1 );
		n = Integer.parseInt(JOptionPane.showInputDialog (null, "Ingrese el valor de N  :","Insertar" , 3));
	}
	for (i=1;i<=n;i++) {
		for (a=1;a<=2*n;a++) {
			factorial2n = factorial2n*a;
		}
		resultado_acum = resultado_acum+(n*Math.pow(x,n))/factorial2n;
	}
	String mensaje = "La suma de los" + n + "terminos ";
                mensaje += ("de la serie es: " +resultado_acum );
                JOptionPane.showMessageDialog(null, mensaje,  "Resultado", 1);
    }
}
