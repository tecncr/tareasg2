package ejercicio7;
import javax.swing.JOptionPane;

public class SimplificarFraccion {
    public static void main(String[] args) {
       int a, b, denominador, n1, n2, numerador;
	JOptionPane.showMessageDialog(null," Simplifiquemos una fraccion", "Bienvenido", 1 );
        a = Integer.parseInt(JOptionPane.showInputDialog (null, "Ingrese el numerador","Inserte numero" , 3));
        b = Integer.parseInt(JOptionPane.showInputDialog (null, "Ingrese el denominador","Inserte numero" , 3));
	n1 = a;
	n2 = b;
        while (n1!=n2) {
		if (n1>n2) {
			n1 = n1-n2;
		} else {
			n2 = n2-n1;
		}
	}
	numerador = a/n1;
	denominador = b/n1;
                String mensaje = "Al simpliflicar la fraccion: ";
                mensaje += (a + "/" + b);
                mensaje += ("\nQueda: " + numerador + "/" + denominador);
                JOptionPane.showMessageDialog(null, mensaje,  "Resultado", 1);
    }
}
