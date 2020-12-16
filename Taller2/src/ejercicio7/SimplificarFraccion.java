package ejercicio7;
import javax.swing.JOptionPane;

public class SimplificarFraccion {
    public static void main(String[] args) {
       int a, b, denominador, n1, n2, numerador;
	JOptionPane.showMessageDialog(null,"Este programa simplifica una fracción", "Bienvenido", 1 );
        a = Integer.parseInt(JOptionPane.showInputDialog (null, "Ingrese el numerador:","Numerador" , 3));
        b = Integer.parseInt(JOptionPane.showInputDialog (null, "Ingrese el denominador:","Denominador" , 3));
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
                mensaje += ("\nQueda: " + numerador);
                if (denominador != 1){
                    mensaje += ("/" + denominador);
                }
                JOptionPane.showMessageDialog(null, mensaje, "Resultado", 1);
    }
}
