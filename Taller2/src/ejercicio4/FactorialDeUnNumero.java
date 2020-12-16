package ejercicio4;
import javax.swing.JOptionPane;

public class FactorialDeUnNumero {
    public static void main(String[] args) {
        int cont, factorial, numero;
        JOptionPane.showMessageDialog(null,"Calculemos el factorial de un numero", "Bienvenido", 1 );
        numero = Integer.parseInt(JOptionPane.showInputDialog (null, "Ingrese un numero","Inserte numero" , 3));
	while (numero<0) {
		JOptionPane.showMessageDialog(null,"El numero es negativo, no existe facrotial de numeros negativos", "Positivo", 2 );
                JOptionPane.showMessageDialog(null,"Por favor ingrese un numero positivo", "Positivo", 1 );
		  numero = Integer.parseInt(JOptionPane.showInputDialog (null, "Ingrese un numero","Inserte numero" , 3));
	}
	if (numero>=0) {
		cont = 0;
		factorial = 1;
		while (cont<numero) {
			cont = cont+1;
			factorial = factorial*cont;
		}
                  String mensaje = "El factorial es: "+factorial;
                 JOptionPane.showMessageDialog(null, mensaje, "Resultado", 1);
	} else {
		if (numero==0 || numero==1) {
			JOptionPane.showMessageDialog(null,"El factorial del numero es: 1", "Resultado", 1 );
		}
	}
    }
}
