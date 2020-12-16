package ejercicio8;
import javax.swing.JOptionPane;

public class DigitoDeUnNumero {
    public static void main(String[] args) {
        int a, b, digitos, impares, n;
	impares = 0;
	digitos = 0;
        JOptionPane.showMessageDialog(null, "Programa que muestra el numero de digitos de un numero y cuantos son impares.", "Ejercicio 8", 1);
	do {
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
		if (n<0) {
			JOptionPane.showInternalMessageDialog(null, "Por favor ingrese un numero entero positivo.");
		}
	} while (n<0);
	a = n;
	while (a>0) {
		b = a%10;
		if (b%2>0) {
			impares = impares+1;
		}
		a = (a-b)/10;
		digitos = digitos+1;
	}
	if (n==0) {
		digitos = 1;
	}
	JOptionPane.showMessageDialog(null, "El numero "+n+ " tiene "+digitos+ " digitos, de los cuales "+ impares+ " de ellos son impares." );
    }
}
