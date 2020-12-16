package ejercicio14;
import javax.swing.JOptionPane;

public class ProductoDeUnNumeroPositivo {
    public static void main(String[] args) {
        int a, b, n, num;
         JOptionPane.showMessageDialog(null,"Partamos un numero en 2 sumandos", "Bienvenido", 1 );
	do {
                 num = Integer.parseInt(JOptionPane.showInputDialog (null, "Ingrese el numero:","Insertar" , 3));
		if (num<0) {
                    JOptionPane.showMessageDialog(null,"Por favor ingrese un numero positivo", "Error", 2 );
		}
	} while (num<0);
	n = num;
	if (n%2>0) {
		n = n+1;
		a = n/2;
		b = a-1;
	} else {
		a = n/2;
		b = n/2;
	}
                String mensaje = "Los dos sumandos que";
                mensaje += ("\nconforman el numero: " +num );
                mensaje += ("\nCon producto maximo son: " + a + " y " + b);
                JOptionPane.showMessageDialog(null, mensaje,  "Resultado", 1);
    }
}
